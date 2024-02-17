package org.example;




public class TourVariable {
    String tourStartDate = "2024-02-17";
    String tourReportingDate = "2024-02-20";
    String tourReportingTime = "10:00 AM";
    int quantity = 1;

    public TourVariable() {
    }

    public TourVariable(String tourStartDate, String tourReportingDate, String tourReportingTime, int quantity) {
        this.tourStartDate = tourStartDate;
        this.tourReportingDate = tourReportingDate;
        this.tourReportingTime = tourReportingTime;
        this.quantity = quantity;
    }

    public String getTourStartDate() {
        return tourStartDate;
    }

    public void setTourStartDate(String tourStartDate) {
        this.tourStartDate = tourStartDate;
    }

    public String getTourReportingDate() {
        return tourReportingDate;
    }

    public void setTourReportingDate(String tourReportingDate) {
        this.tourReportingDate = tourReportingDate;
    }

    public String getTourReportingTime() {
        return tourReportingTime;
    }

    public void setTourReportingTime(String tourReportingTime) {
        this.tourReportingTime = tourReportingTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
