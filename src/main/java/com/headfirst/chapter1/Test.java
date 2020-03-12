package com.headfirst.chapter1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/12
 */
public class Test {
    public static void main(String[] args) {
        Duckcall duckcall = new Duckcall();
        duckcall.performQuack();
    }


    //v2
//    public static void main(String[] args) {
//        Duck model = new ModelDuck();
//        model.performQuack();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();
//    }


    //v1
//    public static void main(String[] args) {
//        Duck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();
//    }
}
