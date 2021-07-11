package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
     WebDriver driver;
     WebDriverWait wait;
     String homePageExpectedTitle;


     @FindBy(linkText ="Register")
     public WebElement registerLink;

     @FindBy(linkText = "Log in")
     public WebElement loginLink;

     @FindBy(className = "ico-wishlist")
     public WebElement wishListLink;

     @FindBy(className = "ico-cart")
     public WebElement shoppingCartLink;

     @FindBy(linkText = "Computers")
     public WebElement computersLink;
     @FindBy(linkText ="Desktops")
     public WebElement desktopsLink;
     @FindBy(linkText = "Jewelry")
     public WebElement jewelleryLink;
     @FindBy(id = "small-searchterms")
     public WebElement searchTextBox;

     @FindBy(css = "button.search-box-button")
     public WebElement searchButton;

     @FindBy(linkText = "Log out")
      public WebElement logoutLink;


     public HomePage(WebDriver driver) {
          this.driver=driver;
          PageFactory.initElements(driver,this);
     }
     public void clickRegisterLink(){

          registerLink.click();
     }
     public void clickcomputerLink(){
          Actions a1= new Actions(driver);
          WebElement e1=computersLink;
          a1.moveToElement(e1).perform();
     }
     public void clickDeskTopLink(){
      desktopsLink.click();
     }
     public void clickLoginLink(){
         loginLink.click();
     }
     public void clickWishListLink(){
         wishListLink.click();
     }
     public void clickShoppingCartLink(){
         shoppingCartLink.click();
     }
     public void clickjewelleryLink(){
          jewelleryLink.click();
     }
     public void enterSeaechTextBox(String searchText){

          searchTextBox.sendKeys(searchText);
     }
     public void clickSearchButton(){
          searchButton.click();
     }
     public void pageRefresh()
     {
          driver.navigate().refresh();
     }

     public void clickLogoutLink()
     {
          logoutLink.click();
     }

     public void waitForLoginClickable()
     {
          wait = new WebDriverWait(driver,30);
          wait.until(ExpectedConditions.elementToBeClickable(loginLink));
     }


     public void waitForLogoutClickable()
    {
          wait = new WebDriverWait(driver,30);
          wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
     }
     public void waitForDesktopClickable(){
          wait = new WebDriverWait(driver,20);
          wait.until(ExpectedConditions.elementToBeClickable(desktopsLink));
     }
     public void navigateToUrl(String url){
          driver.navigate().to(url);
     }
}





