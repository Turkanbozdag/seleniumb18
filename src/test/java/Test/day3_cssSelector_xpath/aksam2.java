package Test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import utilities.WebDriverFactory;

public class aksam2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement forgotPasswordLink =driver.findElement(By.linkText("Forgot your password?"));
       // driver.findElement(By.partialLinkText("Forgot"));
       String actualHrefValue= forgotPasswordLink.getAttribute("href");
        String expectedInHrefValue="/forgot-password.html";
        System.out.println("actualhrefValue="+actualHrefValue);

        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("href value verification PASSED!");
        }else{
            System.out.println("Href value verification FAILED!");
        }
        System.out.println(forgotPasswordLink);
        System.out.println("Is forgot password displayed?"+forgotPasswordLink.isDisplayed());






    }
}
