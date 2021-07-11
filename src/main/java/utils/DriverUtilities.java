package utils;

import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtilities {
    WebDriverWait wait;


    public void navigateToUrl(String url){
        DriverFactory.driver.navigate().to(url);
    }
    public void pageRefresh(){
        DriverFactory.driver.navigate().refresh();
    }
    public void pageForward(){
        DriverFactory.driver.navigate().forward();
    }
    public  void pageBack(){
        DriverFactory.driver.navigate().back();
    }
    public String getPageTitle(){
        return DriverFactory.driver.getTitle();

    }
    public void waitForBtn(String locater){
        wait= new WebDriverWait(DriverFactory.driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locater)));
    }


    }

