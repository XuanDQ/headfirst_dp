package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/12
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("一只模型鸭子");
    }
}
