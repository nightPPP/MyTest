package com.example.mytest.design.clone;

import androidx.annotation.NonNull;

public abstract class AbsOrder implements Cloneable{

    @NonNull
    @Override
    protected AbsOrder clone() throws CloneNotSupportedException {
        return (AbsOrder) super.clone();
    }


    public abstract void setOrderNumber(int number);

    public abstract int getOrderNumber();
}
