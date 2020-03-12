package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/12
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
