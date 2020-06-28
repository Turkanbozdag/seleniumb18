package Test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac3_CyberetekVerification {
    public static void main(String[] args) {

       // TC #3: PracticeCybertek/ForgotPassword URL
       // verification1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
  //  2.Go to http://practice.cybertekschool.com/forgot_password
        String sentence="this is a sentence";
       // sentence.split();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("anyemail@email.com");
        driver.findElement(By.id("form_sumbmit"));
        // 4.Click on Retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        // 5.Verify URL contains: Expected: “email_sent”
        String actualUrl=driver.getCurrentUrl();
        String expectedInURL="email_sent";
        if (actualUrl.contains(expectedInURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”Hint: You need to use getText method for this practice
        WebElement confirmationMessage=driver.findElement(By.name("confirmation _message"));//
       // String actuallMessage=driver.findElement(by.name("confirmation_message")).get.Text();
       String actualMessageText= confirmationMessage.getText();
       String exceptedMessageText="Your e-mail's been sent!";
       if (actualMessageText.equals(exceptedMessageText)){
           System.out.println("Confirmation message text verification PASSEd!");
       }else{
           System.out.println("COnfirmation message text verification FAILED");
       }
       if (confirmationMessage.isDisplayed()) {//boolean gibi olursa orda true yoksa false
           System.out.println("MEssage is displayed,verification PASSED!");

       }else{
           System.out.println("Message is not displayed,verification FAILED!");
       }



    }
}
