package Test.OfficeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class June24 {
    WebDriver driver;
    SoftAssert softAssert;
    @BeforeMethod

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();//to open chrome browser for test
        softAssert=new SoftAssert();


      //  @BeforeMethod
        //public void classSetup(){
         //   System.out.println("some class setup");
        }

   // }

    @Test(description = "Test for Google",priority = 1)
    public void test(){
        driver.get("http://google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
        softAssert.assertEquals(driver.getTitle(),"Google");
        //enter java hit enter button
        driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
        WebElement result=driver.findElement(By.id("result-status"));

        System.out.println(result.getText());
        List<WebElement> searchResilt=driver.findElements(By.tagName("h3"));
        searchResilt.removeIf(item->item.getText().isEmpty());



        softAssert.assertAll();//
    }
    @Test(description = "Test for Amazon",priority = 2)
    public void amazonTest(){
        driver.get("http://amazon.google");
        System.out.println("Before assertion");

        Assert.assertTrue((driver.getTitle().contains("Amazon")));
        System.out.println("After assertion");
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));


    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }





}
