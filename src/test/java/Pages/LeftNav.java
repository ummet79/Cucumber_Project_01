package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    //Kayıt Butonu
    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logout;



    //open NewAccount Butonu
    @FindBy(xpath = "//*[text()='Open New Account']") //
    public WebElement opennewaccount;

    public WebElement getWebElement2(String strElementName) {


        switch (strElementName.trim().toLowerCase()) {
            case "register":
                return this.registerLink;
            case "logout":
                return this.logout;
            case "opennewaccount":
                return this.opennewaccount;
            default:
                System.out.println("Element bulunamadı: " + strElementName);
                return null;
        }
    }
   
}
