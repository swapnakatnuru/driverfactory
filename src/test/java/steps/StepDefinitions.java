package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StepDefinitions {
    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url) {
        BasePage.homePage.navigateToUrl(url);
    }

    @Then("I should be navigated to home page")
    public void i_should_be_navigated_to_home_page() {
        String homePageExpectedTitle = "nopCommerce demo store";
        String homePageActualTitle = BasePage.registerPage.getPageTitle();
        System.out.println(homePageActualTitle);
        Assertions.assertEquals(homePageExpectedTitle, homePageActualTitle);
    }

    @When("I click on login link from the navbar")
    public void i_click_on_login_link_from_the_navbar() {
        BasePage.homePage.clickLoginLink();

    }

    @Then("T should be navigated to login page")
    public void t_should_be_navigated_to_login_page() {
        BasePage.homePage.pageRefresh();
        String loginPageTile = BasePage.registerPage.getPageTitle();
        System.out.println(loginPageTile);

    }

    @When("I enter email as {string}")
    public void i_enter_email_as(String em) {
        BasePage.loginPage.enterEmail(em);

    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String pw) {
        BasePage.loginPage.enterPassword(pw);

    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        BasePage.loginPage.clickLoginButton();

    }

    @Then("I should be logged in sucessfully")
    public void i_should_be_logged_in_sucessfully() {
        String loginPageTitle = BasePage.registerPage.getPageTitle();
        System.out.println(loginPageTitle);

    }
       @When("I click on jewelry link")
    public void i_click_on_jewelry_link() {
        BasePage.homePage.jewelleryLink.click();
    }
    @Then("I should navigate to  jewelry page")
    public void i_should_navigate_to_jewelry_page() {
        BasePage.jewelleryPage.pageRefresh();
        String jeweleryPageTitle=BasePage.jewelleryPage.getPageTitle1();

    }
    @When("I select Sort by drop Down products-orderby as {string}")
    public void i_select_sort_by_drop_down_products_orderby_as(String value)
    {

        BasePage.jewelleryPage.selectSortByProducts();
       }
    @When("I select Display Dropdown products-pagesize as {string}")
    public void i_select_display_dropdown_products_pagesize_as(String value) {
       BasePage.jewelleryPage.selectDisplayDropDown();
         }
    @When("I click the lidt Grid")
    public void i_click_the_lidt_grid() {
       // BasePage.jewelleryPage.pageRefresh();
        BasePage.jewelleryPage.clickListGrid();
      //  BasePage.jewelleryPage.waitForListGrid();

    }
    @Then("I should see the products be displayed in a list pattern")
    public void i_should_see_the_products_be_displayed_in_a_list_pattern() {
       String pageTitle1=  BasePage.driverUtilities.getPageTitle();
        System.out.println("PageTitle is : "+pageTitle1);
        System.out.println("products displayed in List pattern");
        BasePage.jewelleryPage.waitForListGrid();

    }
    @When("I click the grid")
    public void i_click_the_grid() {
        BasePage.jewelleryPage.clickGrid();
    }
    @Then("I should see the products  dispalyed in grid pattern")
    public void i_should_see_the_products_dispalyed_in_grid_pattern() {
       BasePage.jewelleryPage.waitForGrid();
       String pageTitle2= BasePage.driverUtilities.getPageTitle();
        System.out.println("PageTitle is : "+pageTitle2);
        System.out.println("products displayed in Grid pattern");
    }
    @When("I click on Rent button")
    public void i_click_on_rent_button() {
        BasePage.jewelleryPage.clickRentButton();

    }
    @Then("i should be able navigate to ElegantGemStone Necklace page")
    public void i_should_be_able_navigate_to_elegant_gem_stone_necklace_page() {
        BasePage.jewelleryPage.pageRefresh();
        String pageTitle3= BasePage.driverUtilities.getPageTitle();
        System.out.println("PageTitle is : "+pageTitle3);

    }
    @When("I enter start date as {string}")
    public void i_enter_start_date_as(String sd) {
        BasePage.elegantGemNecklacePage.enterStartDate(sd);


    }
    @When("I enter end date as {string}")
    public void i_enter_end_date_as(String ed) {
        BasePage.elegantGemNecklacePage.enterEndDate(ed);

    }
    @When("I enter the product quantity as {string}")
    public void i_enter_the_product_quantity_as(String qty) {
        BasePage.elegantGemNecklacePage.enterQuantity(qty);

    }
    @When("I should click on Rent button")
    public void i_should_click_on_rent_button() {
        BasePage.elegantGemNecklacePage.waitforRentBtn();
        BasePage.elegantGemNecklacePage.clickRentButton();


    }
    @Then("I should see item sucessfully added message")
    public void i_should_see_item_sucessfully_added_message() {
       BasePage.elegantGemNecklacePage.itemAddedMessage();
         }

    @Then("I should be able to add Item  to Shopping cart")
    public void i_should_be_able_to_add_item_to_shopping_cart() {
        BasePage.elegantGemNecklacePage.pageRefresh();
        BasePage.elegantGemNecklacePage.clickShoppingCartLink();
    }
    @When("I click on address to ship link on elegantgemnecklacepage")
    public void i_click_on_address_to_ship_link_on_elegantgemnecklacepage() {
        BasePage.jewelleryPage.clickElegantNecklaceLink();
        BasePage.driverUtilities.pageRefresh();
        BasePage.elegantGemNecklacePage.clickAddressPopUp();
    }


    @Then("I navigate to address to ship popup")
    public void i_navigate_to_address_to_ship_popup() {
       BasePage.driverUtilities.getPageTitle();
    }

    @When("I select Select country")
    public void i_select_select_country() {
        BasePage.elegantGemNecklacePage.selectCountry();


    }
    @And("I select Zip\\/postalcode as {string}")
    public void iSelectZipPostalcodeAs(String pc) {

        BasePage.elegantGemNecklacePage.enterPostalCode("ox118fr");

    }
    @And("I select appropriate  Shipping method")
    public void i_select_appropriate_shipping_method() {

        BasePage.elegantGemNecklacePage.clickGroundRadio();

    }
    @And("I click on Apply button")
    public void i_click_on_apply_button() {
        BasePage.elegantGemNecklacePage.waitForButton();
        BasePage.elegantGemNecklacePage.clickApplyButton();
    }
    @Then("I should be able to add item with shipping charges in shopping cart")
    public void i_should_be_able_to_add_item_with_shipping_charges_in_shopping_cart() {
        BasePage.driverUtilities.pageRefresh();
        BasePage.elegantGemNecklacePage.clickShoppingCartLink();

    }@When("I click on apply button on elegantgemstone necklace page without entering mandatory fields")
    public void i_click_on_apply_button_on_elegantgemstone_necklace_page_without_entering_mandatory_fields() {


        BasePage.jewelleryPage.clickElegantNecklaceLink();
        BasePage.elegantGemNecklacePage.clickAddressPopUp();
        BasePage.driverUtilities.getPageTitle();

         BasePage.elegantGemNecklacePage.selectCountry();
         //BasePage.elegantGemNecklacePage.waitForButton();
         BasePage.elegantGemNecklacePage.clickApplyButton();
      //  BasePage.elegantGemNecklacePage.waitForButton();
    }
    @Then("I should get error messages dispalyed for zip\\/postalcode")
    public void i_should_get_error_messages_dispalyed_for_zip_postalcode() {
        BasePage.elegantGemNecklacePage.grabPostalErrorMsg();
        // BasePage.elegantGemNecklacePage.waitForElegantCountry();
        //BasePage.elegantGemNecklacePage.grabCountryErrorMsg();
    }

    @When("I click link on review the product in ElegantGemNecklcePage")
    public void i_click_link_on_review_the_product_in_elegant_gem_necklce_page() {

        BasePage.homePage.clickjewelleryLink();
        BasePage.jewelleryPage.clickElegantNecklaceLink();
        BasePage.driverUtilities.pageRefresh();
       //BasePage.elegantGemNecklacePage.waitForReviewLink();
        BasePage.elegantGemNecklacePage.clickreviewLink();
        BasePage.homePage.clickRegisterLink();
        BasePage.registerPage.femaleRadioButton();
        BasePage.registerPage.firstName("swapna");
        BasePage.registerPage.lastName("rk");
        BasePage.registerPage.selectDate("11");
        BasePage.registerPage.selectMonth("August");
        BasePage.registerPage.selectYear("1990");
        BasePage.registerPage.enterEmail("swapna49@gmail.com");
        BasePage.registerPage.enterCompanyDetails("xyz");
        BasePage.registerPage.enterPassword("register");
        BasePage.registerPage.enterConfirmPwd("register");
        BasePage.registerPage.waitForWebElementToBeClickable();
        BasePage.registerPage.clickRegisterButton();
        BasePage.driverUtilities.pageRefresh();
        BasePage.registerPage.verifyConfMessage();
        BasePage.registerPage.clickContinueBtn();

               // BasePage.driverUtilities.pageRefresh();


    }
    @Then("I should see a review form in products review page")
    public void i_should_see_a_review_form_in_products_review_page() {

        //BasePage.driverUtilities.pageRefresh();
        BasePage.driverUtilities.getPageTitle();

    }
    @When("I enter addproduct review title")
    public void i_enter_addproduct_review_title() {
        BasePage.productReviewPage.enterReviewTitle("Elegant Review Title");
        //BasePage.productReviewPage.clicksubmitBtn();

    }
    @When("I enter addproduct review text")
    public void i_enter_addproduct_review_text() {
        BasePage.productReviewPage.enterReviewText("very satisfied with the product");

    }
    @When("I select the rating of the product")
    public void i_select_the_rating_of_the_product() {
        BasePage.productReviewPage.ratingRadioBtnOptions();

    }
    @When("I click on submit review button")
    public void i_click_on_submit_review_button() {

        BasePage.productReviewPage.clicksubmitBtn();
    }
    @When("I click on elegantgem necklace link on jewelery page")
    public void i_click_on_elegantgem_necklace_link_on_jewelery_page() {
        BasePage.jewelleryPage.clickElegantNecklaceLink();

    }
    @Then("I should be navigated to elegantgem necklace page")
    public void i_should_be_navigated_to_elegantgem_necklace_page() {
        BasePage.driverUtilities.getPageTitle();

    }
    @When("I should click on wishlist button to add item to the wishlist cart")
    public void i_should_click_on_wishlist_button_to_add_item_to_the_wishlist_cart() {
        BasePage.elegantGemNecklacePage.clickWishlistBtn();

    }@Then("I should see a message as {string}")
    public void i_should_see_a_message_as(String msg) {
        BasePage.driverUtilities.pageRefresh();
       // BasePage.elegantGemNecklacePage.grabProdcutAddedWishlistMessage(msg);
        System.out.println(msg);

    }

    @When("I should click the Wishlist link")
    public void i_should_click_the_wishlist_link() {
        BasePage.elegantGemNecklacePage.clickWishListLink();
    }
    @Then("I should navigate to wishlist page")
    public void i_should_navigate_to_wishlist_page() {
        BasePage.driverUtilities.getPageTitle();

    }
    @When("I select addtocart chechbox")
    public void i_select_addtocart_chechbox() {
        BasePage.wishListPage.clickAddToCartCheckBox();
    }
    @When("I click on AddtoCart button")
    public void i_click_on_addto_cart_button() {
        BasePage.wishListPage.clickAddToCartBtn();

    }
    @Then("I should see product added to ShoppingCart")
    public void i_should_see_product_added_to_shopping_cart() {
        BasePage.driverUtilities.getPageTitle();
        BasePage.wishListPage.waitForWishList();
        BasePage.wishListPage.clickShoppingCartLink();

    }
    @When("I enter new quantity in qty")
    public void i_enter_new_quantity_in_qty() {

        BasePage.wishListPage.enterqtyBox();


    }

    @When("I click on UpdateWishlist button")
    public void i_click_on_update_wishlist_button() {
        BasePage.wishListPage.waitForUpdateBtn();
        BasePage.wishListPage.clickUpdateCartBtn();

    }

    @Then("I should see wishlint should get updated with new quantity")
    public void i_should_see_wishlint_should_get_updated_with_new_quantity() {
       BasePage.elegantGemNecklacePage.clickWishListLink();

    }
    @When("I click on email a friend button")
    public void i_click_on_email_a_friend_button() {
        BasePage.wishListPage.waitForEmailaFriendBtn();
        BasePage.wishListPage.clickEmailAFriend();

    }
    @Then("I navigate to nopCommerce demo store. Email wishlist to a friend page")
    public void i_navigate_to_nop_commerce_demo_store_email_wishlist_to_a_friend_page() {
        BasePage.driverUtilities.getPageTitle();
        BasePage.driverUtilities.pageRefresh();

    }
    @When("I enter friends email as {string}")
    public void i_enter_friends_email_as(String fe) {
        BasePage.wishListPage.waitForFriendTxtBox();
        BasePage.wishListPage.enterFriendsEmailTxtBox(fe);

    }

    @When("I enter your email address as {string}")
    public void i_enter_your_email_address_as(String ym) {
        BasePage.wishListPage.enterYourEmailTxtBox(ym);

    }
    @When("I enter personal message")
    public void i_enter_personal_message() {
        BasePage.wishListPage.enterpersonalMessage();

    }
    @When("I click on sendemail button")
    public void i_click_on_sendemail_button() {
        BasePage.wishListPage.waitForSendEmailTxtBox();
        BasePage.wishListPage.clickSendEmailBtn();

    }
    @Then("I should be navigated to email a friend page")
    public void i_should_be_navigated_to_email_a_friend_page() {
        BasePage.driverUtilities.getPageTitle();
    }
    @When("I click on sendemail button without entering mandatory fields")
    public void i_click_on_sendemail_button_without_entering_mandatory_fields() {
        BasePage.wishListPage.clickSendEmailBtn();

    }
    @Then("I should be able to see error messages")
    public void i_should_be_able_to_see_error_messages() {
        BasePage.wishListPage.grabFriendEmailError();
        BasePage.wishListPage.grabYourFriendErrorMsg();


    }
    @When("I click on jewelry link on home page")
    public void i_click_on_jewelry_link_on_home_page() {
        BasePage.homePage.clickjewelleryLink();
    }
    @When("I click on flower girl bracelet link")
    public void i_click_on_flower_girl_bracelet_link() {
        BasePage.jewelleryPage.clickFlowerGirlBracelet();

    }
    @Then("I should be able to navigate to flower girl bacelet page")
    public void i_should_be_able_to_navigate_to_flower_girl_bacelet_page() {
        String jewellerypageExpectedTitle= "nopCommerce demo store. Flower Girl Bracelet";
        String  jewellerypageActualTitle=BasePage.jewelleryPage.getPageTitle1();
        Assertions.assertEquals(jewellerypageExpectedTitle,jewellerypageActualTitle);
        System.out.println(jewellerypageActualTitle);
       // BasePage.driverUtilities.getPageTitle();


    }@When("I enter the quantity as {string}")
    public void i_enter_the_quantity_as(String qt ) throws InterruptedException {
       // BasePage.flowerGirlBraceletPage.waitForFlowerQty();
        BasePage.flowerGirlBraceletPage.enterFlowerQty(qt);

    }@When("I click on AddtoCart button on flowergirlbraceletPage")
    public void i_click_on_addto_cart_button_on_flowergirlbracelet_page() {
        BasePage.flowerGirlBraceletPage.clickFlowerToCart();

    }    @Then("I should be able to add the product in shopping cart")
    public void i_should_be_able_to_add_the_product_in_shopping_cart()   {

       // BasePage.driverUtilities.waitForBtn("flowerAddToCartBtn");
       // BasePage.flowerGirlBraceletPage.waitForFlowerBtn();
        BasePage.flowerGirlBraceletPage.clickFlowerToCart();

    }


}





