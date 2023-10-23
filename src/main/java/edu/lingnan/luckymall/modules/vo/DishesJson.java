package edu.lingnan.luckymall.modules.vo;

public class DishesJson {

    private String storeId;

    private String customerId;

    private String dishesPrice;

    private String dishesId;

    private String dishesNmb;

    private String dishesName;

    public DishesJson() {
    }

    public DishesJson(String storeId, String customerId, String dishesPrice, String dishesId, String dishesNmb, String dishesName) {
        this.storeId = storeId;
        this.customerId = customerId;
        this.dishesPrice = dishesPrice;
        this.dishesId = dishesId;
        this.dishesNmb = dishesNmb;
        this.dishesName = dishesName;
    }

    @Override
    public String toString() {
        return "DishesJson{" +
                "storeId='" + storeId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", dishesPrice='" + dishesPrice + '\'' +
                ", dishesId='" + dishesId + '\'' +
                ", dishesNmb='" + dishesNmb + '\'' +
                ", dishesName='" + dishesName + '\'' +
                '}';
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }


    public String getDishesPrice() {
        return dishesPrice;
    }

    public void setDishesPrice(String dishesPrice) {
        this.dishesPrice = dishesPrice;
    }

    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    public String getDishesNmb() {
        return dishesNmb;
    }

    public void setDishesNmb(String dishesNmb) {
        this.dishesNmb = dishesNmb;
    }
}
