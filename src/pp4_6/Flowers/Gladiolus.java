package pp4_6.Flowers;

import pp4_6.RandomInt;

public class Gladiolus extends Flower {
    public Gladiolus() {
        this.setFlower_name("Гладіолус");
        this.setFlower_freshness(RandomInt.getRandomInt(7));
        this.setStem_length(RandomInt.getRandomInt(50) + 50);
        this.setPrice(35);
    }
}
