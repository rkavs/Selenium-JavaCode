package main.java.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static main.webdriver.TestSample.driver;


/**
 * Created by neeraj.bhatnagar on 1/4/2017.
 */
public class SoftAssertion_Example {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void softAssert(){

        driver.get("http://automationpractice.com/index.php");
        SoftAssert assertion = new SoftAssert();
        try {
            String elementText1 = driver.findElement(By.xpath(".//*[@id='contact-link']/a")).getText();
            //String elementText4 = driver.findElement(By.xpath(".//*[@id='contact-link']/a")).clickAt;
            System.out.println("First String is " + ""+ elementText1);
            assertion.assertEquals(elementText1,"Contact us1", "String does not match");
        }catch(Exception e){
            e.getMessage();
        }
        String elementText2 = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).getText();
        System.out.println("Second String is " + ""+ elementText2);
        assertion.assertEquals(elementText2, "Sign in", "Text does not match");
        assertion.assertAll();
    }

}
