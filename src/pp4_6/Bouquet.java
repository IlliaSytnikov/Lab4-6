package pp4_6;

import pp4_6.Accessories.Accessory;
import pp4_6.Flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Accessory> accessories = new ArrayList<>();
    private int totalPrice = 0;

    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
