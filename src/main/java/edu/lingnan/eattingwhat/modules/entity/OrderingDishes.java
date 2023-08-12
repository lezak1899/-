package edu.lingnan.eattingwhat.modules.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (OrderingDishes)实体类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Component
public class OrderingDishes implements Serializable {
    private static final long serialVersionUID = -63492618235189081L;
    
    private Integer id;
    
    private Integer orderingId;
    
    private Integer dishesId;
    
    private String dishesName;
    
    private Integer dishesCount;
    
    private Object dishesPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderingId() {
        return orderingId;
    }

    public void setOrderingId(Integer orderingId) {
        this.orderingId = orderingId;
    }

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public Integer getDishesCount() {
        return dishesCount;
    }

    public void setDishesCount(Integer dishesCount) {
        this.dishesCount = dishesCount;
    }

    public Object getDishesPrice() {
        return dishesPrice;
    }

    public void setDishesPrice(Object dishesPrice) {
        this.dishesPrice = dishesPrice;
    }

}