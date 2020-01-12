package com.cargo.upload_car.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Hand
 *
 * @blame Android Team
 */
@Data
@Entity
@Table(name = "hand")
public class Hand extends BaseEntity {
    private static final long serialVersionUID = 3971173579567760237L;
    @Id
    @Column(insertable = true,name = "hand", unique = true, nullable = false, length = 16)
    private Integer hand;
    @Column(name = "Register", unique = false)
    private Byte Register;

    @Column(name = "Acttime", unique = false)
    private Date Acttime;

    @Transient
    private String Temp="测试   不进入数据库的";


}
