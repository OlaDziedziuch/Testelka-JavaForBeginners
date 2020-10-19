import org.junit.jupiter.api.Test;

public class Scope {
    int x = 3;
    int y = 5;
    int sum = x + y;
    int z;

    @Test
    public void displayNumber() {
        int z = 8;
        int x = 7;
        int methodNumber = 10;

        for (int i = 0; i < 10; i++) {
            System.out.println("The variable number is equal to" + x + ". The value is " + i);
            if (i <= 5) {
                String text = "Message";
                System.out.println(text);
            }
            int localSum = x + i;
        }

        //System.out.println("The variable number is equal to" + x + ". The value is " + i);
        // var "i" is out of the scope
    }
}
