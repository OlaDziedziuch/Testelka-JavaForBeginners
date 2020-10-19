import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    public static class FirstTest {
        @Test
        public void demoTest() {
            WebDriver driver = new ChromeDriver();
        }
    }
}
