import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MtsTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/elka0/IdeaProjects/QA-Java/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().deleteAllCookies();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    @Order(1)
    public void testTitle() {
        WebElement blockTitle = driver.findElement(By.xpath(("//h2[contains(., 'Онлайн пополнение') and contains(., 'без комиссии')]")));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText().replace("\n", " "), "Название не соответствует ожидаемому.");
    }

    @Test
    @Order(2)
    public void testLogo() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        assertFalse(logos.isEmpty(), "Логотипы не найдены.");
        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed(), "Один из логотипов не отображается.");
            String src = logo.getAttribute("src");
            assertTrue(src.contains("/local/templates/new_design/assets/html/images/pages/index/pay/"), "Источник не соответствует");
        }
    }

    @Test
    @Order(3)
    public void testLink() {
        WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/a[text()='Подробнее о сервисе']")));
        link.click();
        String expectedTitle = "Порядок оплаты и безопасность интернет платежей"; // Замените на ожидаемый заголовок
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle, "Заголовок страницы не соответствует ожидаемому");
    }

    @Test
    @Order(4)
    public void testButton() {
        WebElement inputPhone = driver.findElement(By.xpath("//div/input[@id='connection-phone']"));
        inputPhone.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//div/input[@id='connection-sum']"));
        inputSum.sendKeys("1");
        WebElement inputButton = driver.findElement(By.xpath("//form[@id='pay-connection']//button"));
        inputButton.click();
        WebElement block = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bepaid-app']")));
        Assertions.assertNotNull(block, "Окно не появился после нажатия кнопки");
    }

    @AfterEach
    public void setDown() {
        driver.quit();
    }
}