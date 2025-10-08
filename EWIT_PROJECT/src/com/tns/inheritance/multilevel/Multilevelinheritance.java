package com.tns.inheritance.multilevel;

public class Multilevelinheritance {
    public static void main(String[] args) {
        City obj = new City();

        obj.setCountryName("India");
        obj.setAadharno("A0123456");
        obj.setStateName("Karnataka");
        obj.setName("Bengaluru");
        obj.setLocality("Banashankari");

        System.out.println(obj);
    }
}
