package com.cargo.upload_car;

import org.junit.Test;


public class cdTest {
    @Test
    public void testcode() {
         String s="123450";
        char C=s.charAt(5);
        if (s.endsWith("0")) {
            s=s.substring(0,5)+"3";
        };



        s=s+"XYz";

        System.out.println(s);


    }



}
