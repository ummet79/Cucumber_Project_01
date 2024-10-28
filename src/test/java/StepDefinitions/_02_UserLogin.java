package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _02_UserLogin {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    // Statik değişkenler
    public static String username; // Kullanıcı adı
    public static String password; // Şifre

    @When("the user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() { // Kullanıcı geçerli kullanıcı adı ve şifreyi girer

        dc.mySendKeys(dc.username, _02_UserLogin.username); // Kullanıcı adı alanına yazma
        dc.mySendKeys(dc.password, _02_UserLogin.password); // Şifre alanına yazma
    }

    @And("the user clicks the button")
    public void theUserClicksTheButton(DataTable buttonTex) { // Kullanıcı "login" butona tıklar
        List<String> datalar = buttonTex.asList();

        for (int i = 0; i < datalar.size(); i++) {
            dc.myClick(dc.getWebElement(datalar.get(i)));
        }

    }

    @And("the user confirms the message that he has successfully logined")
    public void theUserConfirmsTheMessageThatHeHasSuccessfullyLogined() {
        dc.LoginContainsText(dc.loginText, "Welcome");
        System.out.println("Kayıt olma onayı mesajı: " + dc.loginText.getText()); // Onay mesajını yazdırma
    }
}