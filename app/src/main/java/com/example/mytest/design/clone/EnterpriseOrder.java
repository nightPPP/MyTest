package com.example.mytest.design.clone;

import androidx.annotation.NonNull;

public class EnterpriseOrder extends AbsOrder {
    private String orderName;
    private String orderCompany;
    private int orderNumber;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderCompany() {
        return orderCompany;
    }

    public void setOrderCompany(String orderCompany) {
        this.orderCompany = orderCompany;
    }

    @Override
    public void setOrderNumber(int number) {
        this.orderNumber = number;
    }

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "orderName='" + orderName + '\'' +
                ", orderCompany='" + orderCompany + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }

    @NonNull
    @Override
    protected AbsOrder clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
