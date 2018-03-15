package com.bizvane.ishop.entity;

import java.util.Date;

/**
 * Created by Administrator on 2016/5/19.
 */
public class Corp {
    private int id;
    //企业编号
    private String corp_code;
    //企业名称
    private String corp_name;
    //地址
    private String address;
    //联系人
    private String contact;
    //联系电话
    private String contact_phone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorp_code() {
        return corp_code;
    }

    public void setCorp_code(String corp_code) {
        this.corp_code = corp_code;
    }

    public String getCorp_name() {
        return corp_name;
    }

    public void setCorp_name(String corp_name) {
        this.corp_name = corp_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

}
