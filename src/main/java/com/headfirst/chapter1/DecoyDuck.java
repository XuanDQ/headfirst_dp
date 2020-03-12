package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/11
 * 诱饵鸭：不会叫不会飞
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭子的长相");
    }
}
