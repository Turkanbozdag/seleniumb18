package Test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args)throws  InterruptedException {
        //1-this line creates the connection between driver and selenium.
        //And sets up the driver.
       // WebDriverManager.FirefoxDriver().setup();
        WebDriverManager.chromedriver().setup();//burasi hep olacak

        //2-creating the instance of ChromeDriver to be able toda action on ChromeBrowser
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();//burasi ekrani buyuk yapiyo full screen after opening it
        //driver.manage().window().fullscreen();aynisiu ustteki ile hangisini istersen
        //for firefox
      // WebDriver driver1=new FirefoxDriver();

        //3-we get gpogle.com
        //driver.get("https://www.google.com");
        String googleUrl="https://www.google.com";
        driver.get("https://www.google.com");
        System.out.println("driver.getTitle()---->"+driver.getTitle());//getTitle yazdiki arkada codlari gostersin
        System.out.println("driver.getCurrent()");
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getCurrentUrl());

        //Browser navigations
        //this line will take user to the previous page
        Thread.sleep(2000);//sleep handel it mainde this line adds 6000 milliseconds of wait=6seconds
        driver.navigate().back();
        //Thread.sleep is being added just to be able to see selenium movements
        Thread.sleep(2000);
        driver.navigate().forward();//this line will go to next page


        Thread.sleep(2000);
        driver.navigate().refresh();//this line will refres the page

        //driver.navigate().to("https://www.facebook.com");//("accepts a string for url") and take you to that page



        //driver.get("Url")vs driver.navigate().to("URL")
        //they both do exactly the same thing.
        //driver.get()will wait the page to be loaded before continuing
        //-driver.navigate()to()does not wait the whole page to be loaded,just continues.whic sometimes crestes issues.
        //-for example:if there is a link that you want to click,but if your code is trying to click it before it is loaded to the page,it will throw an exception.


        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getTitle());//gettitle doenot acept any  parameter

        //System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());//driver.getCurrentUrl();gets the url of the current page and return it as a String return type is String
        //it does not accept any parameters
        //-the url of the page is usually used to confinm what page

        System.out.println(driver.getPageSource());//this method will return the page source of the current
        //driver.close() will close the current browser tab
        //driver.quit() will close all of the tabs,and ends the sesion



    }





}
