package edu.lingnan.eattingwhat.vo;


import edu.lingnan.eattingwhat.entity.OrderingDishes;

import java.io.Serializable;

public class OrderingDishesInfo extends OrderingDishes implements Serializable {
    private String image;
    private String describle;

    public OrderingDishesInfo() {
        super();
    }

    public OrderingDishesInfo(String image, String describle) {
        this.image = image;
        this.describle = describle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    @Override
    public String toString() {
        return "OrderingDishesInfo{" +
                "image='" + image + '\'' +
                ", describle='" + describle + '\'' +
                '}';
    }
}
