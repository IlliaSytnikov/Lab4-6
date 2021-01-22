package pp4_6.Commands;

import pp4_6.Flowers.Flower;

import java.util.ArrayList;
import java.util.Scanner;

public class FindFlowersByStemLength {
    public static void findByStem(ArrayList<Flower> list) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введіть нижню межу довжини стебла квітки:\n-> ");
        int lower_limit = read.nextInt();
        System.out.print("Введіть верхню межу довжини стебла квітки:\n-> ");
        int higher_limit = read.nextInt();

        System.out.print("Квіти з заданою довжиною стебла: ");
        int check = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStem_length() >= lower_limit && list.get(i).getStem_length() <= higher_limit) {
                System.out.print(list.get(i).getFlower_name() + "(" + list.get(i).getStem_length() + " см) ");
                check = 1;
            }
        }
        if (check == 0)
            System.out.print("з заданими параметрами квітів не знайдено.");
        System.out.println();
    }
}
