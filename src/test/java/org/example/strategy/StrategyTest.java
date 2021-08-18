package org.example.strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void testStrategy(){
        Duck duck = new ModelDuck();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performQuack();
        duck.performFly();
        duck.display();
    }
}
