package main;

import Packages.TravelPackage;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Builder builder = new Builder();

        // Створення туристичного пакету
        controller.createTravelPackage(builder);

        // Отримання туристичного пакету
        TravelPackage travelPackage = builder.getTravelPackage();
        System.out.println("Created Travel Package: " + travelPackage);

        // Бронювання туристичного пакету
        controller.bookTravelPackege(travelPackage);
    }
}