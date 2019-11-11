package com.org.spring.boot.service.model;

public class Contacts {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contacts(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
