package Test.day6testNG_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Dropdowns_Intro {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //TC#1: Verifying "Simple dropdown" and "State selection" dropdown default values
        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.comdropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String str="something";//local to this method
    }
    /*
    This method is
     */
    @Test
    public void test1_default_value_verification(){

        //3.Verify "Simple dropdown" default selected value is correct
        //  Expected: "Please select an option"
        Select simpleDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String actualDefaultOfSimpleDropdown=simpleDropDown.getFirstSelectedOption().getText();
        String expectedDefaultOfSimpleDropdown="please select an option";

        Assert.assertEquals(actualDefaultOfSimpleDropdown,expectedDefaultOfSimpleDropdown);
        //4.Verify"State selection" default selected value is correct
        //  Expected: "Select a State"
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualDefaultOfStateDropdown=stateDropdown.getFirstSelectedOption().getText();
        String expectDefaultOfStateDropdown="Select a state";

        Assert.assertEquals(actualDefaultOfSimpleDropdown,expectedDefaultOfSimpleDropdown);

    }
public void test2_state_dropdown_verification() throws InterruptedException {
       // TC #2: Selecting state from State dropdown and verifying result 1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //locating state dropdown
        Select stateDropdown=new Select((driver.findElement(By.xpath("//select[@id='state']"))));
        //3. Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByValue("IL");
        //4. Select Virginia
        //selectting using selectByVisibleText(
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("virginia");
        // 5. Select California
        //selecting using selectByIndex();method-->Expects us to pass the index number of the option.
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedOption="California";
        String actualSelectedOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelectedOption,expectedOption);
        Assert.assertTrue(actualSelectedOption.equals(expectedOption));
       // Use all Select options. (visible text, value, index)





    }


}
