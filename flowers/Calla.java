package flowers;

public class Calla extends Flower {
    public Calla(double price, int freshness, double stemLength) {
        super("Calla", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
