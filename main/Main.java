package main;

import bouquets.Bouquet;

import accessories.*;
import flowers.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            // Calla flowerCalla = new Calla(40, 4, 36);
            // Chamomile flowerChamomile = new Chamomile(0, 10, 0);
            // Chrysanthemum flowerChrysanthemum = new Chrysanthemum(0, 4, 0);
            // Gladiolus flowerGladiolus = new Gladiolus(0, 3, 0);
            // Iris flowerIris = new Iris(0, 7, 0);
            // Lily flowerLily = new Lily(0, 9, 0);
            // Peony flowerPeony = new Peony(0, 10, 0);
            // Rose flowerRose = new Rose(50.5, 8, 60.0);
            // Tulpan flowerTulpan = new Tulpan(0, 6, 0);
            // Lily flowerViolet = new Lily(0, 5, 0);

            Flower[] flowers = {
                    new Calla(40, 4, 36),
                    new Chamomile(20, 10, 40),
                    new Chrysanthemum(25.5, 4, 55),
                    new Gladiolus(40, 3, 70),
                    new Iris(18, 7, 20),
                    new Lily(35, 9, 25),
                    new Peony(50, 10, 44),
                    new Rose(60.5, 8, 60),
                    new Tulpan(48, 6, 50),
                    new Lily(36, 5, 48),
            };

            Bow accessoryBow = new Bow(15);
            Rope accessoryRope = new Rope(5);

            Bouquet allFloversBouquet = new Bouquet(10, 0);

            for (Flower flower : flowers) {
                allFloversBouquet.addFlower(flower);
            }

            System.out.println("Welcome to our flower shop my lovely customer. What would you like to order?");

            int scanner1 = 0;

            while (scanner1 != 4) {
                System.out.println("1. Show the freshness of all flowers;");
                System.out.println("2. Display the flower length range that suits you;");
                System.out.println("3. Form a bouquet;");
                System.out.println("4. Quit the programe;");

                scanner1 = scanner.nextInt();
                switch (scanner1) {
                    case 1:
                        allFloversBouquet.sortedFlowers();
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter flower length range: ");
                        double scanner10 = scanner.nextDouble();
                        double scanner11 = scanner.nextDouble();

                        allFloversBouquet.flowersWithTheRightLength(scanner10, scanner11);
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("How many flowers do you want for your bouquet?");
                        int scanner2 = scanner.nextInt();

                        Bouquet bouquet = new Bouquet(scanner2, 0);

                        // System.out.println("What kind of flowers do you want for your bouquet?");
                        // System.out.println("Press \"1\" if you want to select Calla");
                        // System.out.println("Press \"2\" if you want to select Chamomile");
                        // System.out.println("Press \"3\" if you want to select Chrysanthemum");
                        // System.out.println("Press \"4\" if you want to select Gladiolus");
                        // System.out.println("Press \"5\" if you want to select Iris");
                        // System.out.println("Press \"6\" if you want to select Lily");
                        // System.out.println("Press \"7\" if you want to select Peony");
                        // System.out.println("Press \"8\" if you want to select Rose");
                        // System.out.println("Press \"9\" if you want to select Tulpan");
                        // System.out.println("Press \"10\" if you want to select Lily");

                        // for (int number = 0; number < scanner2; number++) {
                        // int scanner3 = scanner.nextInt();

                        // switch (scanner3) {
                        // case 1:
                        // bouquet.addFlower(flowers.flowerCalla);
                        // break;
                        // case 2:
                        // bouquet.addFlower(flowerChamomile);
                        // break;
                        // case 3:
                        // bouquet.addFlower(flowerChrysanthemum);
                        // break;
                        // case 4:
                        // bouquet.addFlower(flowerGladiolus);
                        // break;
                        // case 5:
                        // bouquet.addFlower(flowerIris);
                        // break;
                        // case 6:
                        // bouquet.addFlower(flowerLily);
                        // break;
                        // case 7:
                        // bouquet.addFlower(flowerPeony);
                        // break;
                        // case 8:
                        // bouquet.addFlower(flowerRose);
                        // break;
                        // case 9:
                        // bouquet.addFlower(flowerTulpan);
                        // break;
                        // case 10:
                        // bouquet.addFlower(flowerViolet);
                        // break;

                        // default:
                        // break;
                        // }
                        // }

                        // bouquet.getFlowerNames();

                        System.out.println("What kind of flowers do you want for your bouquet?");
                        for (int i = 0; i < flowers.length; i++) {
                            System.out.println("Press \"" + (i + 1) + "\" if you want to select "
                                    + flowers[i].getFullName());
                        }

                        for (int number = 0; number < scanner2; number++) {
                            boolean validChoice = false; // Індикатор правильності вибору

                            while (!validChoice) { // Цикл триватиме, доки не буде введено коректне значення
                                System.out.println("Please choose a flower (1 - " + flowers.length + "):");
                                int flowerChoice = scanner.nextInt();

                                if (flowerChoice >= 1 && flowerChoice <= flowers.length) {
                                    bouquet.addFlower(flowers[flowerChoice - 1]);
                                    validChoice = true; // Встановлюємо true, щоб вийти з циклу після правильного вибору
                                } else {
                                    System.out.println("Invalid selection, please try again.");
                                }
                            }
                        }

                        bouquet.getFlowerNames();

                        System.out.println("Would you like any accessories for your bouquet? (\"yes\"/\"no\")");
                        scanner.nextLine(); // Очищаємо буфер
                        String scanner4 = scanner.nextLine();

                        switch (scanner4) {
                            case "yes":
                                System.out.println("How many accessories do you want for your bouquet?");
                                int scanner5 = scanner.nextInt();

                                System.out.println("What kind of accessories do you want for your bouquet?");
                                System.out.println("Press \"1\" if you want to select Bow");
                                System.out.println("Press \"2\" if you want to select Rope");

                                // Оновлюємо кількість аксесуарів в букеті
                                bouquet.setAccessoryCount(scanner5);

                                for (int number = 0; number < scanner5; number++) {
                                    int scanner6 = scanner.nextInt();

                                    switch (scanner6) {
                                        case 1:
                                            bouquet.addAccessory(accessoryBow);
                                            break;
                                        case 2:
                                            bouquet.addAccessory(accessoryRope);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                bouquet.getAccessoryName();
                                System.out.println("The cost for the bouquet is: " + bouquet.getPriceBouquet());

                                break;
                            case "no":
                                System.out.println("The cost for the bouquet is: " + bouquet.getPriceBouquet());
                                break;
                            default:
                                break;
                        }

                        System.out.println("Do you want to sort yor flowers by freshness?");
                        System.out.println("\"1\". yes, sort my flowers, please");
                        System.out.println("\"2\". No, thank you");
                        int scanner7 = scanner.nextInt();

                        switch (scanner7) {
                            case 1:
                                bouquet.sortedFlowers();
                                break;
                            case 2:
                                break;

                            default:
                                break;
                        }

                        System.out.println("");
                        break;

                    default:
                        break;
                }

                // Accessory[] accessories = { accessoryBow, accessoryRope };

                // Bouquet bouquet = new Bouquet(6, accessories);

                // bouquet.addFlower(flowerChamomile);
                // bouquet.addFlower(flowerChrysanthemum);
                // bouquet.addFlower(flowerIris);
                // bouquet.addFlower(flowerPeony);
                // bouquet.addFlower(flowerGladiolus);
                // // bouquet.getPriceBouquet();

                // // bouquet.flowersWithTheRightLength(20, 45.5);

                // bouquet.sortedFlowers();

                // // flowerCalla.printName();
                // // flowerChamomile.printName();
                // // flowerChrysanthemum.printName();
                // // flowerGladiolus.printName();
                // // flowerIris.printName();
                // // flowerLily.printName();
                // // flowerPeony.printName();
                // // flowerRose.printName();
                // // flowerTulpan.printName();
                // // flowerViolet.printName();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}