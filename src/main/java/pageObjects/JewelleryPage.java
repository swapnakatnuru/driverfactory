package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JewelleryPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(xpath = "//*[@id='products-orderby']")
    public WebElement sortByDropDown;
    @FindBy(xpath = "//*[@id='products-pagesize']")
    public WebElement diplayDropDown;
    @FindBy(linkText = "Elegant Gemstone Necklace (rental)")
    public WebElement elegantLink;
    @FindBy(xpath = "//a[text()='List']")
    public WebElement listGrid;
    @FindBy(xpath="//a[text()='Grid']")
    public WebElement  grid;
    @FindBy(xpath="//button[text()='Rent']")
    public WebElement rentButton;
    @FindBy(linkText = "Flower Girl Bracelet")
    public WebElement flowerGirlBracelet;


    public JewelleryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectSortByProducts() {
        Select s1 = new Select(sortByDropDown);
        System.out.println("Default Slection is : "+s1.getFirstSelectedOption().getText());
        s1.selectByValue("0");
        System.out.println("select the option by value 5");
        s1.selectByValue("5");
        System.out.println("select value is :" + s1.getFirstSelectedOption().getText());
        System.out.println("select the option  by value 6 ");
        s1.selectByValue("6");
        System.out.println("select value is :" + s1.getFirstSelectedOption().getText());
        System.out.println("select the option by value 10");
        s1.selectByValue("10");
        System.out.println("select value is :" + s1.getFirstSelectedOption().getText());
        System.out.println("select the option  by value 11");
        s1.selectByValue("11");
        System.out.println("select value is :" + s1.getFirstSelectedOption().getText());
        System.out.println("select the option  by value 15");
        s1.selectByValue("15");
        System.out.println("select value is :" + s1.getFirstSelectedOption().getText());
    }
    public void selectDisplayDropDown() {

        Select s2 = new Select(diplayDropDown);
        System.out.println("Default  selection is 3");
        s2.selectByValue("3");
        System.out.println("select value is :" + s2.getFirstSelectedOption().getText());
        System.out.println("select the option by value 6");
        s2.selectByValue("6");
        System.out.println("select value is :" + s2.getFirstSelectedOption().getText());
        System.out.println("select the option by value 9");
        s2.selectByValue("9");
    }
    public void clickListGrid(){
         listGrid.click();
        wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(listGrid));
    }
    public  void  clickGrid(){
        grid.click();
    }

    public void clickElegantNecklaceLink() {
        elegantLink.click();
    }
    public void clickFlowerGirlBracelet(){
        flowerGirlBracelet.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void waitForJewellerPge() {
        wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.elementToBeSelected(sortByDropDown));

    }
    public void waitForListGrid(){
        wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(listGrid));

    }
    public void waitForGrid(){
        wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(grid));
    }
    public void clickRentButton(){
        rentButton.click();
    }


    public void pageRefresh() {
        driver.navigate().refresh();
    }

    public String getPageTitle1() {
        return driver.getTitle();

    }
}




