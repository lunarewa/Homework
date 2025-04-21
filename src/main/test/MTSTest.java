import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTSTest {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    Page pp = new Page(driver);


    @BeforeAll
    public static void driverSet() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    }

    @Test
    public void getNameTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://mts.by");

        pp.getName();
        System.out.println(pp.getName());
        String actualText = pp.getName();
        String expectedText = "Онлайн пополнение без комиссии";

        assertEquals(actualText, expectedText, "Название блока не соответствует ожидаемому");
    }

    @Test
    public void getLogoTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://mts.by");
        pp.getLogo();
        Boolean actual = pp.getLogo();
        System.out.println(pp.getLogo());
        assertEquals(actual, true, "Logo");

    }

    @Test
    public void getLinkTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://mts.by");
        String actual = pp.getLinkAboutService();

        pp.clickLink();
        assertEquals(actual, driver.getCurrentUrl(), "Ссылка 'Подробнее о сервисе' не найдена или некорректна");
    }

    @Test
    public void numberTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://mts.by");
        pp.enterNumber();
        pp.enterSum();
        pp.clickNext();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-app")));
        assertTrue(pp.windowPay(),"После клика должна произойти навигация на страницу оплаты");
    }

    @AfterEach
    public void after(){
        driver.quit();
    }
}
