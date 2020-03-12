package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/11
 * 绿头鸭
 */
public class MallardDuck  extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
