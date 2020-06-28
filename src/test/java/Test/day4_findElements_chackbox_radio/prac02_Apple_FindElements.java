package Test.day4_findElements_chackbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class prac02_Apple_FindElements {
    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
// 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

// 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
// 3.Click to iPhone
        //driver.findElements(By.tagName("a"));//return me li
        WebElement iphoneLink = driver.findElement(By.xpath("//span[.='iPhone']/.."));
        iphoneLink.click();
// 4.Print out the texts of all links
        //we need to locate all of the links on the page


        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutrText = 0;
        int linksWithText = 0;
        for (WebElement link : allLinks) {
            String textOfLinks = link.getText();
            System.out.println(textOfLinks);


            if (textOfLinks.isEmpty()) {
                linksWithoutrText++;

            } else {
                linksWithText++;
            }
        }
        // 5.Print ou how many link is missing text
        System.out.println("Number of links without text" + linksWithoutrText);
       // System.out.println("Number of links with text" + linksWithText);

// 6.Print out how many link has text

        System.out.println("number of links with texts===>" + linksWithText);
// 7.Print out how many total lin


    }




    }

