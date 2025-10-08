package com.tns.inheritance;

public class Student extends Citizen {
    private long phno;
    private int rollno;
    private String collegename;

    // Constructor using super() to call Citizen constructor
    public Student(String name, String aadharno, String address, long phno, int rollno, String collegename) {
        super(name, aadharno, address);
        this.phno = phno;
        this.rollno = rollno;
        this.collegename = collegename;
    }

    public Student() {
        super("", "", "");
    }

    // Getters and Setters
    public long getPhno() {
        return phno;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCollegename() {
        return collegename;
    }
    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Phone Number: " + phno + 
               ", Roll No: " + rollno + 
               ", College Name: " + collegename;
    }
}
