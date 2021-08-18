package org.example.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck() {
    }

    public abstract void display(); //抽象方法
    public void performFly(){ //实例方法
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
}
