package edu.lingnan.luckymall.modules.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (Store)实体类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Component
public class Store implements Serializable {
    private static final long serialVersionUID = -71229505851378594L;

    private Integer id;

    private String name;

    private String password;

    private String phone;

    private String address;

    private Date regDate;

    private Date lastLoginDate;

    private Integer ssuper;

    private Integer monthlySales;

    private Object storeMark;

    private Integer storeState;

    private String describle;

    private String logo;

    private String storefront;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getSsuper() {
        return ssuper;
    }

    public void setSsuper(Integer ssuper) {
        this.ssuper = ssuper;
    }

    public Integer getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    public Object getStoreMark() {
        return storeMark;
    }

    public void setStoreMark(Object storeMark) {
        this.storeMark = storeMark;
    }

    public Integer getStoreState() {
        return storeState;
    }

    public void setStoreState(Integer storeState) {
        this.storeState = storeState;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = storefront;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", regDate=" + regDate +
                ", lastLoginDate=" + lastLoginDate +
                ", ssuper=" + ssuper +
                ", monthlySales=" + monthlySales +
                ", storeMark=" + storeMark +
                ", storeState=" + storeState +
                ", describle='" + describle + '\'' +
                ", logo='" + logo + '\'' +
                ", storefront='" + storefront + '\'' +
                '}';
    }
}