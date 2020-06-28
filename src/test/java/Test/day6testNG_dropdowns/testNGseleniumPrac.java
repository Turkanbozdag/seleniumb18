package Test.day6testNG_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class testNGseleniumPrac {
    WebDriver driver;//method
    @BeforeMethod
    public void setUp(){
        //goAl is to open new browser for each test.
        //what annotation I should be using for this?beforeMethod or BeforeClass?
        driver=WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.google.com");
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        //5-close browser
        Thread.sleep(2000);
       // driver close();
    }

    @Test(priority = 2)
    public void google_title_test(){
        //1-go to:http://www.google.com
       WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");

        //2-verify title:google
        String expectedtitle="google";
        String actulTitle=driver.getTitle();
        //the line where we do assertion
        //if you use asserttrue,
        //argument you are passing is supposed to be returning boolean
        //if you are using assertEquals,
        //you need to pass two arguments of the same type
        Assert.assertEquals(actulTitle,expectedtitle);
    }
    public void google_search_title_verification() throws InterruptedException {
        //1-open browser
        //2-go to http:/google.com
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        //3-search "apple"
        WebElement appleSearchBox=driver.findElement(By.name("q"));
        appleSearchBox.sendKeys("apple"+ Keys.ENTER);
        //4-verif title contains "apple"
        String expectedInTitle="apple";
        String actualtitle=driver.getTitle();

        //5close browser
        Thread.sleep(2000);
        driver.close();
    }




}
