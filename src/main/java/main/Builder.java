package main;

import Packages.TravelPackage;

public class Builder {
    private TravelPackage travelPackage;

    public Builder() {
        this.travelPackage = new TravelPackage();
    }

    // Можливо знадобиться функція reset!
    public void addFlight(String id, String route, String name,
            String surname, String phoneNumber) {
        travelPackage.setFlightInformation("Flight ID: " + id + ", Route: " + route + ", Passenger: " + name + " "
                + surname + ", Contact: " + phoneNumber);
    }

    public void addHotel(String hotelName, String checkIn, String checkOut,
            String name, String surname, String phoneNumber,
            int numberOfPeople) {
        travelPackage.setHotelInformation(
                "Hotel: " + hotelName + ", Stay: " + checkIn + " - " + checkOut + ", Guests: " + numberOfPeople);

    }

    public void addExcursion(String excursionName, String excursionDate, String phoneNumber) {
        travelPackage
                .setExcursionInformation(
                        "Excursion: " + excursionName + ", Date: " + excursionDate + ", Contact: " + phoneNumber);

    }

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }

}
