package com.example.demo.entity;

import java.sql.Date;

public class Phone {
    private int id;
    private String phone_number;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
