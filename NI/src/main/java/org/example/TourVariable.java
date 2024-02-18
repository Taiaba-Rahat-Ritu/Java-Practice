package org.example;




public class TourVariable {
    String title = "Cox's Bazar";
    String description = "abc";
    String tourStartDate = "2024-02-20";
    String duration = "3 Days 2 Nights";

    public TourVariable() {
    }

    public TourVariable(String title, String description, String tourStartDate, String duration) {
        this.title = title;
        this.description = description;
        this.tourStartDate = tourStartDate;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTourStartDate() {
        return tourStartDate;
    }

    public void setTourStartDate(String tourStartDate) {
        this.tourStartDate = tourStartDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
