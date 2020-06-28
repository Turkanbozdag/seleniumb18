package Test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/*
public class DropdownsPractices {
    public static void main(String[] args) {


        WebDriver driver;
        @BeforeClass
        public void setUp(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/dropdown");

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        @Test
        public void p7_month_dropdown_default_value_test() {
            //Location the dropdown
            Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
            //we need to create our scty
            String actualDropdown = monthDropdown.getFirstSelectedOption().getText();
            System.out.println("actualDropdown="+actualDropdown);
            String expectedDropdown = LocalDateTime.now().getMonth().name();
            System.out.println("expectedDropdown="+expectedDropdown);
            //1-first way of doing this assertion
            Assert.assertEquals(actualDropdown.toLowerCase(),expectedDropdown.toLowerCase());
            //2-Second way of doing same assertion
        Assert.assertTrue(actualDropdown.equalsIgnoreCase(expectedDropdown));
        //PRaCTICe#8
            List<WebElement>actualDropdownOptions=monthDropdown.getOptions();

            List<String>expectedDropdownOptions= Arrays.asList("january","february","March","April","May","june","july","Agust","September","october","November","December");
          //  Assert.assertEquals(actualDropdownOptions,expectedDropdownOptions);
            List<String>actualMonthsText=new ArrayList<>();
            for (WebElement each:actualDropdownOptions){
                actualMonthsText.add(each.getText());
            }
            Assert.assertEquals(actualMonthsText,expectedDropdownOptions);




        }
    }

}

 */
