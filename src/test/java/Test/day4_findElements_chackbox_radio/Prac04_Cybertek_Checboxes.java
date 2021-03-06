package Test.day4_findElements_chackbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Prac04_Cybertek_Checboxes {

    public static void main(String[] args) {

        //  Practice:	Cybertek	Checkboxes
        // 1.
        // Go	to
        // http://
        // practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checboxes");
        // 2.
        // Confirm	checkbox	#1	is	NOT	selected	by	default

        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        if (!checkbox1.isDisplayed()) {
            System.out.println("checkbox 1 is not selected .Verificatioin PASSED!");


        } else {
            System.out.println("Checbox 2is not selected.Verification FAILED!");

        }

       // 3.
        //Confirm	checkbox	#2	is	SELECTED	by	default.
        WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboes']input[2]"));
        if (checkbox2.isSelected()){
            System.out.println("checkbox 2");
        }


      //  4.
       // Click	checkbox	#1	to	select	it.
        //Thread.sleep(1000);
        //checkbox1.click();
      //  5.
      //  Click
      //  checkbox	#2	to	deselect	it.

       // 6.
        //Confirm	checkbox	#1	is	SELECTED.
        //7.
        //Confirm	checkbox	#2	is	NO




    }





}


