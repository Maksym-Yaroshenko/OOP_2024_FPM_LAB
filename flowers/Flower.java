package flowers;

public class Flower {

   private String name;
   private double price; 
   private int freshness;
   private double stemLength;

   
    public Flower(String name, double price, int freshness, double stemLength) {
        this.name = name;
        this.price = price;
        this.freshness = freshness;
        this.stemLength = stemLength;
    }
    
    public double getPrice() {
        return price;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public String getDescription() {
        return "This is a flower: " + name;
    }

    // public void printFlower() {
    //     System.out.println("Rose");
    // }

    //     public void printTulip() {
    //     System.out.println("Tulip");
    // }
}
