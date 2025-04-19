import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class MTSTest {
    WebDriver driver = new ChromeDriver();

    Page pp = new Page(driver);

    @BeforeAll
    public static void driverSet() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    }

    @Test
    public void getNameTest() {
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pp.getName();
        System.out.println(pp.getName());
        String actualText = pp.getName();
        String expectedText = "Онлайн пополнение без комиссии";

        assertEquals(actualText, expectedText, "Название блока не соответствует ожидаемому");
    }

    @Test
    public void getLogoTest() {
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pp.getLogo();

        Boolean actual = pp.getLogo();
        System.out.println(pp.getLogo());
        assertEquals(actual, true, "Logo");

    }

    @Test
    public void getLinkTest() {
        driver.get("https://mts.by");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pp.clickLink();
        pp.getLink();
        String actual = pp.getLink();
        assertEquals(actual, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", "Ссылка 'Подробнее о сервисе' не найдена или некорректна");
    }

    @Test
    public void numberTest(){
        driver.get("https://mts.by");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pp.enterNumber();
        pp.enterSum();
        pp.clickNext();
        pp.clickisEnabled();
        assertTrue(pp.clickisEnabled(),"Кнопка 'Продолжить' должна быть активна");

        assertTrue(driver.getCurrentUrl().contains("/payment"),"После клика должна произойти навигация на страницу оплаты");
    }

    @AfterEach
    public void after(){
        driver.quit();
    }
}
