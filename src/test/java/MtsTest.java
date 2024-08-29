import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MtsTest {
    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testTitle() {
        WebElement blockTitle = driver.findElement(By.xpath(("//h2[contains(., 'Онлайн пополнение') and contains(., 'без комиссии')]")));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText().replace("\n", " "), "Название не соответствует ожидаемому.");
    }
}