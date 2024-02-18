package org.example;

public class PaidSpotVariable {
    int serialNo;
    String spotName;
    String included;

    public PaidSpotVariable() {
    }

    public PaidSpotVariable(int serialNo, String spotName, String included) {
        this.serialNo = serialNo;
        this.spotName = spotName;
        this.included = included;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public String getIncluded() {
        return included;
    }

    public void setIncluded(String included) {
        this.included = included;
    }
}
