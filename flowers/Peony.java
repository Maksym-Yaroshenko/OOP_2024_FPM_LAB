package flowers;

public class Peony extends Flower {
    public Peony(double price, int freshness, double stemLength) {
        super("Peony", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
