package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/12
 */
public class Duckcall {

    QuackBehavior quackBehavior;

    public Duckcall() {
        quackBehavior = new Quack();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
