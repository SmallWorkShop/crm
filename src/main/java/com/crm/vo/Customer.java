package com.crm.vo;

import java.util.Date;

public class Customer {
    private Integer custId;

    private String carNo;

    private String brand;

    private String brandModel;

    private String carjiaNo;

    private String engineNo;

    private String idNo;

    private String custName;

    private String cusAddress;

    private String cusTel1;

    private String cusTel2;

    private Date fisrtDate;

    private Integer userId;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel == null ? null : brandModel.trim();
    }

    public String getCarjiaNo() {
        return carjiaNo;
    }

    public void setCarjiaNo(String carjiaNo) {
        this.carjiaNo = carjiaNo == null ? null : carjiaNo.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    public String getCusTel1() {
        return cusTel1;
    }

    public void setCusTel1(String cusTel1) {
        this.cusTel1 = cusTel1 == null ? null : cusTel1.trim();
    }

    public String getCusTel2() {
        return cusTel2;
    }

    public void setCusTel2(String cusTel2) {
        this.cusTel2 = cusTel2 == null ? null : cusTel2.trim();
    }

    public Date getFisrtDate() {
        return fisrtDate;
    }

    public void setFisrtDate(Date fisrtDate) {
        this.fisrtDate = fisrtDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}