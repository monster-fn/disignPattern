package org.example.decorator;

/**
 * 调料： 摩卡 豆浆 奶泡 牛奶
 * 必须重新实现getDescription（）方法
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
