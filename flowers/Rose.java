package flowers;

public class Rose extends Flower {
    public Rose(String name, double price, int freshness, double stemLength) {
        super("Rose", price, freshness, stemLength);
    }
    
    public void all() {
        System.out.println(getPrice());
        System.out.println(getFreshness());
        System.out.println(getStemLength());
        System.out.println(getDescription());
    }
}
