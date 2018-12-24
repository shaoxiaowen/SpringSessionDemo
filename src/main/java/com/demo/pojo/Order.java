package com.demo.pojo;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;

    private Long orderNo;

    private Integer userId;

    public Order(Integer id, Long orderNo, Integer userId) {
        this.id = id;
        this.orderNo = orderNo;
        this.userId = userId;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}