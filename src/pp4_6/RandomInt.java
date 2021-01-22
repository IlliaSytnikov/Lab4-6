package pp4_6;

import java.util.Random;

public class RandomInt {
    public static int getRandomInt(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }
}
