package flowers;

public class Tulpan extends Flower {
    public Tulpan(double price, int fresshness, double stemLength) {
        super("Tulpan",price, fresshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    }  
    
}