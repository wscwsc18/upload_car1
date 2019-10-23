package com.cargo.upload_car.Main;

import com.alibaba.fastjson.JSON;
import com.cargo.upload_car.entity.Car;
import com.cargo.upload_car.util.MD5Utils;
import com.cargo.upload_car.util.Send;

import java.util.*;

public class SendCarPost {
    public void sendCars(List<Car> car) {
        String JSONString = "";
        int request_id;//	必须参数
        Long timestamp = null;//timestamp	当前时间戳
        String appid = "th20190001a";//	应用唯一标识
        String sign = null;//	签名
        request_id = 1;

        timestamp = System.currentTimeMillis();
        System.err.println(timestamp);




        try {
            sign = appid + "&" + request_id + "&" + timestamp;
            System.err.println(sign);
            sign = MD5Utils.getMD5Str(sign);
            System.err.println(sign);
        } catch (Exception e) {
            e.printStackTrace();
        }



        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("request_id", Integer.toString(request_id));
        map.put("timestamp", Long.toString(timestamp));
        map.put("appid", appid);
        map.put("sign", sign);
        //    JSONString += "[";
        for (int i = 0; i < car.size(); i++) {
            if (i == car.size() - 1) {
                JSONString += JSON.toJSONString(car.get(i));
            } else {
                JSONString += JSON.toJSONString(car.get(i)) + ",";
            }
        }
        //     JSONString += "]";
        System.err.println(JSONString);
        map.put("data", JSONString);
        String result = Send.sendPost("http://daguolian.qdunzi.com/api/thirdparty/thirdPartySource", map);
        System.err.println(result);

    }

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Car car = new Car();
        car.setStart_address("鞍山");
        car.setEnd_address("沈阳");
        car.setRemark("12321");
        car.setStart_id("光明");
        car.setEnd_id("1");
        car.setStart_lng("321");
        car.setEnd_lng("321");
        car.setIs_use_enum("1");
        car.setCar_model("20");
        car.setCar_length("21");
        car.setCar_type("dfasf");
        car.setWeight_min("100");
        car.setWeight_max("1000");
        car.setVolume_min("200");
        car.setVolume_max("2000");
        car.setGoods_name("sadf");
        car.setStarttime(String.valueOf(new Date().getTime()));
        car.setLoad_of("大是大非");
        car.setTask_price("sadf");
        list.add(car);
        //需要可置换
//        car.setTask_price("13213321");
//        car.setLoad_of("321332");
//
//        list.add(car);
        SendCarPost sendCarPost = new SendCarPost();
        sendCarPost.sendCars(list);
    }

}
