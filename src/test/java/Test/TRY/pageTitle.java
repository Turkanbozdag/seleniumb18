package Test.TRY;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("http://google.com");
        Thread.sleep(5000);
        String title=driver.getTitle();
        System.out.println(title);





    }
}
