package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _07_UpdateContactInfo {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

@Given("Navigate to the ParaBank website")
public void navigateToTheParaBankWebsite() {
    GWD.getDriver().get("https://parabank.parasoft.com");
}

    @And("Click on the element in the LeftNav")
    public void clickOnTheElementInTheLeftNav() {
        dc.myClick(dc.getWebElement("updateContact"));
    }

    @And("updating user information")
    public void updatingUserInformation(DataTable dtFields) {
        List<List<String>> fields = dtFields.asLists();
        for (List<String> row : fields) {
            WebElement field = dc.getWebElement(row.get(0));
            dc.mySendKeys(field, row.get(1));

            // Elementin görünür olduğunu kontrol et ve bekle
            WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(field));
            dc.mySendKeys(field, row.get(1));
        }
    }

    @And("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable buttonTex) {
        List<String> datalar = buttonTex.asList();

        for (int i = 0; i < datalar.size(); i++) {
            dc.myClick(dc.getWebElement(datalar.get(i)));
        }

//    @Then("User sees the warning message <warningMessage>")
//    public void userSeesTheWarningMessage(String expectedMessage) {
//        // Hata mesajını almak için uygun metot
//        String actualMessage = dc.getErrorMessage(); // Hata mesajını al
//        assertTrue("Warning message not displayed", actualMessage.contains(expectedMessage));
//    }


}}

