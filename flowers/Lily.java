package flowers;

public class Lily extends Flower {
    public Lily(double price, int freshness, double stemLength) {
        super("Lily", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
