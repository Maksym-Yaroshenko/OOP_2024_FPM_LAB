public class BookingController {
    public void bookPackage(TravelPackege travelPackege) {
        bookFlight(travelPackege.getFlightInformation());
    }

    private void bookFlight(String flightInformation) {
        System.out.println(flightInformation);
    }
}
