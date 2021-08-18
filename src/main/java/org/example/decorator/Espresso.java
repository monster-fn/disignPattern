package org.example.decorator;

public class Espresso extends Beverage { //浓缩

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
