import org.junit.jupiter.api.Test;

public class If_conditions {
    @Test
    public void ifExample() {
        int variable = 100;

        if (variable > 100) {
            System.out.println("The variable is greater than 100.");
        } else if (variable < 100) {
            System.out.println("The variable is less than 100.");
        } else {
            System.out.println("The variable is equal 100.");
        }
    }

    @Test
    public void switchExample() {
        int variable = 1;

        switch (variable) {
            case 0:
                System.out.println("The first is chosen.");
                break;
            case 1:
                System.out.println("The second is chosen.");
                break;
            case 2:
                System.out.println("The third is chosen.");
                break;
            default:
                System.out.println("Default value.");
        }
    }
}

