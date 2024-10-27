package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_04_AccountCreation.feature",
                "src/test/java/StepDefinitions/_07_UpdateContactInfo.java" // Kullanıcı kayıt senaryosu,Kullanıcı giriş senaryosu,Hesap oluşturma senaryosu
        },
        glue = {"StepDefinitions"}// Adım tanımları

)
public class US_07_Runner extends AbstractTestNGCucumberTests {
}
