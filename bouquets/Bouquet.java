package bouquets;

import accessories.Accessory;
import flowers.Flower;

public class Bouquet {

    private Flower[] flowers;
    private Accessory[] accessories;
    // private int flowerCount = 0;
    private int flowerCount;
    private int accessoryCount;

    public Bouquet(int flowerAmount, int accessoryAmount) {
        this.flowers = new Flower[flowerAmount];
        this.accessories = new Accessory[accessoryAmount];
        // this.flowerCount = flowerAmount;
        this.flowerCount = 0;
        this.accessoryCount = 0;
    }

    public void addFlower(Flower flower) {
        if (flowerCount < flowers.length) {
            flowers[flowerCount] = flower;
            flowerCount++;
        } else {
            System.out.println("Bouquet is full");
        }

    }

    public void getFlowerNames() {
        System.out.print("Your bouquet contains: ");

        for (int i = 0; i < flowers.length; i++) {
            if (i < flowers.length - 1) {
                System.out.print(flowers[i].getFullName() + ", ");
            } else {
                System.out.print(flowers[i].getFullName() + ".");
            }
        }

        System.out.println("");
    }

    public void setAccessoryCount(int accessoryAmount) {
        this.accessories = new Accessory[accessoryAmount]; // Оновлюємо кількість аксесуарів
        this.accessoryCount = 0; // Скидаємо лічильник аксесуарів
    }

    public void addAccessory(Accessory accessory) {
        if (accessoryCount < accessories.length) {
            accessories[accessoryCount] = accessory;
            accessoryCount++;
        } else {
            System.out.println("Accessory is full");
        }
    }

    public void getAccessoryName() {
        System.out.print("Your chosen accessory contains: ");

        for (int i = 0; i < accessories.length; i++) {
            if (i < accessories.length - 1) {
                System.out.print(accessories[i].getName() + ", ");
            } else {
                System.out.print(accessories[i].getName() + ".");
            }
        }

        System.out.println("");
    }

    public double getPriceBouquet() {
        double total = 0;

        if (flowers != null) {
            for (Flower flower : flowers) {
                if (flower != null) {
                    total += flower.getPrice();
                }
            }
        } else {
            System.out.println("The bouquet is not yet assembled");
        }

        if (accessories != null) {
            for (Accessory accessory : accessories) {
                total += accessory.getPrice();
            }
        }
        // System.out.println(total);
        return total;
    }

    public void flowersWithTheRightLength(double minLength, double maxLength) {
        // Flower[] totalFlowers;
        for (Flower flower : flowers) {
            if (flower != null) {
                if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                    System.out.println(flower.getFullName() + " - " + "matches your request");
                    // totalFlowers.add(flower.getStemLength());
                } else {
                    System.out.println(flower.getFullName() + " - " + "unfortunately, it does not suit your request");
                }
            }
        }
    }

    public void sortedFlowers() {
        System.out.println("-----------------------------");

        for (Flower flower : flowers) {
            System.out.print(flower.getFullName() + " : " + flower.getFreshness() + "; ");
        }

        for (int i = 0; i < flowers.length - 1; i++) {
            for (int j = 0; j < flowers.length - i - 1; j++) {
                if (flowers[j].getFreshness() < flowers[j + 1].getFreshness()) {
                    Flower extra = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = extra;
                }
            }
        }

        System.out.println();
        System.out.println("-----------------------------");

        for (Flower flower : flowers) {
            System.out.print(flower.getFullName() + " : " + flower.getFreshness() + "; ");

        }

        System.out.println();
        System.out.println("-----------------------------");

    }

}
