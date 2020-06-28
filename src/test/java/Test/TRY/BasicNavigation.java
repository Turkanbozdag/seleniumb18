package Test.TRY;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();






    }




}
