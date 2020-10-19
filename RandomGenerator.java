import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomGenerator {
    @Test
    public void example() {
        readNumber(4);
        readNumber2(3);
    }

    private void readNumber(int number) {
        int numberOfLoops = 0;
        Random generator = new Random();
        while (generator.nextInt(5) != number) {
            System.out.println("No, that is not this number.");
            numberOfLoops++;
        }
        System.out.println("Yes, that is this number.");
        System.out.println("This number was found after " + numberOfLoops + " attempts.");
    }

    private void readNumber2(int number2) {
        int numberOfLoops2 = 0;
        Random generator2 = new Random();
        do {
            System.out.println("No, that is not this number.");
            numberOfLoops2++;
        }
        while (generator2.nextInt(5) != number2);
        {
            System.out.println("Yes, that is this number.");
            System.out.println("This number was found after " + numberOfLoops2 + " attempts.");
        }
    }

}
