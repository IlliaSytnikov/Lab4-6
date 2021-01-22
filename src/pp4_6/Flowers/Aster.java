package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Aster extends Flower {
    public Aster() {
        this.setFlower_name("Айстра");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(30) + 15);
        this.setPrice(50);
    }
}
