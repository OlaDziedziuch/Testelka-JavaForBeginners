import org.junit.jupiter.api.Test;

public class ForEach {
    @Test
    public void forEachexample() {
        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        String text = "Planety naszego układu słonecznego to ";

        for (String planeta : planety) {
            text = text + "\n" + planeta;
        }
        System.out.println(text);
    }

}
