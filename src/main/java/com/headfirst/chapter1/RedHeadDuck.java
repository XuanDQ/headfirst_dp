package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/11
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("外观是红头");
    }
}
