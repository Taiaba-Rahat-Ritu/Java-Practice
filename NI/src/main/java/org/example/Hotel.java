package org.example;

public class Hotel {
    int night;
    String hotelName;
    String room;
    String remarks;

    public Hotel() {
    }

    public Hotel(int night, String hotelName, String room, String remarks) {
        this.night = night;
        this.hotelName = hotelName;
        this.room = room;
        this.remarks = remarks;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
