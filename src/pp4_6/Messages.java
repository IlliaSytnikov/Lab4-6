package pp4_6;

public class Messages {
    public static void printFlowerMenu() {
        System.out.println("Додайте квітку до букету:\n" +
                "1 - айстра\n" +
                "2 - жоржина\n" +
                "3 - еустома\n" +
                "4 - гладіолус\n" +
                "5 - лілія\n" +
                "6 - роза\n" +
                "7 - тюльпан\n" +
                "0 - закінчення введення");
    }

    public static void messageFlowerAdded(Bouquet bouquet) {
        System.out.println("Квітку " + bouquet.flowers.get(bouquet.flowers.size() - 1).getFlower_name() + " свіжістю в " +
                bouquet.flowers.get(bouquet.flowers.size() - 1).getFlower_freshness() +
                " днів та довжиною стебла " + bouquet.flowers.get(bouquet.flowers.size() - 1).getStem_length() +
                " см додано до букету!");
    }

    public static void printBouquetPrice(Bouquet bouquet) {
        System.out.println("Теперішня ціна букету = " + bouquet.getTotalPrice());
    }

    public static void printBouquet(Bouquet bouquet) {
        System.out.print("Квіти додані в букет: ");
        for (int i = 0; i < bouquet.flowers.size(); i++) {
            System.out.print(bouquet.flowers.get(i).getFlower_name());
            if (i != bouquet.flowers.size() - 1)
                System.out.print(", ");
            else System.out.println(".");
        }

        System.out.print("Вибрані аксесуари: ");
        if (bouquet.accessories.size() == 0)
            System.out.println("ви не вибрали жодного аксесуара.");
        else {
            for (int i = 0; i < bouquet.accessories.size(); i++) {
                System.out.print(bouquet.accessories.get(i).getType() + " кольору \"" + bouquet.accessories.get(i).getColor() + "\"");
                if (i != bouquet.accessories.size() - 1)
                    System.out.print(", ");
                else System.out.println(".");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Виберіть дію:\n" +
                "1 - виведення вмісту букету на екран\n" +
                "2 - сортування квітів в букеті за свіжістю\n" +
                "3 - знаходження квітів з довжиною стебла у заданому діапазоні\n" +
                "4 - виведення ціни букету на екран\n" +
                "0 - завершення роботи програми");
    }
}
