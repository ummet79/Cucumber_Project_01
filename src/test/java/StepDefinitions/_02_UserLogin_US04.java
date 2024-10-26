package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _02_UserLogin_US04 {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    // Statik değişkenler
    public static String username; // Kullanıcı adı
    public static String password; // Şifre

    @When("the user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() { // Kullanıcı geçerli kullanıcı adı ve şifreyi girer

        dc.mySendKeys(dc.username, _02_UserLogin_US04.username); // Kullanıcı adı alanına yazma
        dc.mySendKeys(dc.password, _02_UserLogin_US04.password); // Şifre alanına yazma
    }

    @And("the user clicks the button")
    public void theUserClicksTheButton(DataTable buttonTex) { // Kullanıcı "login" butona tıklar
        List<String> datalar = buttonTex.asList();

        for (int i = 0; i < datalar.size(); i++) {
            dc.myClick(dc.getWebElement(datalar.get(i)));
        }

    }
}