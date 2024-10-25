package flowers;

public class Rose extends Flower {
    public Rose(double price, int freshness, double stemLength) {
        super("Rose", price, freshness, stemLength);
    }

    // public void all() {
    //     System.out.println(getPrice());
    //     System.out.println(getFreshness());
    //     System.out.println(getStemLength());
    //     System.out.println(getName());
    // }

    public void printName() {
        System.out.println(getName());
    }  
        
}
