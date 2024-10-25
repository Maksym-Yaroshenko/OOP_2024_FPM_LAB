package accessories;

public class Bow extends Accessory {
    public Bow(double price) {
        super("Bow", price);
    }

    public void printName() {
        System.out.println(getName());
    }
    
}
