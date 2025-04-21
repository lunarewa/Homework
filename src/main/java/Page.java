import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page {
    public WebDriver driver;

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement name;

    @FindBy(xpath = "//a[text()='Подробнее о сервисе']")
    private WebElement aboutService;

    //кнопка продолжить
    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement next;

    @FindBy(className = "bepaid-app")
    private WebElement pay;

    //лого платежных систем
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul")
    private WebElement logos;

    //"Подробнее о сервисе"
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/a")
    private WebElement link;

    //номер телефона
    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement number;

    //сумма
    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement sum;

    public String getName() {
        System.out.println(name);
        return name.getText();
    }

    public String getLinkAboutService() {
        return aboutService.getAttribute("href");
    }

    public boolean getLogo() {
        return logos.isEnabled();
    }

    public void clickLink() {
        link.click();
        //String s = driver.getCurrentUrl();
        //return s;
    }

    public String getLink() {
        String s = driver.getCurrentUrl();
        return s;
    }

    public void enterNumber() {
        String n = "297777777";
        number.click();
        number.sendKeys(n);
    }

    public void enterSum() {
        sum.click();
        sum.sendKeys("50");
    }


    public void clickNext() {
        next.click();
    }


    public boolean windowPay() {
        return pay.isEnabled();
    }
}
