package com.cargo.upload_car.entity;

import java.util.Objects;

public class Car extends BaseEntity {

    private static final long serialVersionUID = 5570055010759909910L;

    private Integer cid;//对应数据库id

    private String start_address;    //	起始地详情
    private String end_address;    //	目的地详情
    private String remark;    //	任务备注
    private String start_id;    //	起始地区县的adcode :临沂371300 兰山371302 罗庄371311
    private String end_id;    //	目的地区县的adcode 济南历下区的370102
    private String start_lng;    //	起始地经度
    private String start_lat;    //	起始地纬度
    private String end_lng;    //	目的地经度
    private String end_lat;    //	目的地纬度
    private String is_use_enum;    //	//否常出任务:0=非,1=//
    private String car_model;    //	车型 ：20
    private String car_length;    //	车长 ：21
    private String car_type;    //	用车类型1:整车2零担
    private String weight_min;    //	重量最小值:数值
    private String weight_max;    //	重量最大值:数值
    private String volume_min;    //	体积最小值:数值
    private String volume_max;    //	体积最大值:数值
    private String goods_name;    //	货物名称
    private String starttime;    //	装货时间时间戳：时间戳
    private String load_of;    //	装货方式
    private String task_price;    //	货物运费：数值
    private String is_visible;    //	同城货主可不可见：0可见1不可见
    private String vip_phone;       //是 货主手机号
    private String vip_username;   //是 货主昵称     睿姐，这是新加的两个参数

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getVip_phone() {
        return vip_phone;
    }

    public void setVip_phone(String vip_phone) {
        this.vip_phone = vip_phone;
    }

    public String getVip_username() {
        return vip_username;
    }

    public void setVip_username(String vip_username) {
        this.vip_username = vip_username;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStart_id() {
        return start_id;
    }

    public void setStart_id(String start_id) {
        this.start_id = start_id;
    }

    public String getEnd_id() {
        return end_id;
    }

    public void setEnd_id(String end_id) {
        this.end_id = end_id;
    }

    public String getStart_lng() {
        return start_lng;
    }

    public void setStart_lng(String start_lng) {
        this.start_lng = start_lng;
    }

    public String getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(String start_lat) {
        this.start_lat = start_lat;
    }

    public String getEnd_lng() {
        return end_lng;
    }

    public void setEnd_lng(String end_lng) {
        this.end_lng = end_lng;
    }

    public String getEnd_lat() {
        return end_lat;
    }

    public void setEnd_lat(String end_lat) {
        this.end_lat = end_lat;
    }

    public String getIs_use_enum() {
        return is_use_enum;
    }

    public void setIs_use_enum(String is_use_enum) {
        this.is_use_enum = is_use_enum;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_length() {
        return car_length;
    }

    public void setCar_length(String car_length) {
        this.car_length = car_length;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getWeight_min() {
        return weight_min;
    }

    public void setWeight_min(String weight_min) {
        this.weight_min = weight_min;
    }

    public String getWeight_max() {
        return weight_max;
    }

    public void setWeight_max(String weight_max) {
        this.weight_max = weight_max;
    }

    public String getVolume_min() {
        return volume_min;
    }

    public void setVolume_min(String volume_min) {
        this.volume_min = volume_min;
    }

    public String getVolume_max() {
        return volume_max;
    }

    public void setVolume_max(String volume_max) {
        this.volume_max = volume_max;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getLoad_of() {
        return load_of;
    }

    public void setLoad_of(String load_of) {
        this.load_of = load_of;
    }

    public String getTask_price() {
        return task_price;
    }

    public void setTask_price(String task_price) {
        this.task_price = task_price;
    }

    public String getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(String is_visible) {
        this.is_visible = is_visible;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", start_address='" + start_address + '\'' +
                ", end_address='" + end_address + '\'' +
                ", remark='" + remark + '\'' +
                ", start_id='" + start_id + '\'' +
                ", end_id='" + end_id + '\'' +
                ", start_lng='" + start_lng + '\'' +
                ", start_lat='" + start_lat + '\'' +
                ", end_lng='" + end_lng + '\'' +
                ", end_lat='" + end_lat + '\'' +
                ", is_use_enum='" + is_use_enum + '\'' +
                ", car_model='" + car_model + '\'' +
                ", car_length='" + car_length + '\'' +
                ", car_type='" + car_type + '\'' +
                ", weight_min='" + weight_min + '\'' +
                ", weight_max='" + weight_max + '\'' +
                ", volume_min='" + volume_min + '\'' +
                ", volume_max='" + volume_max + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", starttime='" + starttime + '\'' +
                ", load_of='" + load_of + '\'' +
                ", task_price='" + task_price + '\'' +
                ", is_visible='" + is_visible + '\'' +
                ", vip_phone='" + vip_phone + '\'' +
                ", vip_username='" + vip_username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(cid, car.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid);
    }
}




