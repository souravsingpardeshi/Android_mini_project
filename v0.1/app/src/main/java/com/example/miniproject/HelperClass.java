package com.example.miniproject;

public class HelperClass {
    String Name,Phone,Other,Ram,config,old;

    public HelperClass() {
    }

    public HelperClass(String name, String phone, String other, String ram, String config, String old) {
        Name = name;
        Phone = phone;
        Other = other;
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
        return Other;
    }

    public void setOther(String other) {
        Other = other;
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
