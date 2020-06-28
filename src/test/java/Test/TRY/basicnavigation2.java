package Test.TRY;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicnavigation2 {
    public static void main(String[] args) throws InterruptedException {
        //to setup chrome driver
        WebDriverManager.chromedriver().setup();
        //to create an object of chromeDriver class
        ChromeDriver driver=new ChromeDriver();
        String url="http://google.com";
        String url2="http://amazon.com";

        //will open browser with url
        driver.get(url);
        Thread.sleep(3000);
        driver.navigate().refresh();
        //will put on hold current run on 3 seconds
        Thread.sleep(3000);
        driver.navigate().forward();
        //will navigate back to the provious url
        driver.navigate().back();


        driver.navigate().to(url2);
        //will close web browser
        driver.close();






    }





}
