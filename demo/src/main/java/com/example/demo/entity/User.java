package com.example.demo.entity;

import java.sql.Date;
import java.util.List;

public class User {
    private int id;
    private String user_name;

    private List<Phone> phone_list; //电话号码，一个人可以有不同的电话号码
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public List<Phone> getPhone_list() {
        return phone_list;
    }
    public void setPhone_list(List<Phone> phone_list) {
        this.phone_list = phone_list;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ",user_name=" + user_name + "]";
    }

    public  static class Phone{

        private  String phone_number;
        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }
    }
    public User() {
    }

}
/*public class User {

    private int id;
    private String user_name;
    private String company_address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }






    @Override
    public String toString() {
        return "User [id=" + id + ", user_name=" + user_name + ", company_address=" + company_address + "]";
    }



}*/
