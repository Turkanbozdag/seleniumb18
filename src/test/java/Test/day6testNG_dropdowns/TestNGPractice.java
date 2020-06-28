package Test.day6testNG_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {
    //public static void main(String[] args) {
    //test1();

    //}


    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method is running...");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running...");
    }



    @Test
    public void test1(){
        System.out.println("test1 running");

        String actualTitle="homepage";//driver.getTitle();
        String expectedTitle="Homepage";
        //if (actualTitle.equals(expectedTitle)){
          //  System.out.println("Title verification passed!");
       // }else{
        //    System.out.println("Title verification failed!");
       // }
    }

    @Test
    public void test2(){
        System.out.println("test2 is running...");
        Assert.assertEquals("String1","String2","String verification on test2 failed");
    }
    @Test
    public void test3(){
        System.out.println("test3 is runing...");
        String actualTitle="Amazon prime";
        String expectedInTitle="prime";
        String testString="jdksmfhdk";

        Assert.assertTrue(false);
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
       // Assert.assertFalse(actualTitle.contains(testString));
    }






}
