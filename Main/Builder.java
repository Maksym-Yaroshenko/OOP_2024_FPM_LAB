public class Builder {
    private TravelPackege travelPackege;

    public Builder() {
        this.travelPackege = new TravelPackege();
    }

    // Можливо знадобиться функція reset!
    public void addFlight(String id, String road, String name, String surname, String phoneNumber) {
        System.out.println(name);
    }

    public void addHotel(String name, String surname, String phoneNumber, String dateOfStay, String numberOfPeople) {

    }

    public void addExcursion(String name, String phoneNumber, String excursionDate) {

    }

    public TravelPackege getTravelPackege() {
        return travelPackege;
    }

}
