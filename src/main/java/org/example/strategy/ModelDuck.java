package org.example.strategy;

//模型鸭
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();//模型鸭会叫
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
