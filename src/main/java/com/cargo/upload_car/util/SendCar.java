package com.cargo.upload_car.util;

import com.alibaba.fastjson.JSON;
import com.cargo.upload_car.entity.Car;
import com.cargo.upload_car.service.ex.NoRequest_idORTimestamp;

/**
 * 第三方货源接入
 */
public class SendCar {
    private String appid = "th20190001a";//	应用唯一标识

    private String request_id = null;//	必须参数
    private String JSONString = "";
    private String timestamp = null;//timestamp	当前时间戳
    private String sign = null;//	签名

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setSign() {
        if (this.request_id == null || this.timestamp == null) {
            try {
                throw new NoRequest_idORTimestamp("先加入Request_id和Timestamp");
            } catch (NoRequest_idORTimestamp noRequest_idORTimestamp) {
                noRequest_idORTimestamp.printStackTrace();
            }
            return;
        }
        sign = this.appid + "&" + this.request_id + "&" + this.timestamp;
        try {
            sign = MD5Utils.getMD5Str(sign);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getRequest_id() {
        return request_id;
    }

    public String getJSONString() {
        return JSONString;
    }

    public void setJSONString(String JSONString) {
        this.JSONString = JSONString;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setJSONString(Car car) {
        this.JSONString = JSON.toJSONString(car);
    }
}
