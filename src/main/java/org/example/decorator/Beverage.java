package org.example.decorator;

/**
 * 饮料：浓缩 综合
 */
public abstract class Beverage { //饮料
    String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
