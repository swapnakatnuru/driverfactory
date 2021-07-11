package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlowerGirlBraceletPage {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(xpath = "//form[@id='product-details-form']/div[2]/div/div[2]/div[8]/div/button")
    public WebElement flowerAddToCartBtn;
    @FindBy(xpath = "//*[@id='product_enteredQuantity_41']")
    public WebElement flowerQtyTextBox;

    public FlowerGirlBraceletPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
            }
      public void enterFlowerQty(String qt) throws InterruptedException {
          flowerQtyTextBox.clear();
         flowerQtyTextBox.sendKeys(qt);
         //Thread.sleep(1000);
    }
     public void clickFlowerToCart()  {

        flowerAddToCartBtn.click();
        // WebElement w1=flowerAddToCartBtn;
       //  JavascriptExecutor js = (JavascriptExecutor) driver;
        //  boolean btn=flowerQtyTextBox.isEnabled();
        // Assertions.assertTrue(btn,"add to  cart  button");
//
     }
     public  void waitForFlowerBtn(){
        wait=new WebDriverWait(driver,5) ;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='button-1 add-to-cart-button']")));
     }
    public  void waitForFlowerQty(){
        wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='product_enteredQuantity_41']")));
    }
}
