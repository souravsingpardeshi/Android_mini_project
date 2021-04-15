package com.example.miniproject;

public class HelperClass {
    String Name,Phone,Price,Ram,config,old;

    public HelperClass() {
    }

    public HelperClass(String name, String phone, String price, String ram, String config, String old) {
        Name = name;
        Phone = phone;
        Price = price;
        Ram = ram;
        this.config = config;
        this.old = old;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getOther() {
        return Price;
    }

    public void setOther(String price) {
        Price = price;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}
