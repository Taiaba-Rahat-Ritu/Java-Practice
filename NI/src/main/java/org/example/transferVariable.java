package org.example;

public class transferVariable {
    int slotNumber;
    String route;
    String description;

    public transferVariable() {
    }

    public transferVariable(int slotNumber, String route, String description) {
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
