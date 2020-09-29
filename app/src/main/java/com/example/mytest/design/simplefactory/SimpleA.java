package com.example.mytest.design.simplefactory;

/**
 * 简单工厂
 * @author liuy
 */
public class SimpleA implements InterSimpleView {
    @Override
    public int getType() {
        System.out.println("SimpleA");
        return 0;
    }

    @Override
    public void setInterType(int type) {
        System.out.println("SimpleA设置了---" + type);
    }
}
