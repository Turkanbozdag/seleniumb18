package Test.TRY;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeClassname {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http:practice.cybertekschool.com");
        List<WebElement>listOfExamples=driver.findElements(By.className("list_group=item"));
        System.out.println("size: "+listOfExamples.size());
        Thread.sleep(3000);
        driver.close();




    }




}
