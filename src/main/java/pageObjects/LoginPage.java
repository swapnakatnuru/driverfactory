package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    WebDriver driver;

   @FindBy(id="Email")
   public WebElement enterEmailTextBox;
    @FindBy(id="Password")
    public WebElement enterPasswordTextBox;
    @FindBy(xpath="//button[text()='Log in']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void  logintoNop(String em,String pw){
        enterEmailTextBox.sendKeys(em);
        enterPasswordTextBox.sendKeys(pw);
        loginButton.click();
    }
    public void enterEmail(String em){
        enterEmailTextBox.sendKeys(em);
    }
    public void enterPassword(String pw) {
        enterEmailTextBox.sendKeys(pw);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

}