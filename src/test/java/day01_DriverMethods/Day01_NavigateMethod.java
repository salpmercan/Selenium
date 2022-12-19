package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");//driver.get ile driver.navigate()to ayni sekilde calisir

        //techproeducation sayfasina gidelim

        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");

        //Sonra tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar techproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Son sayfada sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Ve sayfayi kapatalim
        driver.close();

    }
}
