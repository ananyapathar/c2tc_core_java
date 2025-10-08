package com.tns.inheritance;

public class Citizen {
    private String name;
    private String aadharnumb;
    private String address;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAadharnumb() {
        return aadharnumb;
    }
    public void setAadharnumb(String aadharnumb) {
        this.aadharnumb = aadharnumb;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Constructors
    public Citizen(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Citizen(String name, String aadharnumb, String address) {
        super();
        this.name = name;
        this.aadharnumb = aadharnumb;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Aadhar Number: " + aadharnumb + ", Address: " + address;
    }
}
