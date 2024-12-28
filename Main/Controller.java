public class Controller {
    private BookingController bookingController;

    public Controller() {
        this.bookingController = new BookingController();
    }

    public void createTravelPackege(Builder builder) {
        builder.addFlight("BM960", "Kyiv - Lviv");
        builder.addHotel();
        builder.addExcursion();
    }

    public void bookTravelPackege(TravelPackege travelPackege) {
        System.out.println("bookTravelPackege start");
        bookingController.bookTravelPackege(travelPackege);
        System.out.println("bookTravelPackege end");

    }
}
