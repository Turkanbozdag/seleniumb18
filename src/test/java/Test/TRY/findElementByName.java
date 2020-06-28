package Test.TRY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementByName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.commultiple_buttons");
        WebElement button2=driver.findElement(By.name("button2"));
         button2.click();
         WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText());
        driver.close();



    }
}
