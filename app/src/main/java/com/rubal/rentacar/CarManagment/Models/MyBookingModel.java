package com.subash.rentacar.CarManagement.Models;

public class MyBookingModel {
    private String CarTitle;
    private String RegistrationNo;
    private String UploadedBy;
    private String StartDate;
    private String EndDate;

    public MyBookingModel() {
    }

    public MyBookingModel(String carTitle, String registrationNo, String uploadedBy, String startDate, String endDate) {
        CarTitle = carTitle;
        RegistrationNo = registrationNo;
        UploadedBy = uploadedBy;
        StartDate = startDate;
        EndDate = endDate;
    }

    public String getCarTitle() {
        return CarTitle;
    }

    public void setCarTitle(String carTitle) {
        CarTitle = carTitle;
    }

    public String getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        RegistrationNo = registrationNo;
    }

    public String getUploadedBy() {
        return UploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        UploadedBy = uploadedBy;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }
}