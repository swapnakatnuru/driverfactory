package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductReviewPage {
    WebDriver driver;

    WebElement w;
    @FindBy(id="AddProductReview_Title")
    public WebElement reviewTitle;
    @FindBy(id="AddProductReview_ReviewText")
    public WebElement reviewText;
    @FindBy(id ="addproductrating_1")
    public  WebElement radioBtn1;
    @FindBy(id="addproductrating_2")
    public WebElement radioBtn2;
    @FindBy(id="addproductrating_3")
    public WebElement radioBtn3;
    @FindBy(id="addproductrating_4")
    public WebElement radioBtn4;
    @FindBy(id="addproductrating_5")
    public WebElement radioBtn5;
    @FindBy(xpath = "//button[text()='Submit review']")
    public WebElement submitBtn;
    @FindBy(css="div.rating-options")
    public WebElement ratingOptions;
    public ProductReviewPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterReviewTitle(String rt){
        reviewTitle.sendKeys(rt);

    }
    public  void enterReviewText(String rtxt){
        reviewText.sendKeys(rtxt);
        }
        public void ratingRadioBtnOptions() {
            radioBtn1.click();
            radioBtn2.click();
            radioBtn3.click();
            radioBtn4.click();
            radioBtn5.click();
            ratingOptions.getSize();
          String bt=  radioBtn5.getAttribute("value");
            System.out.println("review selected is:"+bt);

        }
        public void clicksubmitBtn(){
        submitBtn.click();
        }



}
