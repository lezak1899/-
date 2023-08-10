package edu.lingnan.eattingwhat.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (Customer)实体类
 *
 * @author makejava
 * @since 2020-06-14 11:02:41
 */
@Component
public class Customer implements Serializable {
    private static final long serialVersionUID = -88032454583038656L;
    
    private Integer id;
    
    private String image;
    
    private String name;
    
    private String password;
    
    private String phone;
    
    private String address;
    
    private Date regDate;
    
    private Date lastLoginDate;
    
    private Integer ssuper;
    
    private Integer redpaper;
    
    private Date regMember;
    
    private Date pastMember;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Integer getRedpaper() {
        return redpaper;
    }

    public void setRedpaper(Integer redpaper) {
        this.redpaper = redpaper;
    }

    public Date getRegMember() {
        return regMember;
    }

    public void setRegMember(Date regMember) {
        this.regMember = regMember;
    }

    public Date getPastMember() {
        return pastMember;
    }

    public void setPastMember(Date pastMember) {
        this.pastMember = pastMember;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", regDate=" + regDate +
                ", lastLoginDate=" + lastLoginDate +
                ", ssuper=" + ssuper +
                ", redpaper=" + redpaper +
                ", regMember=" + regMember +
                ", pastMember=" + pastMember +
                '}';
    }
}