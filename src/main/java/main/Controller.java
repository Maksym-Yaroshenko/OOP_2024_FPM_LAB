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
        builder.addHotel("Utopia World", "04.06.2025", "11.06.2025", "Maksym", "Yaroshenko", "+380960981122", 2);
        builder.addExcursion("Cappadocia", "06.07.2025", "+380960981122");
    }

    public void bookTravelPackege(TravelPackage travelPackege) {
        System.out.println("Start booking a tourist package");
        bookingController.bookTravelPackage(travelPackege);
        System.out.println("End booking a tourist package");

    }
}
