import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Packages.TravelPackage;
import main.Builder;

public class BuilderTest {

    @Test
    public void testAddFlight() {
        Builder builder = new Builder();
        builder.addFlight("BM960", "Kyiv - Lviv", "Maksym", "Yaroshenko", "+380960981122");
        TravelPackage travelPackage = builder.getTravelPackage();
        assertEquals("Flight ID: BM960, Route: Kyiv - Lviv, Passenger: Maksym Yaroshenko, Contact: +380960981122",
                travelPackage.getFlightInformation());
    }

    @Test
    public void testAddHotel() {
        Builder builder = new Builder();
        builder.addHotel("Utopia World", "04.06.2025", "11.06.2025", "Maksym", "Yaroshenko", "+380960981122", 2);
        TravelPackage travelPackage = builder.getTravelPackage();
        assertEquals("Name Hotel: Utopia World, Stay: 04.06.2025 - 11.06.2025, Guests: 2",
                travelPackage.getHotelInformation());
    }

    @Test
    public void testAddExcursion() {
        Builder builder = new Builder();
        builder.addExcursion("Cappadocia", "06.07.2025", "+380960981122");
        TravelPackage travelPackage = builder.getTravelPackage();
        assertEquals("Excursion: Cappadocia, Date: 06.07.2025, Contact: +380960981122",
                travelPackage.getExcursionInformation());
    }
}
