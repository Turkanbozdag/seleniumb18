package Test.day9_testbase_properties_driverUtil;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {
    WebDriver driver;
    @BeforeMethod
    public  void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void  multiple_window_test(){
   driver.get("https:/www.amazon.com");
   //we are downcasting our driver to javascriptExecutor to be able to use its
        ((JavascriptExecutor)driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("windo.open('http://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://facebook.com','_blank');");
        //5.Creat a logic to switch to the rtab where Etsy.com is open
        Set<String>windowHandles=driver.getWindowHandles();
        for (String each:windowHandles){
            driver.switchTo().window(each);
            System.out.println("current title:"+driver.getTitle());
            if (driver.getCurrentUrl().contains("etsy")){
                //6Assert:Title contains "ETsy"
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }
        }



    }









}
