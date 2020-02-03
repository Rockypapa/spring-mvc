package com.rocky.mall.bean;


import java.beans.Transient;

/**
 * @author Rocky
 * 用户表
 */
public class User {

    private Integer id;
    private String name;
    private String phoneNumber;
    private String address;
    private Integer age;

    private transient UserInfo uInfo;

    public UserInfo getUserInfo() {
        return uInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.uInfo = userInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
