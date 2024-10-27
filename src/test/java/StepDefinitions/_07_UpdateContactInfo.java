package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _07_UpdateContactInfo {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    public static String username; // Kullanıcı adı
    public static String password;


    @Given("Navigate to the ParaBank website")
    public void navigateToTheParaBankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com");
    }


    @And("Click on the Element in the LeftNav")
    public void clickOnTheElementInTheLeftNav(DataTable dtButon) {
        List<String> butonlar=dtButon.asList();
        for (int i = 0; i < butonlar.size(); i++) {
            dc.myClick(dc.getWebElement(butonlar.get(i)));

        }
    }

    @And("Updating user information")
    public void updatingUserInformation(DataTable dtKutuVeYazilar) {
        List<List<String>> kutuVeYazilar = dtKutuVeYazilar.asLists();

        for (int i = 0; i < kutuVeYazilar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilar.get(i).get(0));
            dc.mySendKeys(kutu, kutuVeYazilar.get(i).get(1));
        }
    }

    @And("Click on the Element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dtButonlar) {
        List<String> butonlar=dtButonlar.asList();
        for (int i = 0; i < butonlar.size(); i++) {
            dc.myClick(dc.getWebElement(butonlar.get(i)));

        }
    }
    @And("Click On The Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtButonlar) {
        List<String> butonlar=dtButonlar.asList();
        for (int i = 0; i < butonlar.size(); i++) {
            dc.myClick(dc.getWebElement(butonlar.get(i)));
        }
    }

    @Then("User confirms update succsess")
    public void userConfirmsUpdateSuccsess() {

        dc.verifyMessageContainsText("successfully");
    }

    @And("Click on the element in the LeftNav")
    public void clickOnTheElementInTheLeftNav() {
        dc.myClick(dc.updateProfile);
    }

    @And("updating user informationn")
    public void updatingUserInformationn(DataTable dtKutularveYazilar) {
        List<List<String>> kutuVeYazilar = dtKutularveYazilar.asLists();

        for (int i = 0; i < kutuVeYazilar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilar.get(i).get(0));
            dc.mySendKeys(kutu, kutuVeYazilar.get(i).get(1));
        }
    }

    @And("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent() {
        dc.myClick(dc.updateProfile);
    }



   @Then("User see rhe warning message")
    public void userSeeRheWarningMessage() {

       dc.verifyMessageContainsText("required");

    }




    }

