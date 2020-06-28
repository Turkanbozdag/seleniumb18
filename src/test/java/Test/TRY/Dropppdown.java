package Test.TRY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Dropppdown {

        WebDriver driver;

   @AfterMethod
    public void tearDown()throws InterruptedException{
       Thread.sleep(6000);
       driver.close();
   }
   @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/dropdown");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @Test
    public void task3_select_date_test(){
    Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
    yearDropdown.selectByVisibleText("1921");

    String yearactual=yearDropdown.getFirstSelectedOption().getText();
    String yearExpected="1921";


    Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
    monthDropdown.selectByValue("11");
    String monthActual=monthDropdown.getFirstSelectedOption().getText();
    String monthExpected="December";

    Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='day']")));
    dayDropdown.selectByIndex(0);

    String dayactual=dayDropdown.getFirstSelectedOption().getText();
    String dayexpected="1";

       Assert.assertEquals(yearactual,yearExpected);

       Assert.assertEquals(monthActual,monthExpected);

       Assert.assertEquals(dayactual,dayexpected);




   }


}
