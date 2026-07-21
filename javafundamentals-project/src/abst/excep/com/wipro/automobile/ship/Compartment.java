package com.wipro.automobile.ship;

public class Compartment {
    private double height;
    private double width;
    private double breadth;

    public Compartment(double h, double w, double b) {
        height = h;
        width = w;
        breadth = b;
    }

    public String toString() {
        return height + "x" + width + "x" + breadth;
    }
}
