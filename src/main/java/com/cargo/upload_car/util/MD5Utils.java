package com.cargo.upload_car.util;

import org.springframework.util.DigestUtils;


public class MD5Utils {

    public static String getMD5Str(String strValue) throws Exception {
        return DigestUtils.md5DigestAsHex(strValue.getBytes("utf-8"));
    }

}