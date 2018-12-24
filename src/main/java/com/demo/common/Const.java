package com.demo.common;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-11-28 20:29
 **/
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String USERNAME="username";

    public interface RedisCacheExtime{
        int REDIS_SESSION_EXTIME=60*30;//30分钟
    }
}
