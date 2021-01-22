package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Eustoma extends Flower{
    public Eustoma() {
        this.setFlower_name("Еустома");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(40) + 20);
        this.setPrice(40);
    }
}
