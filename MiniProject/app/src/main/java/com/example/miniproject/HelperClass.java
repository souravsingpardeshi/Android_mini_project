package com.example.miniproject;

public class HelperClass {
    String Name,config,Ram,Price,Old,Phone;

    public HelperClass() {
    }

    public HelperClass(String name, String config, String ram, String price, String old, String phone) {
        Name = name;
        this.config = config;
        Ram = ram;
        Price = price;
        Old = old;
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getOld() {
        return Old;
    }

    public void setOld(String old) {
        Old = old;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
