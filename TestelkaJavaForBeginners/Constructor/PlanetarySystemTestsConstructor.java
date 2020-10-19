package TestelkaJavaForBeginners.Constructor;
import org.junit.jupiter.api.Test;

public class PlanetarySystemTestsConstructor {

    public void firstTest() {
        //PlanetarySystemConstructor PlanetarySystem = new PlanetarySystemConstructor();
        PlanetarySystemConstructor solarSystem = new PlanetarySystemConstructor("The Sun", "yellow dwarf", 8);
        solarSystem.printNumberOfPlanets();
        solarSystem.printStarName();
        solarSystem.printStarType();

        PlanetarySystemConstructor keplerSystem = new PlanetarySystemConstructor("Kepler-444", "k-dwarf", 5);
        keplerSystem.printStarType();
        keplerSystem.printStarName();
        keplerSystem.printNumberOfPlanets();
    }
}
