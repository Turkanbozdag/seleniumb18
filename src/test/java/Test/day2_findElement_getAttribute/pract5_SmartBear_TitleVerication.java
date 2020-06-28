package Test.day2_findElement_getAttribute;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC
#
5
:
Basic	login	authentication


 */
public class pract5_SmartBear_TitleVerication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//setup ,y driver
        WebDriver driver=new ChromeDriver();//intiatiate my driver
        driver.manage().window().maximize();//full my windos

        //2Go	to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

       // 3 Verify title
       // equals:
        //Expected:	Web	Orders	Login
        //Expected:web orders login
        String actualTitle=driver.getTitle();
        String expectedtitle="Web Orders Loging";
        if (actualTitle.equals(expectedtitle)){
            System.out.println("HomePage title verification PASSEd!");
        }else{
            System.out.println("HomePage title verification FAILED!!!");
        }

       // 4Enter	username:	Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");//Tester requirementta geldi
       // 5Enter	password:	test
        driver.findElement(By.name("name=\"ctl00$MainContent$password")).sendKeys("test");
        //6Click
        //“Sign	In”	button
        driver.findElement(By.name("ctl00_MainContent_login_button")).click();
        //7Verify	title
        //equals
       // :
        //Expected:
        //Web	Or
        //--actual title<---  -->expected title<----
        if (driver.getTitle().equals("Web Orders")){
            System.out.println("Landing page title verification passed!");
        }else {
            System.out.println("Landing page title verification failed");

        }
    }




}
