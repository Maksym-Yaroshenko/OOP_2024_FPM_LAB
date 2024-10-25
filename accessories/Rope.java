package accessories;

public class Rope extends Accessory {
    public Rope(double price) {
        super("Rope", price);
    }

    public void printName() {
        System.out.println(getName());
    }
    
}
