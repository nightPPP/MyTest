package com.example.mytest.design.simplefactory;

/**
 * 简单工厂--工厂类
 * @author liuy
 */
public class SimpleFactory {

    public static InterSimpleView getFacType(int type){
        InterSimpleView view;
        if (0 == type){
            view = new SimpleA();
        } else {
            view = new SimpleB();
        }
        return view;
    }
}
