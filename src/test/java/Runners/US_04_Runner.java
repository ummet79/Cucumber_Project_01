package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_04_AccountCreation.feature", // Kullanıcı kayıt senaryosu,Kullanıcı giriş senaryosu,Hesap oluşturma senaryosu
        },
        glue = {"StepDefinitions"}, // Adım tanımları
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Raporlama seçenekleri
        monochrome = true // Konsolda daha okunabilir çıktı için
)
public class US_04_Runner extends AbstractTestNGCucumberTests {
}
