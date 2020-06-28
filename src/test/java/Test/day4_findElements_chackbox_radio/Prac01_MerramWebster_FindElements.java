package Test.day4_findElements_chackbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;


import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Prac01_MerramWebster_FindElements {
    public static void main(String[] args) {


//TC #
//0
//:
//FINDELEMENTS
//1.//Open Chrome browser


//



        //2//Go to//https://www.merriam//webster.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("http://www.merriam-Webster.com");
//3.//Print out the texts of all links all links demis diye a yazdik body den sonra


        List<WebElement> listOfLinks = Objects.requireNonNull(driver).findElements(By.xpath("//body//a"));//return me ALL of links bu satir
        //option +enter to import in mac
        //alt+eneter for windows
        int linksWithoutText=0;
        int linksWithText=0;
        for (WebElement eachLink : listOfLinks) {
            //System.out.println(eachLink.getText());
            String textOfEachLink = eachLink.getText();


            if (textOfEachLink.isEmpty()) {
                linksWithoutText++;

            } else {
                System.out.println(eachLink.getText());
            }
        }
        //4-Print out how many link is missing text
        System.out.println("The number Of links that dioes not have tex:"+linksWithoutText);
//5.Print out howmany link has text
        System.out.println("The number ofn links thsty has text:"+linksWithText);

//6.Print out how many total link
        System.out.println("Total links on this page:"+listOfLinks.size());


    }
}