package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/11
 * 橡皮鸭：吱吱叫，不会飞
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("玩具橡皮鸭长什么样我就长什么样");
    }
}
