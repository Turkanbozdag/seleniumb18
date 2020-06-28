package Test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_GoogleTitleVerification {
    public static void main(String[] args) {

       //TC	#1

//Google	Title	Verification
///1.
//Open	Chrome	browser
//2.set up my webdriver
        WebDriverManager.chromedriver().setup();//hep ilk


        //create an instance of my chrome driver
        WebDriver driver=new ChromeDriver();


        //make the browser full screen
        driver.manage().window().maximize();
        //2.go to https://www.google.com
        driver.get("https:/www.google.com");
//Go	to
//https://www.google.com
//3.Verify title:Expected:	Google
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        //actualTitle
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification Passed!");
        }else{
            System.out.println("Google title verification Failed!!!");
        }












    }
}
