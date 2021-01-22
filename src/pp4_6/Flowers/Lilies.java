package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Lilies extends Flower {
    public Lilies() {
        this.setFlower_name("Лілія");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(90) + 10);
        this.setPrice(40);
    }
}
