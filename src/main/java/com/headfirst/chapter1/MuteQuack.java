package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/12
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不做，不会叫");
    }
}
