package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ParentPage {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void myClick(WebElement element) {
         wait.until(ExpectedConditions.elementToBeClickable(element));
         scrolltoElement(element);
         element.click();
    }

    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void LoginContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()) );
    }

    // Örnek olarak bırakıldı
    public void verifyMessageContainsTextINCELEME(String value){
        // Problem : mesajın hızlı çıkıp kaybolması dolayısıyla, getText in oluşamaması ve Assert yapamamamız.
        // Amaç : Mesajın çıktığı noktadaki elementin bu mesjaını başka nasıl Assert yapabilirim.

        //List<WebElement> MesajKutusuElementleri=
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        // ukarıdaki elemanlar en az 1 den fazla olana kadar yani MESAJ kutusu gözükene kadar bekle

//        System.out.println("MesajKutusuElementleri.size() = " + MesajKutusuElementleri.size());
//        for(WebElement e : MesajKutusuElementleri)
//            System.out.println("->"+e.getText()+"<->"+e.getAccessibleName()+"<->"+e.getTagName());


       // WebElement MesajKutusuParent1=GWD.getDriver().findElement(By.xpath("//hot-toast-container/div/div/div"));
        WebElement MesajKutusuParent2=GWD.getDriver().findElement(By.tagName("mat-panel-description"));  //mat-expansion-panel-header
//
//        System.out.println("MesajKutusuParent2.getText() = " + MesajKutusuParent2.getText()); // Ekranda gözüken text
//        System.out.println("MesajKutusuParent2.getAccessibleName() = " + MesajKutusuParent2.getAccessibleName()); // Ekrandan ulaşıbilen her bilgisi, sana html den veriyor
//        System.out.println("MesajKutusuParent2.getTagName() = " + MesajKutusuParent2.getTagName()); // tag name
//        System.out.println("MesajKutusuParent2.getAttribute(innerHTML) = " + MesajKutusuParent2.getAttribute("innerHTML")); // Taglerinin arasındaki HTML KODU

        Assert.assertTrue( MesajKutusuParent2.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }



}








//Text e bir veri göndermek için
//gerekli olanlar
//
//-Görünür olana kadar bekle(wait)
//-Elemente kadar scroll yap (var ise)
//-içini temizle
//-veriyi gönder
//
//
//Button için neler yapılır
//
//-Clickable olana kadar bekle(wait)
//-Elemente kadar scroll yap
//-Click yap

/* Mesaj Assert İnceleme  */
//MesajKutusuParent2.getText() =
//        MesajKutusuParent2.getAccessibleName() = Country successfully created
//MesajKutusuParent2.getTagName() = mat-expansion-panel-header
//MesajKutusuParent2.getAttribute(innerHTML) =
//
//<span class="mat-content ng-tns-c2622717266-70 mat-content-hide-toggle">
// <!---->
//    <mat-panel-description _ngcontent-ng-c2614087749=""
//class="mat-expansion-panel-header-description ng-star-inserted">
//
//     <div _ngcontent-ng-c2614087749="">Country successfully created</div>
//
//    </mat-panel-description><!---->
//
//</span><!---->
//
//        -----------------------------------------------------------------------------
//
//        MesajKutusuParent2.getText() =
//        MesajKutusuParent2.getAccessibleName() =
//        MesajKutusuParent2.getTagName() = mat-panel-description
//MesajKutusuParent2.getAttribute(innerHTML) =
//  <div _ngcontent-ng-c2614087749="">Country successfully created</div>