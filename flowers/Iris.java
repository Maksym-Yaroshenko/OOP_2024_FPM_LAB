package flowers;

public class Iris extends Flower {
    public Iris(double price, int freshness, double stemLength) {
        super("Iris", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
