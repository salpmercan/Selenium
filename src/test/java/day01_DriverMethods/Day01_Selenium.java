package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak icin classimiza otomasyon icin gerekli olan webdriverin yerini
        gostermemiz gerekir. Bunun icin Java kutuphanesinden Systtem.setProperty() methodunun icine ilk olarak
        driveri yazariz, ikinci olarak driverin fiziki yolunu kopyalariz.
         */
        WebDriver driver =new ChromeDriver();//webdriver bir interface o yuzden chromedriver class oldugu icin objeyi boyle olusturduk
        driver.get("https://www.techproeducation.com");


    }
}
