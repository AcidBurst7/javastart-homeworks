package com.javastart.banksystem.entity;

public class Person {
    private String firstname;
    private String surname;
    private String phone;

    public Person(String firstname, String surname, String phone) {
        this.firstname = firstname;
        this.surname = surname;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
