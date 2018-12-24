package com.demo.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * @description: TODO
 * @author: xiaowen
 * @create: 2018-12-02 10:50
 **/
public class DateTimeUtil {
    //joda-time

    //str-->Data
    //Data-->str

    public static final String STANDERD_FORMAT="yyyy-MM-dd HH:mm:ss";

    public static Date strToDate(String dataTimeStr, String formatStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dataTimeStr);
        return dateTime.toDate();
    }

    public static String DateToStr(Date date, String formatStr) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    public static Date strToDate(String dataTimeStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDERD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dataTimeStr);
        return dateTime.toDate();
    }

    public static String DateToStr(Date date) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDERD_FORMAT);
    }
    public static void main(String[] args) {
        System.out.println(DateTimeUtil.DateToStr(new Date(),STANDERD_FORMAT));
        System.out.println(DateTimeUtil.strToDate("2018-12-01 11:06:56",STANDERD_FORMAT));
    }
}
