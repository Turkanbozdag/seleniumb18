package Test.day2_findElement_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.HKSCS;

public class prac3_LinkTextLocator {
    public static void main(String[] args) {
        //1-open a chrome browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //2-Click to Gmail link from right top
        driver.findElement(By.linkText("Gmail")).click();
        //3-verif title contains Gmail,expected:"Gmail"

        String actualGmailTitle=driver.getTitle();
        String expectedTitle="Gmail";

        if (actualGmailTitle.contains(expectedTitle)){
            System.out.println("Gmail title verification passed!");
        }else {
            System.out.println("Gmail title verification failed!!");
        }
        //4-go back to google page by using back()
            driver.navigate().back();//COMES back line
        String actualTitle=driver.getTitle();
        String expectedtitle="facebook";//bilerek facebook yazdim geri donusu oraya gitmeyecek ama failed yada paased gormek icin yazdim
        if (actualTitle.equals(expectedtitle)){
            System.out.println("Google page title verification PASSED!");
        }else{
            System.out.println("Google page title verification FAILED!!!");
        }
    }
}
