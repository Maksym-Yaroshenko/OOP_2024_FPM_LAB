package Utils;

import Packages.TravelPackage;

public class BookingController {
    public void bookPackage(TravelPackage travelPackege) {
        bookFlight(travelPackege.getFlightInformation());
    }

    public void bookTravelPackage(TravelPackage travelPackege) {
    }

    private void bookFlight(String flightInformation) {
        System.out.println(flightInformation);
    }
}
