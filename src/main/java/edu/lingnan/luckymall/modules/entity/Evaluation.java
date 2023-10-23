package edu.lingnan.luckymall.modules.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (Evaluation)实体类
 *
 * @author makejava
 * @since 2020-06-18 11:29:27
 */
@Component
public class Evaluation implements Serializable {
    private static final long serialVersionUID = 847168913093645055L;
    
    private Integer id;
    
    private Integer anonymity;
    
    private Integer customerId;
    
    private String customerImage;
    
    private String customerName;
    
    private Integer orderingId;
    
    private Integer storeId;
    
    private Date date;
    
    private Integer score;
    
    private String evaluation;
    
    private String image1;
    
    private String image2;
    
    private String image3;
    
    private String image4;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(Integer anonymity) {
        this.anonymity = anonymity;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(String customerImage) {
        this.customerImage = customerImage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getOrderingId() {
        return orderingId;
    }

    public void setOrderingId(Integer orderingId) {
        this.orderingId = orderingId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

}