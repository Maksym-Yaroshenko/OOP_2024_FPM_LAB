package main;

import Packages.TravelPackage;
import Utils.BookingController;

public class Controller {
    private BookingController bookingController;

    public Controller() {
        this.bookingController = new BookingController();
    }

    public void createTravelPackage(Builder builder) {
        builder.addFlight("BM960", "Kyiv - Lviv", "Maksym", "Yaroshenko", "+380960981122");
        builder.addHotel("Maksym", "Yaroshenko", "+380960981122", "04.07.2025 - 11.07.2025", "2");
        builder.addExcursion("Maksym", "+380960981122", "06.07.2025");
    }

    public void bookTravelPackege(TravelPackage travelPackege) {
        System.out.println("bookTravelPackege start");
        bookingController.bookTravelPackage(travelPackege);
        System.out.println("bookTravelPackege end");

    }
}
