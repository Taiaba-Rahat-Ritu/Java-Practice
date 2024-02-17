package org.example;

public class Transport {
    int slotNumber;
    String route;
    String description;

    public Transport() {
    }

    public Transport(int slotNumber, String route, String description) {
        this.slotNumber = slotNumber;
        this.route = route;
        this.description = description;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
