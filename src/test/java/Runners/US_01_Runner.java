package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_01_UserRegistration.feature", // Kullanıcı kayıt senaryosu
                "src/test/java/FeatureFiles/_02_UserLogin.feature"//Kullanıcı giriş senaryosu
        },
        glue = {"StepDefinitions"}, // Adım tanımları
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Raporlama seçenekleri
        monochrome = true // Konsolda daha okunabilir çıktı için
)
public class US_01_Runner extends AbstractTestNGCucumberTests {
}
