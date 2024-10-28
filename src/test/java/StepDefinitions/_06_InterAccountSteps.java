package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _06_InterAccountSteps {

        LeftNav ln = new LeftNav();
        DialogContent dc = new DialogContent();
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

        @Then("Login Success Message Should be Displayed")
        public void loginSuccessMessageShouldBeDisplayed() {

            Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("overview"));
        }

        @Then("Transfer Page Should be Displayed")
        public void transferPageShouldBeDisplayed() {

            Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("transfer"));
        }


        @Then("Transfer Confirmation Message")
        public void transferConfirmationMessage() {
            wait.until(ExpectedConditions.visibilityOf(dc.transferControlMessage));
            Assert.assertTrue(dc.transferControlMessage.getText().contains("Complete"));
        }

        @And("Funds Transfer Transaction Received")
        public void fundsTransferTransactionReceived(DataTable dt) {
            List<String> butonlar = dt.asList();

            for (int i = 0; i < butonlar.size(); i++) {

                dc.myClick(dc.getWebElement(butonlar.get(i)));
            }


        }

        @And("Amount Transaction Control")
        public void amountTransactionControl(DataTable dtnumber) {
            List<String> butonlar = dtnumber.asList(String.class);

            for (int i = 0; i < butonlar.size(); i++) {
                double item1 = Double.parseDouble(butonlar.get(i));
                double item2 = Double.parseDouble(dc.amountControl.getText().replace(",00", "").replace("$", ""));
                Assert.assertEquals(item1, item2, "Para transfer kontrolü başarısız");
            }


        }

        @And("User send keys and click in Dialog for Find Transaction Id")
        public void userSendKeysInDialogForFindTransaction() {
            dc.myClick(dc.fromAccountId);
            dc.myClick(dc.lastFundsTransferReceived);
            String text = dc.transactionIdtext.getText();
            ln.myClick(ln.findTransactions);
            dc.myClick(dc.selectAccountInFindTransaction);
            wait.until(ExpectedConditions.visibilityOf(dc.selectLastNumber));
            dc.myClick(dc.selectLastNumber);
            dc.mySendKeys(dc.transactionIdinput, text);
            dc.myClick(dc.findTransactionButton);
            // Assert.assertTrue(dc.amountControl.equals(dc.amountControl2));


        }

}
