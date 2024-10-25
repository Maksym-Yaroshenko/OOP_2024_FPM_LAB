package flowers;

public class Chamomile extends Flower {
    public Chamomile(double price, int fresshness, double stemLength) {
        super("Chamomile", price, fresshness, stemLength);
    }

    public void printName() {
        System.out.println(getName());
    }  
    
}
