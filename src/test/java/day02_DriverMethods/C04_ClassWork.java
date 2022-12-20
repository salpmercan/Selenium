package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C04_ClassWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Acilan browser i tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Tum elemanlarin yuklenmesi icin sure atamasi yapiyoruz

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Search bölümünü locate edip, “city bike” aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi=driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuc Sayisi = "+aramaSonucYazisi.get(0).getText());

        //Arama sonuc sayisini konsola yazdirin
        String [] sonucSayisi= aramaSonucYazisi.get(0).getText().split(" ");//Arama Sonuc Sayisi = 1-16 of 148 results for "city bike"
        System.out.println("Sonuc Sayisi: "+ sonucSayisi[0]);

        //Sonuc sayisini lambda ile yazdirin
        Arrays.stream(aramaSonucYazisi.get(0).getText().split("")).limit(3).skip(2).forEach(System.out::println);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.ILK resmi locate ettik, cok sayida elemet oldugu icin List icine aldik
        //get(0) ile ilk elementi aldik ve click tusu ile sectik
        List<WebElement>ilkWebElement=driver.findElements(By.className("s-image"));
        ilkWebElement.get(0).click();


    }
}
