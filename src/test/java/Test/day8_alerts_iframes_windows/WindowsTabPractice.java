package Test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;

public class WindowsTabPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/windos");

    }
    @Test
    public void p5_window_handel_practice(){
        String currentWindowHandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle="+currentWindowHandle);
        WebElement clickHereLink=driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereLink.click();
        //driver.getWindowHandles()--->returns us A SET of String
        Set<String>windowHandles=driver.getWindowHandles();

        for (String each:driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println(driver.getTitle());
            //if (driver.getTitle().equals("New Window")){
              //  Assert.assertTrue(driver.getTitle().equals("NEW WINDOW"));
               // break;

            }
        driver.switchTo().window(currentWindowHandle);
        System.out.println(driver.getTitle());
           // System.out.println(driver.getTitle());
        }
    }







