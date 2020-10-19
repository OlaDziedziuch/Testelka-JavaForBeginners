import org.junit.jupiter.api.Test;

public class StringVariables {

    @Test
    public void example() {
        double areaFirstTriangle = countTriangleArea(8, 10);
        double areaSecondTriangle = (6 * 3) / 2;
        double areaThirdTriangle = countTriangleArea(2, 2);
        String text = "The area of the triangles: " + areaFirstTriangle + "," + areaSecondTriangle + "," + areaThirdTriangle;
        enterEnd();
        enterText("Entered text");

    }

    double countTriangleArea(double base, double height) {
        double triangleArea = base * height / 2;
        return triangleArea;
    }

    void enterEnd() {
        System.out.println("Tests end.");
    }

    void enterText(String text) {
        System.out.println(text);
    }


}