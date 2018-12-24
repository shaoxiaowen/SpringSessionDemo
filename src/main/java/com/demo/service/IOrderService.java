package com.demo.service;

import com.demo.pojo.Order;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-12-21 14:42
 **/
public interface IOrderService {
    Order selectByUserId(int userId);
}
