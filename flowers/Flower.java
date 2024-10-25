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
        return this.price;
    }

    public int getFreshness() {
        return this.freshness;
    }

    public double getStemLength() {
        return this.stemLength;
    }

    public String getName() {
        return "This is a flower: " + this.name;
    }
    
    public String getFullName() {
        return this.name;
    }




    // public void printFlower() {
    //     System.out.println("Rose");
    // }

    //     public void printTulip() {
    //     System.out.println("Tulip");
    // }
}
