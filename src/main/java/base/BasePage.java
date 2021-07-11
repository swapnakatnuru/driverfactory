package base;

import pageObjects.*;
import utils.DriverFactory;
import utils.DriverUtilities;

public class BasePage {
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static JewelleryPage jewelleryPage;
    public static RegisterPage registerPage;
    public static DriverUtilities driverUtilities;
    public static ElegantGemNecklacePage elegantGemNecklacePage;
    public static ProductReviewPage productReviewPage;
    public static WishListPage wishListPage;
    public static FlowerGirlBraceletPage flowerGirlBraceletPage;

    public static void initPages() {
        homePage = new HomePage(DriverFactory.driver);
        loginPage = new LoginPage(DriverFactory.driver);
        registerPage = new RegisterPage(DriverFactory.driver);
        jewelleryPage = new JewelleryPage(DriverFactory.driver);
        driverUtilities = new DriverUtilities();
        elegantGemNecklacePage = new ElegantGemNecklacePage(DriverFactory.driver);
        productReviewPage = new ProductReviewPage(DriverFactory.driver);
        wishListPage = new WishListPage(DriverFactory.driver);
        flowerGirlBraceletPage=new FlowerGirlBraceletPage(DriverFactory.driver);

    }
}