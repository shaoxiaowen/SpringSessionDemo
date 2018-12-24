package com.demo.controller;

import com.demo.common.Const;
import com.demo.common.ServerResponse;
import com.demo.pojo.Order;
import com.demo.pojo.User;
import com.demo.service.IOrderService;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-11-28 14:54
 **/
@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private IOrderService iOrderService;
    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "login.do")
    @ResponseBody   //通过SpringMVC的Jaskson插件(在dispatcher-servlet.xml中配置) ，将返回值转换为Json给前台
    //获取sessionId
    public ServerResponse<User> login(String username, String password, HttpSession session) {
        ServerResponse<User> response = iUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }
        return response;
    }

    @RequestMapping(value = "getOrder_ByUserId.do")
    @ResponseBody
    public ServerResponse<Order> getOrderInfobyUserId(HttpSession session){
        User user= (User) session.getAttribute(Const.CURRENT_USER);
        if (user != null) {
            Order order = iOrderService.selectByUserId(user.getId());
            return ServerResponse.createBySuccess(order);
        }
        return ServerResponse.createByErrorMessage("用户未登录，无法获取当前用户的信息");
    }

    @RequestMapping(value = "logout.do")
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }
}

