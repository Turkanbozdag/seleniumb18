package Test.day8_alerts_iframes_windows;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class WebtablePractices {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //TC1:Smartebear software link verification
        //1Open browser
        //2-go to website:
        //http://secure.smartbearsoftware.com/samplestestcop
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/webOrders/login.aspx");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
    //}
    //@Test
 //  public static void login(WebDriver driver) throws InterruptedException{
     //   SmartBearUtilities.login(driver);
        //SmartBearUtilities.verifyOrder(driver,"paul");

   // }
   // @Test
  //  public void p5_print_names_cities_test(){
     //   SmartBearUtilities.login(driver);
     //   SmartBearUtilities.printNamesAnd
    //}
    /*
    @param:Web
     */
    /*
        public static void verifyOrder(WebDriver driver,String name) {
            //find and store all of the names in our web table in a list of web element
          //  List<WebElement> namesList = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
           // for (WebElement each : namesList) {
               if (each.getText().equals(name)) {
                    Assert.assertTrue(true);
                    return;
                }
            }
            Assert.fail("The name does not exist in the list!Verification failed!");
        }
        public static void printNamesAndCities(WebDriver driver){
            //the list where we store all the names
            List<WebElement>namesList=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/"))

                    //
            //
            List<WebElement>citiesList=driver.findElements(By.xpath("//table[@id='ctl00_MainContetnt_orderGrid']//tr/"))

            for(int i=0;i<namesList.size();i++){
                System.out.println("NAmes: "+namesList.get(i).);

            }




        }








}



     */