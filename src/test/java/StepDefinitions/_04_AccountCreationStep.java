package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _04_AccountCreationStep {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("The user clicks on the Element in Content")
    public void clickOnTheElementInContent(DataTable buttons) {
        List<String> link = buttons.asList();

        for (int i = 0; i < link.size(); i++) {
            ln.myClick(ln.getWebElement2(link.get(i)));
        }
    }

    @Then("The user is directed to the bank account creating page")
    public void theUserIsDirectedToTheBankAccountCreatingPage() {
        String currentUrl = GWD.getDriver().getCurrentUrl(); // Mevcut URL'yi alma
        Assert.assertTrue(currentUrl.contains("openaccount"), "Hesap açma sayfasına yönlendirilmedi."); // URL'nin beklenen kısmı içerip içermediğini kontrol etme
        System.out.println("Kullanıcı banka hesap açma sayfasına yönlendirildi.");
    }


    @And("The user selects the {string} type from the drop-down menu")
    public void theUserSelectsTheTypeFromTheDropDownMenu(String accountType) {
        if (accountType.equalsIgnoreCase("CHECKING")) {
            dc.myClick(dc.checking);
            System.out.println("Seçilen hesap türü: CHECKING");
        } else if (accountType.equalsIgnoreCase("SAVINGS")) {
            dc.myClick(dc.savings);
            System.out.println("Seçilen hesap türü: SAVINGS");
        } else {
            Assert.fail("Geçersiz hesap türü: " + accountType);
        }

    }

    @And("The user receives a warning that the new bank account should have a minimum balance")
    public void theUserReceivesAWarningThatTheNewBankAccountShouldHaveAMinimumBalance() {
        dc.LoginContainsText(dc.minimumBalanceWarning, "minimum "); // Uyarı mesajını içeren WebElement'i alma
        System.out.println("Minimum bakiye uyarı mesajı alındı."); // Uyarı mesajını yazdırma
    }

    @And("The user selects from Dropdown menu")
    public void theUserSelectsTheAccountNumberFromTheDropDownMenu(DataTable selectAccountNumber) {
        List<String> link = selectAccountNumber.asList();
        for (int i = 0; i < link.size(); i++) {
            dc.myClick(dc.getWebElement(link.get(i)));
            System.out.println("Seçilen hesap numarası: " + link.get(i)); // Seçilen hesap numarasını yazdırma
        }
    }

    @And("The user clicks on the Element in Dialog")
    public void theUserClicksOnTheElementInDialog(DataTable button) {
        List<String> link = button.asList();
        for (int i = 0; i < link.size(); i++) {
            dc.myClick(dc.getWebElement(link.get(i)));
            System.out.println("Tıklanan element: " + link.get(i)); // Tıklanan elementi yazdırma
        }
    }

    @Then("The user confirms the successful creation of the new bank account")
    public void theUserConfirmsTheSuccessfulCreationOfTheNewBankAccount() {
        dc.LoginContainsText(dc.accountOpenedText, "Congratulations");
        System.out.println("Hesap açma onayı mesajı: " + dc.accountOpenedText.getText()); // Onay mesajını yazdırma
    }

    @And("The user clicks on the generated account number.")
    public void theUserClicksOnTheGeneratedAccountNumber() {
        dc.myClick(dc.accountNumberClick);
        System.out.println("Oluşturulan hesap numarasına tıklandı."); // Tıklama eylemini yazdırma
    }

    @Then("The user verifies their information in the account details {string}")
    public void theUserVerifiesTheirInformationInTheAccountDetails(String text) {
        ln.wait.until(ExpectedConditions.textToBePresentInElement(dc.AccountDetails, text));
        dc.LoginContainsText(dc.AccountDetails, text);
        System.out.println("Hesap detaylarında doğrulama yapıldı: " + text); // Doğrulamayı yazdırma
    }

}
