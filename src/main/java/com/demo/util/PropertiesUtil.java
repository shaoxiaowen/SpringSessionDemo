package com.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-11-29 14:17
 **/
@Slf4j
public class PropertiesUtil {

    private static Properties props;

    //加载properties文件
    static {
        String filename="datasource.properties";
        props=new Properties();
        try {
            props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(filename),"UTF-8"));
        }catch (IOException e){
            log.error("配置文件读取异常",e);
        }
    }

    public static String getProperty(String key){
        String value=props.getProperty(key);
        if(StringUtils.isBlank(value)){
            return null;
        }
        return value.trim();
    }

    public static String getProperty(String key,String defaultValue){
        String value=props.getProperty(key.trim());
        if(StringUtils.isBlank(value)){
            return null;
        }
        return value.trim();
    }
}
