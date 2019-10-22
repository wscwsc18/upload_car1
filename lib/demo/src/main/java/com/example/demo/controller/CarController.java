package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("upload")
public class CarController {

    @RequestMapping("cars")
    public String getCars(String queryJson, String request_id, String date, String appid, String sign) {
        System.err.println("request_id:" + request_id);
        System.err.println("date:" + date);
        System.err.println("appid:" + appid);
        System.err.println("sign:" + sign);
        System.err.println("JSON:" + queryJson);
        return "1";
    }

}
//JSON:{"car_length":"21","car_model":"20","car_type":"整车","end_address":"沈阳","end_id":"024",
// "end_lng":"321","goods_name":"煤","is_use_enum":1,"load_of":"321332","remark":"我是备注",
// "start_address":"鞍山","start_id":"0412","start_lng":"123","starttime":"Fri Oct 18 13:28:29 CST 2019",
// "task_price":"13213321","volume_max":"20000","volume_min":"2000","weight_max":"10000","weight_min":"1000"}
// ,{"car_length":"21","car_model":"20","car_type":"整车","end_address":"沈阳","end_id":"024","end_lng":"321",
// "goods_name":"煤","is_use_enum":1,"load_of":"321332","remark":"我是备注","start_address":"鞍山","start_id":"0412",
// "start_lng":"123","starttime":"Fri Oct 18 13:28:29 CST 2019","task_price":"13213321","volume_max":"20000",
// "volume_min":"2000","weight_max":"10000","weight_min":"1000"}
