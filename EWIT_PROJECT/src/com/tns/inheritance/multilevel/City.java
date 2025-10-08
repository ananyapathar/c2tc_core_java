package com.tns.inheritance.multilevel;

public class City extends State {
    private String name;
    private String locality;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return super.toString() + ", City Name: " + name + ", Locality: " + locality;
    }
}
