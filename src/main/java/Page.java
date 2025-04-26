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

    //Услуги связи
    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement mobPhone;

    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement mobSum;

    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement mobEmail;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button")
    private WebElement menu;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")
    private WebElement menuHomeInternet;

    @FindBy(xpath = "//*[@id='internet-phone']")
    private WebElement homePhone;

    @FindBy(xpath = "//*[@id='internet-sum']")
    private WebElement homeSum;

    @FindBy(xpath = "//*[@id='internet-email']")
    private WebElement homeEmail;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")
    private WebElement menuInstallment;

    @FindBy(xpath = "//*[@id='score-instalment']")
    private WebElement accountNumberInstallment;

    @FindBy(xpath = "//*[@id='instalment-sum']")
    private WebElement installmentSum;

    @FindBy(xpath = "//*[@id='instalment-email']")
    private WebElement installmentEmail;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")
    private WebElement menuDebt;

    @FindBy(xpath = "//*[@id='score-arrears']")
    private WebElement debtNumber;

    @FindBy(xpath = "//*[@id='arrears-sum']")
    private WebElement debtSum;

    @FindBy(xpath = "//*[@id='arrears-email']")
    private WebElement debtEmail;

    @FindBy(xpath = "//div[@class='pay-description__cost']")
    private WebElement formSum;

    @FindBy(xpath = "//div[@class='pay-description__text']//span")
    private WebElement formPhonePay;

    @FindBy(xpath = "//div[@class='card-page__card']//button[@type='submit']")
    private WebElement formButtonPay;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-1']/label")
    private WebElement formCardNumber;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-4']")
    private WebElement formCardDate;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-5']")
    private WebElement formCardCvc;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-3']")
    private WebElement formCardName;

    @FindBy(xpath = "//div[@class='cards-brands cards-brands__container ng-tns-c891095944-0 ng-trigger" +
            " ng-trigger-brandsState ng-star-inserted']")
    private WebElement frameCardIcons;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/visa-system.svg']")
    private WebElement Icon1;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']")
    private WebElement Icon2;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']")
    private WebElement Icon3;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']")
    private WebElement Icon4;

    //проверка формы

    public boolean getFormIcon1(){
        return Icon1.isEnabled();
    }

    public boolean getFormIcon2(){
        return Icon2.isEnabled();
    }

    public boolean getFormIcon3(){
        return Icon3.isEnabled();
    }

    public boolean getFormIcon4(){
        return Icon4.isEnabled();
    }

    public String getFormSumText() {
        return formSum.getText();
    }

    public String getFormPhoneText(){
        return formPhonePay.getText();
    }

    public String getFormCardNumberText(){
        return formCardNumber.getText();
    }

    public String getFormCardCvcText(){
        return formCardCvc.getText();
    }
    public String getFormCardDateText(){
        return formCardDate.getText();
    }

    public String getFormCardNameText(){
        return formCardName.getText();
    }


    //услуги связи
    public String getLinkAboutMobPhone() {
        return mobPhone.getAttribute("placeholder");
    }
    public String getLinkAboutMobSum() {   return mobSum.getAttribute("placeholder");}
    public String getLinkAboutMobEmail() { return mobEmail.getAttribute("placeholder");}

    //Домашний интернет
    public void clickHomeInternet(){
        menu.click();
        menuHomeInternet.click();
    }
    public String getLinkAboutHomePhone() {
        return homePhone.getAttribute("placeholder");
    }
    public String getLinkAboutHomeSum() {   return homeSum.getAttribute("placeholder");}
    public String getLinkAboutHomeEmail() { return homeEmail.getAttribute("placeholder");}

    //Рассрочка
    public void clickInstallment(){
        menu.click();
        menuInstallment.click();
    }

    public String getLinkAboutInstallmentNumber() { return accountNumberInstallment.getAttribute("placeholder"); }
    public String getLinkAboutInstallmentSum() {   return installmentSum.getAttribute("placeholder");}
    public String getLinkAboutInstallmentEmail() { return installmentEmail.getAttribute("placeholder");}

    //Задолженность
    public void clickDebt(){
        menu.click();
        menuDebt.click();
    }

    public String getLinkAboutDebtNumber() { return debtNumber.getAttribute("placeholder"); }
    public String getLinkAboutDebtSum() {   return debtSum.getAttribute("placeholder");}
    public String getLinkAboutDebtEmail() { return debtEmail.getAttribute("placeholder");}

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
    }

    public void enterNumber() {
        String n = "297777777";
        number.click();
        number.sendKeys(n);
    }

    public void enterSum() {
        mobSum.click();
        mobSum.sendKeys("50");
    }


    public void clickNext() {
        next.click();
    }


    public boolean windowPay() {
        return pay.isEnabled();
    }
}

