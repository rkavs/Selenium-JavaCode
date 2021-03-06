package main.webdriver.Dropdowns;

import org.apache.xpath.SourceTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by neeraj.bhatnagar on 1/2/2017.
 */
public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.wikipedia.org");
        // Enter value in text box
        //driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("Dansk");

        Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
        //select.selectByVisibleText("Dansk");
        //select.selectByValue("hi");

        List<WebElement> options =  select.getOptions();
        System.out.println(options.size());
        //System.out.println(options.);
        // int i;
        for(int i = 0; i<=options.size(); i++){
            System.out.println(options.get(i).getText());
            System.out.println();

            driver.close();
        }
    } }
