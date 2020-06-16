package edu.lingnan.eattingwhat2.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (Ordering)实体类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Component
public class Ordering implements Serializable {
    private static final long serialVersionUID = -34336614131809247L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer delivererId;
    
    private Integer storeId;
    
    private Date startTime;
    
    private String address;
    
    private Integer orderingState;
    
    private Date endTime;
    
    private Object priceSum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(Integer delivererId) {
        this.delivererId = delivererId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOrderingState() {
        return orderingState;
    }

    public void setOrderingState(Integer orderingState) {
        this.orderingState = orderingState;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Object getPriceSum() {
        return priceSum;
    }

    public void setPriceSum(Object priceSum) {
        this.priceSum = priceSum;
    }

}