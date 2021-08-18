package org.example.strategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am fly with a rocket");
    }
}
