package com.automobile;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        Hero h = new Hero();
        Honda o = new Honda();
        Logan l = new Logan();
        Ford f = new Ford();
        System.out.println(h.getModelName());
        System.out.println(o.getModelName());
        System.out.println(l.getModelName());
        System.out.println(f.getModelName());
    }
}
