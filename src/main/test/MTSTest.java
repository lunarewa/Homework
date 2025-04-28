
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Проверка названия блока")
    @Test
    public void getNameTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://mts.by");
        pp.getName();
        System.out.println(pp.getName());
        String actualText = pp.getName();
        String expectedText = "Онлайн пополнение\nбез комиссии";
        assertEquals(actualText, expectedText, "Название блока не соответствует ожидаемому");
    }

    @DisplayName("Проверка наличия логотипов")
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
    @DisplayName("Проверка ссылки 'Подробнее о сервисе'")
    @Test
    public void getLinkTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://mts.by");
        String actual = pp.getLinkAboutService();
        pp.clickLink();
        assertEquals(actual, driver.getCurrentUrl(), "Ссылка 'Подробнее о сервисе' не найдена или некорректна");
    }

    @DisplayName("Проверка перехода на форму оплаты")
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
    @DisplayName("Услуги связи")
    @Test
    public void validCommunicationServices(){
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        assertEquals("Номер телефона", pp.getLinkAboutMobPhone(), "Название блока не соответствует ожидаемому");
        assertEquals("Сумма", pp.getLinkAboutMobSum(), "Название блока не соответствует ожидаемому");
        assertEquals("E-mail для отправки чека", pp.getLinkAboutMobEmail(), "Название блока не соответствует ожидаемому");
    }

    @DisplayName("Домашний интернет")
    @Test
    public void validHomeInternet(){
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        pp.clickHomeInternet();
        assertEquals("Номер абонента", pp.getLinkAboutHomePhone(), "Название блока не соответствует ожидаемому");
        assertEquals("Сумма", pp.getLinkAboutHomeSum(), "Название блока не соответствует ожидаемому");
        assertEquals("E-mail для отправки чека", pp.getLinkAboutHomeEmail(), "Название блока не соответствует ожидаемому");
    }

    @DisplayName("Рассрочка")
    @Test
    public void validInstallment(){
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        pp.clickInstallment();
        assertEquals("Номер счета на 44", pp.getLinkAboutInstallmentNumber(), "Название блока не соответствует ожидаемому");
        assertEquals("Сумма", pp.getLinkAboutInstallmentSum(), "Название блока не соответствует ожидаемому");
        assertEquals("E-mail для отправки чека", pp.getLinkAboutInstallmentEmail(), "Название блока не соответствует ожидаемому");
    }

    @DisplayName("Задолженность")
    @Test
    public void validDebt(){
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        pp.clickDebt();
        assertEquals("Номер счета на 2073", pp.getLinkAboutDebtNumber(), "Название блока не соответствует ожидаемому");
        assertEquals("Сумма", pp.getLinkAboutDebtSum(), "Название блока не соответствует ожидаемому");
        assertEquals("E-mail для отправки чека", pp.getLinkAboutDebtEmail(), "Название блока не соответствует ожидаемому");
    }

    @DisplayName("Проверка формы оплаты")
    @Test
    public void formPayTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://mts.by");
        pp.enterNumber();
        pp.enterSum();
        pp.clickNext();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-app")));
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-back-navigation/div/div/svg-icon")));
        assertEquals("50.00 BYN", pp.getFormSumText(), "Название блока не соответствует ожидаемому");
        assertEquals("Оплата: Услуги связи Номер:375297777777", pp.getFormPhoneText(), "Название блока не соответствует ожидаемому");
        assertEquals("Номер карты", pp.getFormCardNumberText(), "Название блока не соответствует ожидаемому");
        assertEquals("Срок действия", pp.getFormCardDateText(), "Название блока не соответствует ожидаемому");
        assertEquals("Имя держателя (как на карте)", pp.getFormCardNameText(), "Название блока не соответствует ожидаемому");
        assertEquals("CVC", pp.getFormCardCvcText(), "Название блока не соответствует ожидаемому");
        assertTrue(pp.getFormIcon1(),"Не отображена иконка платежных систем");
        assertTrue(pp.getFormIcon2(),"Не отображена иконка платежных систем");
        assertTrue(pp.getFormIcon3(),"Не отображена иконка платежных систем");
        assertTrue(pp.getFormIcon4(),"Не отображена иконка платежных систем");
    }

    @AfterEach
    public void after(){
        driver.quit();
    }
}
