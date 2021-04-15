package com.example.miniproject;

public class model {
    String config,name,old,price,phone,ram;

    public model() {
    }

    public model(String config, String name, String old, String price, String phone, String ram) {
        this.config = config;
        this.name = name;
        this.old = old;
        this.price = price;
        this.phone = phone;
        this.ram = ram;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
