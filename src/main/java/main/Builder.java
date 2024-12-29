package main;

import Packages.TravelPackage;

public class Builder {
    private TravelPackage travelPackage;

    public Builder() {
        this.travelPackage = new TravelPackage();
    }

    // Можливо знадобиться функція reset!
    public void addFlight(String id, String route, String name, String surname, String phoneNumber) {
        System.out.println(name);
    }

    public void addHotel(String name, String surname, String phoneNumber, String dateOfStay, String numberOfPeople) {

    }

    public void addExcursion(String name, String phoneNumber, String excursionDate) {

    }

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }

}
