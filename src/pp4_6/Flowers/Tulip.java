package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Tulip extends Flower {
    public Tulip() {
        this.setFlower_name("Тюльпан");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(40) + 10);
        this.setPrice(60);
    }
}
