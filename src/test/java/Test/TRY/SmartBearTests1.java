package Test.TRY;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTests1 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter username
        WebElement inputusername=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_username']"));
        inputusername.sendKeys("Tester");
        //enter password
        WebElement iinputPassword=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        iinputPassword.sendKeys("test");

        //click to login
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();

    }
    @Test
    public void p1_smartbear_login_test(){
        //enter username
        WebElement inputusername=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_username']"));
        inputusername.sendKeys("Tester");
        //enter password
        WebElement iinputPassword=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        iinputPassword.sendKeys("test");

            //click to login
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();

        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));
        System.out.println("Number of the links :"+allLinks.size());
        int expectedNumberOfLinks=6;
        int actulNumberOfLinks=allLinks.size();

        Assert.assertEquals(6,actulNumberOfLinks);

        for (WebElement link:allLinks){
            System.out.println(link.getText());
        }
         @Test
            public void p2_smartbear_order_placing() throw  InterruptedException {
            WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
            orderLink.click();

            Select productDropdown=new Select(driver.findElement(By.id("ctl00_MainContent_fmOrder_ddlPro")));
            productDropdown.selectByVisibleText("familyAlbum");

            WebElement quantitiyInput=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
            Thread.sleep(1000);
            quantitiyInput.sendKeys(Keys.BACK_SPACE);
            quantitiyInput.sendKeys("2");
            



        }


    }

    //Tc#1:Smartbear software link verification
    //1open browse





}


 */

