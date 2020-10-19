import org.junit.jupiter.api.Test;

public class Factorial {
    @Test

    public void countFactorial() {
        int factorial6 = findFactorial(6);
        int factorial8 = findFactorial2(8);
        int factorial5 = findFactorial3(5);
    }

    private int findFactorial(int number) {
        int factorial = 1;
        int i = 2;

        while (number >= i) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

    public void findFactorial2() {
        int factorial6 = findFactorial(6);
    }

    private int findFactorial2(int number2) {
        int factorial2 = 1;
        int i = 2;

        do {
            factorial2 = factorial2 * i;
            i++;
        }
        while (number2 >= i);
        return factorial2;
    }

    private int findFactorial3(int number3) {
        int factorial3 = 1;

        for (int i = 2; i <= number3; i++) {
            factorial3 = factorial3 * i;
        }
        return factorial3;
    }
}
