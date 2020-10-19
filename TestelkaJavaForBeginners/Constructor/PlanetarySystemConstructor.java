package TestelkaJavaForBeginners.Constructor;

public class PlanetarySystemConstructor {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystemConstructor(String starName, String starType, int numberOfPlanets) {
        this.starName = starName;
        this.starType = starType;
        this.numberOfPlanets = numberOfPlanets;

        System.out.println("The name of the star is: " + starName
                + " , the star type is: " + starType
                + " , the numbers of planets are: " + numberOfPlanets);
    }

    public void printNumberOfPlanets() {
        System.out.println("Number of planets: " + numberOfPlanets);
    }

    public void printStarName() {
        System.out.println("The star name is: " + starName);
    }

    public void printStarType() {
        System.out.println("The star type is: " + starType);
    }

    public void setNumberOfPlanets(int number) {
        int numberOfPlanets = number;
    }

    public int getNumberOfPlanets() {
        return numberOfPlanets;
    }
}
