package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/11
 *
 */
public abstract class Duck {

    // 实例变量在运行时持有特定行为的引用
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();

    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public abstract void display();
}
