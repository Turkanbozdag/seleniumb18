package Test.day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class CssSelectorExample {
    public static void main(String[] args) throws  InterruptedException {
        //search Amazon
        //1.open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2-go to https://amazon.com
        driver.get("https://www.amazon.com");
        WebElement amazonSearch =driver.findElement(By.cssSelector("input[tabindex='19']"));//amazonda anldig kisim
        amazonSearch.sendKeys("woodenspoon"+ Keys.ENTER);
        String actualTitle=driver.getTitle();
        String expectedInTitle="Wooden spoon";
        Thread.sleep(1000);
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }






    }



}
