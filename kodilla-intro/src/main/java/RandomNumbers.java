import java.util.Random;

public class RandomNumbers {
    int min;
    int max;

    public RandomNumbers() {
        min = 31;
    }

    public void randomNumbers() {
        Random randomNumbers = new Random();
        int maxSum = 100;
        int sum = 0;
        int result = 0;
        while (sum < maxSum) {
            int rnd = randomNumbers.nextInt(31);
            sum = sum + rnd;
            System.out.println(rnd);
            sum++;
            result++;

            if (rnd < min) {
                min = rnd;
            }

            if (rnd > max) {
                max = rnd;
            }
        }
        System.out.println("Liczba losowań to:" + " " + result);
    }

    public int minNumber() {
        return min;
    }

    public int maxNumber() {
        return max;
    }
}