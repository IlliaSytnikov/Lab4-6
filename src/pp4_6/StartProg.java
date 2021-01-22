package pp4_6;

import pp4_6.Commands.*;

import java.util.Scanner;

public class StartProg {

    private static final Bouquet bouquet = new Bouquet();

    public static void start() {
        Scanner read = new Scanner(System.in);
        Messages.printFlowerMenu();
        FillBouquetArrays.fillBouquetByFlowers(bouquet);
        FillBouquetArrays.fillBouquetByAccessories(bouquet);

        Messages.printMenu();
        while(true) {
            System.out.print("-> ");
            int check = read.nextInt();
            switch (check) {
                case 1:
                    Messages.printBouquet(bouquet);
                    break;
                case 2:
                    SortByFreshness.sort(bouquet.flowers);
                    System.out.println("Сортування закінчене.");
                    break;
                case 3:
                    FindFlowersByStemLength.findByStem(bouquet.flowers);
                    break;
                case 4:
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 0:
                    System.out.println("Завершення роботи програми...");
                    return;
                default:
                    System.out.println("Неправильна опція! Спробуйте ще раз...");
                    Messages.printMenu();
                    break;
            }
        }
    }
}
