import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class Page {
    public WebDriver driver;
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement name;

    public String getName() {
        System.out.println(name);
        return name.getText();
    }

//лого платежных систем
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul")
    private WebElement logos;

    public boolean getLogo() {
        return logos.isEnabled();
    }

    //"Подробнее о сервисе"
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/a")
    private WebElement link;

    public void clickLink() {
        link.click();
        //String s = driver.getCurrentUrl();
        //return s;
    }

    public String getLink(){
        String s = driver.getCurrentUrl();
        return s;
    }
    //номер телефона
    @FindBy(xpath = "//*[@id='connection-phone']")
           private WebElement number;

    public void enterNumber(){
        String n = "297777777";
        number.click();
        number.sendKeys(n);
    }

    //сумма
    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement sum;

    public void enterSum(){
        sum.click();
        sum.sendKeys("50");
    }
    //кнопка продолжить
    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement next;

    public void clickNext(){
        next.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public boolean clickisEnabled(){
        return next.isEnabled();
    }

}
