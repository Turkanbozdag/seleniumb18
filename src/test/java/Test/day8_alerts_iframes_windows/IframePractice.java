package Test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void iframa_practice_test(){
        //1-
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //switching to iframe using webElement
        driver.switchTo().frame(iframe);

        //4.Assert:"your content goes here."Text is displayed.
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //we have to switch back to default html to be Able to locate anything in there
        driver.switchTo().parentFrame();

        //switching to iframe using indexes
        //driver.switchTo().frame(0);

        //switching to iframe using id or name attribute value
        driver.switchTo().frame("mce_0_ifr");


        //5.Assert:"An iframe containing theMCE WYS
        WebElement h3Text=driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(h3Text.isDisplayed());



    }




}
