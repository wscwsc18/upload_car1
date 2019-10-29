package com.cargo.upload_car.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class CarTest {
    @BeforeEach
    void setUp() {

    }


    private String sddddddd;

    public String getSddddddd() {
        return sddddddd;
    }

    public void setSddddddd(String sddddddd) {
        this.sddddddd = sddddddd;
    }

    @Test
void getStart_address() {
        System.err.println( getSddddddd() ) ;

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarTest carTest = (CarTest) o;
        return Objects.equals(sddddddd, carTest.sddddddd);
    }



    @Override
    public int hashCode() {
        return Objects.hash(sddddddd);
    }

    @Test
    void setStart_address() {

        setSddddddd("ssssssss");
        System.err.println(getSddddddd( )  );

    }


}

