package com.rubal.rentacar.CarManagement.Models;


import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class CarModel {
    private String CarTitle;
    private String Brand;
    private String Image;
    private String Model;
    private String Price;
    private String RegistrationNo;
    private String OwnerNumber;
    private String UploadedBy;
    private String UploadedOn;


    public CarModel() {

    }

    public CarModel(String carTitle, String brand, String image, String model, String price, String registrationNo, String ownerNumber, String uploadedBy, String uploadedOn) {
        CarTitle = carTitle;
        Brand = brand;
        Image = image;
        Model = model;
        Price = price;
        RegistrationNo = registrationNo;
        OwnerNumber = ownerNumber;
        UploadedBy = uploadedBy;
        UploadedOn = uploadedOn;
    }

    public String getCarTitle() {
        return CarTitle;
    }

    public void setCarTitle(String carTitle) {
        CarTitle = carTitle;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        RegistrationNo = registrationNo;
    }

    public String getOwnerNumber() {
        return OwnerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        OwnerNumber = ownerNumber;
    }

    public String getUploadedBy() {
        return UploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        UploadedBy = uploadedBy;
    }

    public String getUploadedOn() {
        return UploadedOn;
    }

    public void setUploadedOn(String uploadedOn) {
        UploadedOn = uploadedOn;
    }
}