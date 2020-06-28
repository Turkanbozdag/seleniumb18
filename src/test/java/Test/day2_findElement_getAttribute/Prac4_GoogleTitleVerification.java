package Test.day2_findElement_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC
#
4
:
Google	search
1Open	a	chrome	browser
2Go	to:
https://google.com
3
-
Write	“apple”	in	search	box
4
-
Click	google	search	button
5
-
Verify	title:
Expected:	Title	should	start	with	“ap

 */
public class Prac4_GoogleTitleVerification {
    public static void main(String[] args) {
        //google search
        //open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//pencereyi buyutuyor full ekran yani

        //go to:https//google.com
        driver.get("https://www.google.com");
        //write "apple" seacrh box
       // driver.findElement(By.name("q")).sendKeys("Apple kirmizi "+ Keys.ENTER);//it look your html code it will get element to you//locator
        //verfy title
        ///thread.sleep();
        //4-click google search button
        driver.findElement(By.name("btnK")).click();
        String actualTitle=driver.getTitle();
        String exceptedInTitle="apple";
        if (actualTitle.startsWith(exceptedInTitle)){
            System.out.println("google seacrh title verification Passed!");
        }else {
            System.out.println("Google search title verification Faild!!!");
        }



    }
}
