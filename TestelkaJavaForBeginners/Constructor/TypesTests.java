package TestelkaJavaForBeginners.Constructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypesTests {

    public void doesIntChangeValueTest() {

        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 10;
        Assertions.assertEquals(5, secondInt);
    }

    public void doesObjectChangeValueTest() {
        //PlanetarySystemConstructor firstSystem = new PlanetarySystemConstructor();
        //PlanetarySystemConstructor system = new PlanetarySystemConstructor();
        //PlanetarySystemConstructor secondSystem = firstSystem;
        //firstSystem.setNumberOfPlanets(13);
        //Assertions.assertEquals(13, secondSystem.getNumberOfPlanets());
        //Assertions.assertEquals(8, secondSystem.getNumberOfPlanets());
        // Assertions.assertEquals(firstSystem.getNumberOfPlanets(), secondSystem.getNumberOfPlanets());
    }

    public void doesStringChangeValueTest() {
        String firstString = "The first one";
        String secondString = firstString;
        firstString = "The second one";
        Assertions.assertEquals("The second one", secondString);
    }

}
