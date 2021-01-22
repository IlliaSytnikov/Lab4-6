package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Dahlia extends Flower{
    public Dahlia() {
        this.setFlower_name("Жоржина");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(40) + 20);
        this.setPrice(80);
    }
}
