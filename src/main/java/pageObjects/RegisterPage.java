package pageObjects;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "gender-male")
    public WebElement maleRadioBtn;
    @FindBy(id = "gender-female")
    public WebElement femaleRadioBtn;
    @FindBy(id = "FirstName")
    public WebElement fnTextBox;
    @FindBy(id = "LastName")
    public WebElement lnTextBox;
    @FindBy(name ="DateOfBirthDay")
    public WebElement dateOfBirthDropDown;
    @FindBy(name ="DateOfBirthMonth")
    public WebElement dateOfMonthDropDown;
    @FindBy(name="DateOfBirthYear")
    public WebElement dateOfYearDropDown;
    @FindBy(id = "Email")
    public WebElement emailTextBox;
    @FindBy(id = "Company")
    public WebElement companyTextBox;
    @FindBy(id = "Password")
    public WebElement passwordTextBox;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPwdTextBox;
    @FindBy(id = "register-button")
    public WebElement registerButton;
    @FindBy(css = "div.result")
    public WebElement confText;
    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueBtn;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void maleRadioButton() {
        maleRadioBtn.click();
    }

    public void femaleRadioButton() {
        femaleRadioBtn.click();
    }

    public void firstName(String fn) {
        fnTextBox.sendKeys(fn);
    }

    public void lastName(String ln) {
        lnTextBox.sendKeys(ln);
    }

    public void selectDate(String date) {
        Select s1 = new Select(dateOfBirthDropDown);
        s1.selectByVisibleText(date);
    }

    public void selectMonth(String Month) {
        Select s2 = new Select(dateOfMonthDropDown);
        s2.selectByVisibleText(Month);
    }

    public void selectYear(String year) {
     Select s3 = new Select(dateOfYearDropDown);
       s3.selectByValue(year);

    }

    public void enterEmail(String em) {
        emailTextBox.sendKeys(em);

    }

    public void enterCompanyDetails(String cd) {
        companyTextBox.sendKeys(cd);

    }

    public void enterPassword(String pw) {
        passwordTextBox.sendKeys(pw);
    }

    public void enterConfirmPwd(String cpw) {
        confirmPwdTextBox.sendKeys(cpw);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
    public String verifyConfMessage()
    {
        return confText.getText();
    }

    public String getPageTitle()
    {
       return driver.getTitle();
    }
    public void clickContinueBtn(){
        continueBtn.click();
    }
    public void waitForWebElementToBeClickable(){
        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
    }

}


