package Lab2;
import java.util.Random;

public class getRandom{

    public getRandom(){
    }

    public static int Random(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


}
