package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_01_UserRegistration.feature", // Kullanıcı kayıt senaryosu
                "src/test/java/FeatureFiles/_02_UserLogin.feature",//Kullanıcı giriş senaryosu
                "src/test/java/FeatureFiles/_07_ContactInfoGüncelleme.feature" // Kullanıcı kayıt senaryosu,Kullanıcı giriş senaryosu,Hesap oluşturma senaryosu
        },
        glue = {"StepDefinitions"}// Adım tanımları

)
public class US_07_Runner extends AbstractTestNGCucumberTests {
}
