package org.example.decorator;

public class Soy extends CondimentDecorator {//豆浆
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy ";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
