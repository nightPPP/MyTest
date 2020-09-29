package com.example.mytest.design.simplefactory;

/**
 * 简单工厂
 * @author liuy
 */
public class SimpleB implements InterSimpleView {
    @Override
    public int getType() {
        System.out.println("SimpleB");
        return 1;
    }

    @Override
    public void setInterType(int type) {
        System.out.println("SimpleB设置了---" + type);
    }
}
