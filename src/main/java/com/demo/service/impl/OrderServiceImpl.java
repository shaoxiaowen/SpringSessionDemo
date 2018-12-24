package com.demo.service.impl;

import com.demo.dao.OrderMapper;
import com.demo.pojo.Order;
import com.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-12-21 14:42
 **/
@Service("iOrderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    public Order selectByUserId(int userId) {
        return orderMapper.selectByUserId(userId);
    }
}
