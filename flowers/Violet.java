package flowers;

public class Violet extends Flower {
    public Violet(double price, int freshness, double stemLength) {
        super("Violet", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
