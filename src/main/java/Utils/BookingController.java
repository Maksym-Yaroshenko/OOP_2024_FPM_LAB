package Utils;

import Packages.TravelPackage;

public class BookingController {
    public void bookTravelPackage(TravelPackage travelPackage) {
        System.out.println("Booking flight: " + travelPackage.getFlightInformation());
        System.out.println("Booking hotel: " + travelPackage.getHotelInformation());
        System.out.println("Booking excursion: " + travelPackage.getExcursionInformation());
    }
}