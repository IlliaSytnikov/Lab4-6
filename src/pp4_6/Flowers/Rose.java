package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Rose extends Flower {
    public Rose() {
        this.setFlower_name("Роза");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(30) + 25);
        this.setPrice(100);
    }
}
