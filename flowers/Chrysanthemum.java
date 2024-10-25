package flowers;

public class Chrysanthemum extends Flower {
    public Chrysanthemum(double price, int freshness, double stemLength) {
        super("Chrysanthemum", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
