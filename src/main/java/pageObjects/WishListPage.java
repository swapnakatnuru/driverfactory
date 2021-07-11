package pageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(name = "addtocart")
    public WebElement addtoCartCheckBox;
    @FindBy(name="addtocartbutton")
    public WebElement wishAddToCartButton;
    @FindBy(linkText = "Shopping cart")
    public WebElement  shoppingCartLink;
    @FindBy(css = "input.qty-input")
    public WebElement qtyTxtBox;
    @FindBy(name = "updatecart")
    public WebElement updateCartBtn;
    @FindBy(xpath = "//button[text()='Email a friend']")
    public WebElement emailAFriend;
    @FindBy(id="FriendEmail")
    public WebElement friendEmailTxtBox;
    @FindBy(id="YourEmailAddress")
    public WebElement yourEmail;
    @FindBy(id="PersonalMessage")
    public WebElement personalMsg;
    @FindBy(name = "send-email")
    public WebElement sendmailBtn;
    @FindBy(id="FriendEmail-error")
    public WebElement friendEmailError;
    @FindBy(id="YourEmailAddress-error")
    public WebElement yourEmailErrorMsg;



    public WishListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        public void clickAddToCartCheckBox(){
        addtoCartCheckBox.click();
        }
        public void clickAddToCartBtn(){
        wishAddToCartButton.click();
        }
        public  void clickShoppingCartLink(){
        shoppingCartLink.click();
        }
        public void waitForWishList(){
        wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shopping cart")));
        }
        public  void enterqtyBox(){
        WebElement qt=qtyTxtBox;
        qt.clear();
         qt.sendKeys("4");
        }
        public  void clickUpdateCartBtn(){
        updateCartBtn.click();
        }
        public void waitForQtyBox(){
        wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.qty-input")));
    }
    public void waitForUpdateBtn() {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("updatecart")));
    }
    public void clickEmailAFriend(){
        emailAFriend.click();
     //boolean b1= emailAFriend.isEnabled();
       // Assertions.assertTrue(b1,"email a friend");
    }
    public void enterFriendsEmailTxtBox(String fe){
        friendEmailTxtBox.sendKeys(fe);
        //boolean b2=friendEmailTxtBox.isSelected();
       // Assertions.assertTrue(b2,"textbox is selected");
    }
    public void enterYourEmailTxtBox(String ym){
        yourEmail.sendKeys(ym);
    }
    public void enterpersonalMessage(){
        personalMsg.sendKeys("this is awesome Product worth to buy");
    }
    public void clickSendEmailBtn(){
        sendmailBtn.click();
    }
    public void waitForEmailaFriendBtn() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Email a friend']")));
    }
    public void waitForFriendTxtBox() {
        wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("FriendEmail")));
    }
    public void waitForSendEmailTxtBox() {
        wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("send-email")));
    }
    public void grabFriendEmailError(){
        WebElement w1=friendEmailError;
        String msg=w1.getText();
        System.out.println("Error Message for friend email: "+msg);
    }
    public void grabYourFriendErrorMsg(){
        WebElement w2=yourEmailErrorMsg;
        String msg1=w2.getText();
        System.out.println("Your email error message:"+msg1);
    }
    }

