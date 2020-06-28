package Test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac4_ZeroBankURLVerification {
    public static void main(String[] args) {
      //  TC #4: Zero Bank URLverification
        //  1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //  2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //  3.Get attribute value of href from the “forgot your password”link
      WebElement forgotPasswordLink= driver.findElement(By.partialLinkText("forgot"));
        //  4.Verify attribute value containsExpected:
        //  “/forgot-password.html”SOLUTION: NEXT PAGE. Try to solve yourself before looking at the solution.Hint: Locate the “Forgot your password ?” link, and use getAttribute value method to get the link behind the attribute within.
       String actualHrefValue= forgotPasswordLink.getAttribute("href");
       String expectedInHrefValue="/forgotedHrefValue="+actualHrefValue;
        System.out.println("actualHrefValue=" +actualHrefValue);
        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href value verification PASSED!");
        }else{
            System.out.println("Href value verification Failed!");
        }
        System.out.println("Is forgot password displayed?"+forgotPasswordLink.isDisplayed());




    }
}
