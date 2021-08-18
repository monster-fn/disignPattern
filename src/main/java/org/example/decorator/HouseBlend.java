package org.example.decorator;

public class HouseBlend extends Beverage {//综合

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
