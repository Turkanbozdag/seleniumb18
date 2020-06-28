package Test.TaskPractice;

import javafx.animation.ScaleTransition;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T2_AddRemoveElements {
    public static void main(String[] args) throws InterruptedException {


        //. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        //tagname[.='text']
        WebElement addELementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(1000);
        addELementButton.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("/button[.='delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete button is displayed.Verification passed!");
        } else {
            System.out.println("Delete button is not displayed.Verification failed!");
        }
        // 5. Click to “Delete” button.
        deleteButton.click();
        // 6. Verify “Delete” button is NOT displayed after clicking. USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        try{
        deleteButton.click();

        if (!deleteButton.isDisplayed()) {
            System.out.println("delete button is not displayed after clicking.PASS!");
        } else {
            System.out.println("Delete button is displayed after clicking.FILED!");
        }

    }catch(StaleElementReferenceException exception)

    {


        System.out.println("StaleElementException has been thrown.");
        System.out.println("it means element has been complementl deleted from the HtML.");
        System.out.println("Delete button is not displayed.Verification PASSED!");
    }
    }

    }


