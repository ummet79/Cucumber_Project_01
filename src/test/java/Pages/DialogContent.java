package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @FindBy(xpath = "//*[contains(text(), 'successfully')]")
    public WebElement registertext;

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

    @FindBy(xpath = "//*[contains(text(), 'Welcome')]")
    public WebElement loginText;

    @FindBy(xpath = "//div[@id='rightPanel']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[text()='Update Contact Info']")
    public WebElement updateContact;

    @FindBy(xpath = "//input[@value = 'Update Profile']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[@id='updateProfileResult']/h1")
    public WebElement updatedMessage;

    @FindBy(xpath = "//*[@id='leftPanel']/p")
    public WebElement nameAssertion;

    @FindBy(xpath = "//*[@value='Update Profile']")
    public WebElement updateprofile;

    @FindBy(id = "state-error")
    public WebElement getErrorMessage;

    public void verifyMessageContainsText( String value) {
        wait.until(ExpectedConditions.visibilityOf(this.messageBox));
        Assert.assertTrue(this.messageBox.getText().toLowerCase().contains(value.toLowerCase()));
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
            case "registertext":
                return this.registertext;
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
            case "logintext":
                return this.loginText;
            case "opennewaccountbutton":
                return this.opennewaccountbutton;

            case "updatecontact":
                return this.updateContact;

            case "updatebutton":
                return this.updateButton;

            case "updatedmessage":
                return this.updatedMessage;

            case "nameassertion":
                return this.nameAssertion;

            case "updateprofile":
                return this.updateprofile;
            default:
                System.out.println("Element bulunamadı: " + strElementName);
                return null; // null döndür
        }
    }
   }


