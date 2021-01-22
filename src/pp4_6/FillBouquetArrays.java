package pp4_6;

import pp4_6.Accessories.*;
import pp4_6.Flowers.*;

import java.util.Scanner;

public class FillBouquetArrays {
    private static final Scanner read = new Scanner(System.in);

    public static Accessory lastAccessory(Bouquet bouquet) {
        return bouquet.accessories.get(bouquet.accessories.size() - 1);
    }

    public static Flower lastFlower(Bouquet bouquet) {
        return bouquet.flowers.get(bouquet.flowers.size() - 1);
    }

    public static void fillBouquetByAccessories(Bouquet bouquet) {
        System.out.print("Чи ви хочете обмотати букет стрічками? (1 - так, 2 - ні)\n-> ");
        int check = read.nextInt();
        read.nextLine();
        if(check == 1) {
            bouquet.accessories.add(new Stripes());
            System.out.print("Введіть колір стрічок:\n-> ");
            lastAccessory(bouquet).setColor(read.nextLine());
            bouquet.setTotalPrice(bouquet.getTotalPrice() + lastAccessory(bouquet).getPrice());
        }

        System.out.print("Чи потрібні додатково блискітки? (1 - так, 2 - ні)\n-> ");
        check = read.nextInt();
        if (check == 1) {
            bouquet.accessories.add(new Sequins());
            bouquet.setTotalPrice(bouquet.getTotalPrice() + lastAccessory(bouquet).getPrice());
        }

        System.out.print("Чи ви хочете упакувати букет в плівку? (1 - так, 2 - ні)\n-> ");
        check = read.nextInt();
        read.nextLine();
        if (check == 1) {
            bouquet.accessories.add(new BouquetPackage());
            System.out.print("Введіть колір упаковки:\n-> ");
            lastAccessory(bouquet).setColor(read.nextLine());
            bouquet.setTotalPrice(bouquet.getTotalPrice() + lastAccessory(bouquet).getPrice());
        }
    }

    public static void fillBouquetByFlowers(Bouquet bouquet) {
        while(true) {
            System.out.print("-> ");
            int check = read.nextInt();
            switch(check) {
                case 1:
                    bouquet.flowers.add(new Aster());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 2:
                    bouquet.flowers.add(new Dahlia());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 3:
                    bouquet.flowers.add(new Eustoma());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 4:
                    bouquet.flowers.add(new Gladiolus());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 5:
                    bouquet.flowers.add(new Lilies());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 6:
                    bouquet.flowers.add(new Rose());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 7:
                    bouquet.flowers.add(new Tulip());
                    Messages.messageFlowerAdded(bouquet);
                    bouquet.setTotalPrice(bouquet.getTotalPrice() + lastFlower(bouquet).getPrice());
                    Messages.printBouquetPrice(bouquet);
                    break;
                case 0:
                    System.out.println("Додавання квітів до букету завершено.");
                    return;
                default:
                    System.out.println("Неправильний пункт меню! Спробуйте ще раз...");
                    Messages.printFlowerMenu();
            }
        }
    }
}
