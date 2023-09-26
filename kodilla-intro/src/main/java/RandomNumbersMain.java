import java.util.Random;

public class RandomNumbersMain {
    public static void main(String[] args) {
        RandomNumbers generator = new RandomNumbers();
        generator.randomNumbers();
        System.out.println();
        System.out.println(generator.minNumber());
        System.out.println(generator.maxNumber());

    }
}
