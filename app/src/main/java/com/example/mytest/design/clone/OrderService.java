package com.example.mytest.design.clone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liuy
 */
public class OrderService {

    public static List<AbsOrder> getOrder(AbsOrder order) throws Exception {
        List<AbsOrder> orderList = new ArrayList<>();
        AbsOrder newOrder = null;

        while (order.getOrderNumber() > 100){
            newOrder = order.clone();
            newOrder.setOrderNumber(100);

            orderList.add(newOrder);
            order.setOrderNumber(order.getOrderNumber() - 100);
        }
        orderList.add(order);

        return orderList;
    }
}
