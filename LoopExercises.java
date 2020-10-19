import org.junit.jupiter.api.Test;

public class LoopExercises {
    @Test

    public void loop1() {
        obliczPetle1a();
        obliczPetle1b();
    }

    @Test
    public void loop2() {
        obliczPetle2a();
        obliczPetle2b();
    }

    @Test
    public void loop3() {
        obliczPetle3a();
        obliczPetle3b();
    }

    @Test
    public void loop4() {
        obliczPetle4a();
        obliczPetle4b();
    }

    @Test
    public void loop5() {
        obliczPetle5a();
        obliczPetle5b();
    }

    @Test
    public void loop6() {
        obliczPetle6a();
        obliczPetle6b();
    }

    @Test
    public void loop7() {
        obliczPetle7a();
        obliczPetle7b();
    }

    @Test
    public void loop8() {
        obliczPetle8a();
        obliczPetle8b();
    }

    @Test
    public void loop9() {
        obliczPetle9a();
        obliczPetle9b();
    }

    // wypisz liczby od 1 do 100
    private void obliczPetle1a() {
        int i = 0;
        int a = 100;
        while (i < a) {
            i++;
            System.out.println(i);
        }

    }

    private void obliczPetle1b() {
        int a = 100;
        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }

    // wypisz liczby od 8 do 50
    private void obliczPetle2a() {
        int a = 50;
        for (int i = 8; i <= a; i++) {
            System.out.println(i);
        }
    }

    private void obliczPetle2b() {
        int i = 8;
        int a = 50;
        while (i <= a) {
            i++;
            System.out.println(i);
        }
    }

    //wypisz liczby parzyste od 2 to 50

    private void obliczPetle3a() {
        int a = 50;
        for (int i = 2; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private void obliczPetle3b() {
        int i = 1;
        int a = 50;
        while (i <= a) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //wypisz liczby od 100 do 1
    private void obliczPetle4a() {
        int a = 1;
        for (int i = 100; i >= a; i--) {
            System.out.println(i);
        }
    }

    private void obliczPetle4b() {
        int a = 101;
        int i = 2;
        while (a >= i) {
            a--;
            System.out.println(a);
        }
    }

    // wypisz liczby podzielne przez 8 (w zakresie 1..100)
    private void obliczPetle5a() {
        int a = 100;
        for (int i = 1; i <= a; i++) {
            if (i % 8 == 0) {
                System.out.println(i);
            }
        }
    }

    private void obliczPetle5b() {
        int i = 1;
        int a = 100;
        while (i <= a) {
            i++;
            if (i % 8 == 0) {
                System.out.println(i);
            }
        }
    }

//wypisz liczby podzielne przez 3 lub 5 ( w zakresie 1..100)

    private void obliczPetle6a() {
        int a = 100;
        for (int i = 1; i <= a; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }

    private void obliczPetle6b() {
        int i = 1;
        int a = 100;
        while (i <= a) {
            i++;
            {
                if ((i % 3 == 0) || (i % 5 == 0)) {
                    System.out.println(i);
                }
            }
        }
    }

    // wypisz liczby podzielne przez 3 albo 5 ( w zakresie 1..100) (nie wypisuj tych podzielnych jednocześnie przez 3 i 5)

    private void obliczPetle7a() {
        int a = 100;
        for (int i = 1; i <= a; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                if (i % 15 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    private void obliczPetle7b() {
        int i = 1;
        int a = 100;
        while (i <= a) {
            i++;
            {
                if ((i % 3 == 0) || (i % 5 == 0)) {
                    if (i % 15 != 0) {
                        System.out.println(i);
                    }
                }
            }

        }
    }

    // Write a program to print numbers from 1 to 10.

    private void obliczPetle8a() {
        int a = 10;
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }

    private void obliczPetle8b() {
        int a = 9;
        int i = 0;
        while (a >= i) {
            i++;
            System.out.println(i);
        }
    }

    //  Write a program to calculate the sum of first 10 natural number.
    private void obliczPetle9a() {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a += i;
        }
        System.out.println("The sum is " + a);
    }

    private void obliczPetle9b() {
        int a = 0;
        int i = 0;
        int b = 10;
        while (i < b) {
            i++;
            a += i;
        }
        System.out.println("The sum is " + a);
    }

    @Test
    public void displayNumbersFor() {
        int i;
        for (i = -10; i <= 40; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }

    @Test
    public void displayNumbersWhile() {
        int i = -9;
        while (i < 40) {
            System.out.println(i);
            i += 2;
        }
    }

    @Test
    public void displayNumbersWhile2() {
        int i = -10;
        while (i < 40) {
            System.out.println(i);
            i += 2;
        }
    }

    @Test
    public void countOneMoreTime() {
        int a;
        for (a = -60; a < 140; a++)
            if (a % 2 != 0) {
                System.out.println(a);
            }
    }

    @Test
    public void countOneMoreTime2() {
        int a;
        for (a = 190; a >= -20; a--)
            if (a % 2 != 0) {
                System.out.println(a);
            }
    }
}


