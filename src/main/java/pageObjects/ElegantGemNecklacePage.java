package pageObjects;

import base.BasePage;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElegantGemNecklacePage {
    WebDriver driver;
    WebDriverWait wait;


    public ElegantGemNecklacePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='rental_start_date_40']")
    public WebElement startDate;
    @FindBy(xpath = "//*[@id='rental_end_date_40']")
    public WebElement endDate;
    @FindBy(xpath = "//*[@id='product_enteredQuantity_40']")
    public WebElement quantityTextBox;
    @FindBy(xpath = "//*[@id='add-to-cart-button-40']")
    public WebElement rentButton;
    @FindBy(xpath = "//*[@id='topcartlink']")
    public WebElement shoppingCart;
    @FindBy(xpath = "//*[@id='bar-notification']")
    public WebElement confirmMessage;
    @FindBy(linkText = "Please select the address you want to ship to")
    public WebElement addressPopUp;
    @FindBy(xpath = "//*[@id='CountryId']")
    public WebElement countryDropDown;
    @FindBy(name = "ZipPostalCode")
    public WebElement zipPostalCode;
    @FindBy(xpath = "//*[@id='estimate-shipping-popup-40']")
    public WebElement groundRadiobtn;
    @FindBy(xpath="//*[@id='estimate-shipping-popup-40']")
    public WebElement nextDayAir;
    @FindBy(xpath = "//*[@id='estimate-shipping-popup-40']")
    public WebElement secondDayAir;
    @FindBy(xpath = "//button[@class='button-2 apply-shipping-button']")
    public WebElement applyBtn;
    @FindBy(xpath = "//*[@id='estimate-shipping-popup-40'][1]")
     public WebElement countryErrorMsg;
    @FindBy(xpath = "//a[text()='Be the first to review this product']")
    public WebElement reviewLink;
    @FindBy(id="add-to-wishlist-button-40")
    public WebElement wishlistBtn;
    @FindBy(css = "p.content")
    public WebElement productAddedWishlictMsg;
    @FindBy(linkText = "Wishlist")
    public WebElement wishListLink;
    @FindBy(xpath = "//div[text()='Zip / postal code is required']")
    public WebElement postalCodeError;

    public void pageRefresh() {
        driver.navigate().refresh();
    }

    public void enterStartDate(String sd) {
        startDate.sendKeys(sd);
    }

    public void enterEndDate(String ed) {
        endDate.sendKeys(ed);
    }

    public void enterQuantity(String qty) {
        WebElement w1 = quantityTextBox;
        w1.clear();
        w1.sendKeys(qty);
    }
    public void clickRentButton() {
        rentButton.click();
    }

    public void clickShoppingCartLink() {
        shoppingCart.click();
    }

    public String itemAddedMessage() {

        return confirmMessage.getText();
       // System.out.println("Confirmation of Suceesfully item added in the cart:  " );
    }

    public void clickAddressPopUp() {
        addressPopUp.click();
    }

    public void selectCountry() {
        Select s1 = new Select(countryDropDown);
        System.out.println("Default Selection is : " + s1.getFirstSelectedOption().getText());
        s1.selectByValue("233");
    }
    public void enterPostalCode(String pc){
        zipPostalCode.sendKeys(pc);

    }
    public void clickGroundRadio() {
        System.out.println("Ground radio button is selected");
         boolean b1 = groundRadiobtn.isSelected();
        Assertions.assertFalse(b1,"button selected");
             }
    public  void clickNextDayAir(){
        nextDayAir.click();
        boolean b2 = nextDayAir.isSelected();
        Assertions.assertFalse(b2,"button not selected");
    }
    public void clickSecondDayAir(){
        secondDayAir.click();
        boolean b3=secondDayAir.isSelected();
        Assertions.assertFalse(b3,"button selected");
    }
    public void clickApplyButton(){
        applyBtn.click();

    }
    public void grabCountryErrorMsg(){
        WebElement cm=countryErrorMsg;
        String txt=cm.getText();
       System.out.println("Error message:"+txt);

    }
    public void grabPostalErrorMsg(){
        WebElement pc=postalCodeError;
        String txt1=pc.getText();
        System.out.println("Error messages : "+txt1);
    }

    public void waitforMessage(){
        wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("css = 'p.content'")));
    }
    public  void clickreviewLink(){
        reviewLink.click();
    }
    public void waitForReviewLink(){
        wait=new WebDriverWait(driver,5);
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add your review']")));
    }
    public void clickWishlistBtn(){
        wishlistBtn.click();

    }
    public void waitforRentBtn(){
        wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='add-to-cart-button-40']")));
    }
    public  String grabProdcutAddedWishlistMessage(String msg){
        return msg= productAddedWishlictMsg.getText();


         }
    public void clickWishListLink(){
        wishListLink.click();
    }
      public void waitForButton(){
        wait=new WebDriverWait(driver,70);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='estimate-shipping-popup-40']/div[5]/button")));
    }

    public  void waitForElegantCountry(){
        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeSelected(countryErrorMsg));
    }

}
