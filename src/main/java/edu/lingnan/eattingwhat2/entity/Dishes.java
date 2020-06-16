package edu.lingnan.eattingwhat2.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Dishes)实体类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */

@Component
public class Dishes implements Serializable {
    private static final long serialVersionUID = 131252841058977486L;
    
    private Integer id;
    /**
    * 商店id
    */
    private Integer storeId;
    
    private String name;
    
    private Object price;
    
    private String describle;
    
    private String image;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}