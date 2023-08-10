package edu.lingnan.eattingwhat.vo;



import edu.lingnan.eattingwhat.entity.Ordering;

import java.io.Serializable;
import java.util.List;

//这个类用于把后端的数据传输数据到ordering_check.jsp页面
public class OrderingWithDishes extends Ordering implements Serializable {
    private List<OrderingDishesInfo> OrderingDishesInfoList;
    private String storeName;

    public OrderingWithDishes() {
    }

    public OrderingWithDishes(List<OrderingDishesInfo> orderingDishesInfoList, String storeName) {
        OrderingDishesInfoList = orderingDishesInfoList;
        this.storeName = storeName;
    }

    public List<OrderingDishesInfo> getOrderingDishesInfoList() {
        return OrderingDishesInfoList;
    }

    public void setOrderingDishesInfoList(List<OrderingDishesInfo> orderingDishesInfoList) {
        OrderingDishesInfoList = orderingDishesInfoList;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
