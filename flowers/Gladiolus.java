package flowers;

public class Gladiolus extends Flower {
    public Gladiolus(double price, int freshness, double stemLength) {
        super("Gladiolus", price, freshness, stemLength);
    }

        public void printName() {
        System.out.println(getName());
    } 
}
