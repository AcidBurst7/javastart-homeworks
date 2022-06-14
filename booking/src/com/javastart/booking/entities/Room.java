package com.javastart.booking.entities;

public class Room {

    private int numberOfPerson;
    private int cost;
    private boolean isFree;

    public Room(int numberOfPerson, int cost, boolean isFree) {
        this.numberOfPerson = numberOfPerson;
        this.cost = cost;
        this.isFree = isFree;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
