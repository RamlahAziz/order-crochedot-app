package com.project.naima.project;

import com.project.naima.project.pojo.Order;

import java.io.Serializable;
import java.util.List;


/**
 * Created by Hammad on 1/7/2018.
 */

public class Data implements Serializable{

    private List<Order> allOrders;


    public List<Order> getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(List<Order> allOrders) {
        this.allOrders = allOrders;
    }


}
