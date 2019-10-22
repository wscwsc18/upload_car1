package com.cargo.upload_car.entity;

import java.util.Date;

public class HandSQL extends BaseEntity {
    private static final long serialVersionUID = 3971173579567760237L;

    private Integer hand;
    private Byte Register;
    private Date Acttime;



    public Integer getHand() {
        return hand;
    }

    public void setHand(Integer hand) {
        this.hand = hand;
    }

    public Byte getRegister() {
        return Register;
    }

    public void setRegister(Byte register) {
        Register = register;
    }

    public Date getActtime() {
        return Acttime;
    }

    public void setActtime(Date acttime) {
        Acttime = acttime;
    }

    @Override
    public String toString() {
        return "HandSQL{" +
                "hand=" + hand +
                ", Register=" + Register +
                ", Acttime=" + Acttime +
                '}';
    }

}
