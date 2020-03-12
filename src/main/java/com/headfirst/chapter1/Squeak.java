package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/12
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子吱吱叫");
    }
}
