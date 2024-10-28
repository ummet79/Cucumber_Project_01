package StepDefinitions;

//import Pages.DialogContent;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;


public class _01_UserRegistration {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("the user navigates to the ParaBank website")
    public void theUserNavigatesToTheParaBankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com");
    }

    @When("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> linkler = dtLinkler.asList();

        for (int i = 0; i < linkler.size(); i++) {
            ln.myClick(ln.getWebElement2(linkler.get(i)));
        }
    }

    @And("the user fills in the registration form with valid customer data")
    public void theUserFillsInTheRegistrationFormWithValidCustomerData(DataTable dtKutuVeYazilar) {
        List<List<String>> kutuVeYazilar = dtKutuVeYazilar.asLists();

        for (int i = 0; i < kutuVeYazilar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilar.get(i).get(0));
            dc.mySendKeys(kutu, kutuVeYazilar.get(i).get(1));
        }

// Random veriler üretme
        _02_UserLogin.username = RandomStringUtils.randomAlphanumeric(8); // 8 karakterli kullanıcı adı
        _02_UserLogin.password = RandomStringUtils.randomNumeric(4); // 4 karakterli şifre
// Random verileri form alanlarına yazma
        dc.mySendKeys(dc.username1, _02_UserLogin.username);
        dc.mySendKeys(dc.password1, _02_UserLogin.password);
        dc.mySendKeys(dc.repeatedPassword, _02_UserLogin.password);

    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtbutton) {
        List<String> button = dtbutton.asList();

        for (int i = 0; i < button.size(); i++) {
            dc.myClick(dc.getWebElement(button.get(i)));
        }
    }

    @And("the user confirms the message that he has successfully registered")
    public void theUserConfirmsTheMessageThatHeHasSuccessfullyRegistered() {
        dc.LoginContainsText(dc.registertext, "successfully");
        System.out.println("Kayıt olma onayı mesajı: " + dc.registertext.getText()); // Onay mesajını yazdırma
    }

    @Then("the user changes the session by clicking the button")
    public void theUserChangesTheSessionByClickingTheButton(DataTable dtlogout) {
        List<String> button = dtlogout.asList();

        for (int i = 0; i < button.size(); i++) {
            ln.myClick(ln.getWebElement2(button.get(i)));
        }
    }


}
