package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    public int getSpeed() { return 60; }
    public void radio() { System.out.println("Radio on"); }
    public String getModelName() { return "Hero"; }
    public String getRegistrationNumber() { return "HR123"; }
    public String getOwnerName() { return "Amit"; }
}
