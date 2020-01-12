package com.cargo.upload_car.entity;

import java.util.Objects;

public class Trunck {

    private static final long serialVersionUID = 6916880876093508997L;

    private String   workid;


    private String   name ;
    private int    age  ;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Trunck{" +
                "workid='" + workid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trunck trunck = (Trunck) o;
        return workid.equals(trunck.workid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workid);
    }
}
