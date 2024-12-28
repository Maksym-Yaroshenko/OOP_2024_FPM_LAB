public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Builder builder = new Builder();
        controller.createTravelPackege(builder);
        // get / set
        TravelPackege travelPackege = builder.createTravelPackege();
        System.out.println(travelPackege);
        controller.bookTravelPackege(travelPackege);
    }
}