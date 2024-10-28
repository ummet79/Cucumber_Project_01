package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
// Kayıt Sayfası Elemanları
    @FindBy(css = "[id$='firstName']")
    public WebElement firstName;

    @FindBy(css = "[id$='lastName']")
    public WebElement lastName;

    @FindBy(css = "[id$='street']")
    public WebElement address;

    @FindBy(css = "[id$='city']")
    public WebElement city;

    @FindBy(css = "[id$='state']")
    public WebElement state;

    @FindBy(css = "[id$='zipCode']")
    public WebElement zipCode;

    @FindBy(css = "[id$='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(css = "[id$='ssn']")
    public WebElement ssn;

    @FindBy(css = "[id$='username']")
    public WebElement username1;

    @FindBy(css = "[id$='password']")
    public WebElement password1;

    @FindBy(css = "[id='repeatedPassword']")
    public WebElement repeatedPassword;

    @FindBy(css = "[value='Register']")
    public WebElement registerButton;

    //open new account
    @FindBy(css = "option[value='0']")
    public WebElement checking;

    @FindBy(css = "option[value='1']")
    public WebElement savings;

    @FindBy(id = "fromAccountId")
    public WebElement accountselect;

    @FindBy(css = "[value='Open New Account']")
    public WebElement opennewaccountbutton;

    @FindBy(xpath = "//p/b[contains(text(), 'A minimum of $200')]")
    public WebElement minimumBalanceWarning;

    @FindBy(xpath = "//p[contains(text(), 'Congratulations')]")
    public WebElement accountOpenedText;

    @FindBy(css = "[id='newAccountId']")
    public WebElement accountNumberClick;

    @FindBy(linkText = "Account Details")
    public WebElement AccountDetails;

    //login
    @FindBy(css = "[name='username']")
    public WebElement username;

    @FindBy(css = "[name='password']")
    public WebElement password;

    @FindBy(css = "[value='Log In']")
    public WebElement login;

    @FindBy(css = "[id='showResult'] > :nth-child(1)")
    public WebElement transferControlMessage;

    @FindBy(xpath = "(//td[@align='right'])[5]/following-sibling::td")
    public WebElement amountControl;

    @FindBy(xpath = "(//table[@id='accountTable']//a)[2]")
    public WebElement fromAccountId;

    @FindBy(xpath = "(//table[@id='transactionTable']//tr[last()])[2]")
    public WebElement lastFundsTransferReceived;

    @FindBy(xpath = "(//div[@id='rightPanel']//td)[2]")
    public WebElement transactionIdtext;

    @FindBy(css = "[id='transactionId']")
    public WebElement transactionIdinput;

    @FindBy(css = "[id='findById']")
    public WebElement findTransactionButton;

    @FindBy(css = "[id='accountId']")
    public WebElement selectAccountInFindTransaction;

    @FindBy(xpath = "//select[@id='accountId']/option[last()]")
    public WebElement selectLastNumber;

    public void selectFirstAccount() {
        // İlk seçenek
        Select accountDropdown = new Select(accountselect);
        accountDropdown.selectByIndex(0); // İlk öğeyi seç
    }

    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim().toLowerCase()) { // Küçük harfe çevir
            case "firstname":
                return this.firstName;
            case "lastname":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipcode":
                return this.zipCode;
            case "phonenumber":
                return this.phoneNumber;
            case "ssn":
                return this.ssn;
            case "registerbutton":
                return this.registerButton;
            case "checking":
                return this.checking;
            case "savings":
                return this.savings;
            case "accountselect":
                return this.accountselect;
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "login":
                return this.login;
            case "opennewaccountbutton":
                return this.opennewaccountbutton;

            default:
                System.out.println("Element bulunamadı: " + strElementName);
                return null; // null döndür
        }
    }
   }


