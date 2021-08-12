package com.tinyiko;

public class ContactDetails {
    private  String name;
    private String phoneNumber;

    public ContactDetails(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ContactDetails() {
        this.name = "unknown";
        this.phoneNumber = "no phoneNumber";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
