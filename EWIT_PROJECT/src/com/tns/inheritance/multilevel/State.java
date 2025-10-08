package com.tns.inheritance.multilevel;

public class State extends Country {
    private String stateName;

    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return super.toString() + ", State Name: " + stateName;
    }
}
