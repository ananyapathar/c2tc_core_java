package com.tns.inheritance.multilevel;

public class Country {
    private String countryName;
    private String aadharno;

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAadharno() {
        return aadharno;
    }
    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    @Override
    public String toString() {
        return "Country Name: " + countryName + ", Aadhar No: " + aadharno;
    }
}
