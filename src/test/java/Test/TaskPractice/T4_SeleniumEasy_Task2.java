package Test.TaskPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class T4_SeleniumEasy_Task2 {
    public static void main(String[] args) {
        //TC #2: SeleniumEasy CheckboxVerification–Section
        // 11.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Success –Check box is checked” message is NOTdisplayed
        WebElement checkAllButton=driver.findElement(By.xpath("//button[@id='check1']"));
        String actualtext=checkAllButton.getAttribute("value");
        String expectedtext="Check All";

        if(actualtext.equals(expectedtext)){
            System.out.println("button text verification passe!");


        }else{
            System.out.println("Button text verification failed!!!");
        }
        // .4.Click to checkbox under “Single Checkbox Demo” section
        checkAllButton.click();
        // 5.Verify “Success –Check box is checked” message isdisplayed.
        List<WebElement>checkboxList= driver.findElements(By.xpath("//input[@class='cb1-"));
        for (WebElement checkbox:checkboxList){
            if (checkbox.isSelected()){
                System.out.println("checkbox is selected.PASS!");
            }else{
                System.out.println("Checkbox is not selected.Fail!");
            }
        }
        //6.Verify button text changed to "Uncheck All"
        String actualButtonTextAfterClick=checkAllButton.getAttribute("value");
        String expectedValueAfterClick="Uncheck All";
        if (actualButtonTextAfterClick.equals(expectedValueAfterClick)){
            System.out.println("final verification PASSED!");
        }else{
            System.out.println("final verification FAILED!!!");
        }
        // TC #3: SeleniumEasy Checkbox Verification –Section
        // 21.Open Chrome browser
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify “Check All” button text is “Check All”
        // 4.Click to “Check All” button
        // 5.Verify all check boxes are checked
        // 6.Verify button text changed to “Uncheck All”





    }





}
