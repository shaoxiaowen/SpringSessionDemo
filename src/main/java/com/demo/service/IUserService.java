package com.demo.service;

import com.demo.common.ServerResponse;
import com.demo.pojo.User;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-11-28 15:23
 **/
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
