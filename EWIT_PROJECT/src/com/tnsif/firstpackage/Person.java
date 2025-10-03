package com.tnsif.firstpackage;

public class Person {
    private String personName = "Ananya";
    private int personAge = 30;
    private String personCity = "Bangalore";

    // Getter & Setter for Name
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    // Getter & Setter for Age
    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    // Getter & Setter for City
    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + personName + ", Age: " + personAge + ", City: " + personCity);
    }
}
