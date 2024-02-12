package org.example;

public class order {

    int orderNo;
    String orderTitle;
    String orderDescription;
    int orderQuantity;
    int totalPrice;

    public order() {
    }

    public order(int orderNo, String orderTitle, String orderDescription, int orderQuantity, int totalPrice) {
        this.orderNo = orderNo;
        this.orderTitle = orderTitle;
        this.orderDescription = orderDescription;
        this.orderQuantity = orderQuantity;
        this.totalPrice = totalPrice;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
