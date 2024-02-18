package org.example;

public class PackageVariable {
    String packageName = "Cox's Bazar";
    int noOfGuest = 2;
    int freeNoOfChild = 2;
    int maxChildAge = 5;
    String reportingPlace = "Dhaka";
    String reportingTime = "10:00 AM";

    public PackageVariable() {
    }

    public PackageVariable(String packageName, int noOfGuest, int freeNoOfChild, int maxChildAge, String reportingPlace, String reportingTime) {
        this.packageName = packageName;
        this.noOfGuest = noOfGuest;
        this.freeNoOfChild = freeNoOfChild;
        this.maxChildAge = maxChildAge;
        this.reportingPlace = reportingPlace;
        this.reportingTime = reportingTime;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getNoOfGuest() {
        return noOfGuest;
    }

    public void setNoOfGuest(int noOfGuest) {
        this.noOfGuest = noOfGuest;
    }

    public int getFreeNoOfChild() {
        return freeNoOfChild;
    }

    public void setFreeNoOfChild(int freeNoOfChild) {
        this.freeNoOfChild = freeNoOfChild;
    }

    public int getMaxChildAge() {
        return maxChildAge;
    }

    public void setMaxChildAge(int maxChildAge) {
        this.maxChildAge = maxChildAge;
    }

    public String getReportingPlace() {
        return reportingPlace;
    }

    public void setReportingPlace(String reportingPlace) {
        this.reportingPlace = reportingPlace;
    }

    public String getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(String reportingTime) {
        this.reportingTime = reportingTime;
    }
}
