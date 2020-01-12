package com.cargo.upload_car.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Demo
 *
 * @blame Android Team
 */
@Data
@Entity
//@Table(name = "demo", schema = "smsinfo150")
@Table(name = "demo")
public class Demo {
    //@Id
    @Id
    //@GeneratedValue(generator = "system-uuid")
    //@GeneratedValue(generator="\"JDBC\"")
    //、@GeneratedValue(strategy=GenerationType.IDENTITY,generator="mssql")
    //@GenericGenerator(name = "system-uuid", strategy = "uuid")
    ///@GeneratedValue(strategy=GenerationType.IDENTITY[generator="Mysql"])
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(insertable = false,name = "id")
    //@GeneratedValue(generator = "JDBC")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(insertable = false,name = "ID", unique = true, nullable = false, length = 32)
    private Integer id;


    @Column(name = "name", unique = false, nullable = true, length = 32)
    private String name;//姓名
    private String birth;//出生
    private String surplus;//剩余

    //@GeneratedValue(generator = "system-uuid")
    @Column(name = "uuuxxx", unique = false, nullable = true, length = 150)
    private String uuuxxx;

    @Transient
    private String sxxx="测试   不进入数据库的";

}
