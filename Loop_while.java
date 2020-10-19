import org.junit.jupiter.api.Test;

public class Loop_while {
    @Test
    public void decrement() {
        int number = 20;
        while (number >= 10) {
            System.out.println(number);
            number--;
        }
    }

    @Test
    public void displayNumbers() {
        int count = 10;
        while (count <= 20) {
            System.out.println(count);
            count++;
        }
    }
}


