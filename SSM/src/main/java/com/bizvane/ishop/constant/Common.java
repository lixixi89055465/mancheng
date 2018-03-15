package com.bizvane.ishop.constant;

import java.text.SimpleDateFormat;

public class Common {

    //请求发送的类型失败
    public static final String DATABEAN_CODE_ERROR = "-1";
    //请求发送的类型成功
    public static final String DATABEAN_CODE_SUCCESS = "0";

    //是否可用（是）
    public static final String IS_ACTIVE_Y = "Y";
    //是否可用（否）
    public static final String IS_ACTIVE_N = "N";

    //时间格式
    public static final SimpleDateFormat DATETIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final SimpleDateFormat DATETIME_FORMAT_DAY = new SimpleDateFormat("yyyy-MM-dd");

    public static final SimpleDateFormat DATETIME_FORMAT_DAY_NO = new SimpleDateFormat("yyyyMMdd");

    public static final SimpleDateFormat DATETIME_FORMAT_DAY_NUM = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    //目标时间类型（日）
    public static final String TIME_TYPE_DAY = "D";
    //目标时间类型（周）
    public static final String TIME_TYPE_WEEK = "W";
    //目标时间类型（月）
    public static final String TIME_TYPE_MONTH = "M";
    //目标时间类型（年）
    public static final String TIME_TYPE_YEAR = "Y";

}
