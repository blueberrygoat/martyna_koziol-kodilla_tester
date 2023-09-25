import java.util.Random;

public class RandomNumbers {
    int minValue;
    int maxValue;
    int [] value;

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int max = 100;
        int sum = 0;
        int result = 0;
        while (sum < max){
        int rnd = randomNumbers.nextInt(31);
        sum = sum + rnd;
        System.out.println(rnd);
        sum++;
        result++;
        }

        System.out.println("Liczba losowań to:" +" "+ result);

    }
}
