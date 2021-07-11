Feature: Verfying the AddtoCart feature for the jewellery products
 Background: Navigating to url and homepage
   Given I navigate to url "https://demo.nopcommerce.com"
   Then  I should be navigated to home page
   When  I click on jewelry link
   Then  I should navigate to  jewelry page
 @ui
Scenario:Verify the sortby feature and display feature dropdown to check the defalut paramter is displayed
  When I select Sort by drop Down products-orderby as "value"
  And   I select Display Dropdown products-pagesize as "value"
   @ui
Scenario: Verify the list grid and grid Gui fumctionality is displaying the products accordingly
     When  I click the lidt Grid
     Then  I should see the products be displayed in a list pattern
     When  I click the grid
     Then  I should see the products  dispalyed in grid pattern

Scenario: Verify Rent functionality for ElegantGemStone Necklace product
  When  I click on Rent button
  Then  i should be able navigate to ElegantGemStone Necklace page
  When  I enter start date as "05/28/2021"
  And   I enter end date as "05/30/2021"
  And   I enter the product quantity as "2"
  And   I should click on Rent button
  Then  I should see item sucessfully added message
  Then  I should be able to add Item  to Shopping cart
Scenario: Verify the address to ship fuctionality in Elegant gem necklace page
When     I click on address to ship link on elegantgemnecklacepage
Then     I navigate to address to ship popup
When     I select Select country
And      I select Zip/postalcode as "ox118fr"
And      I select appropriate  Shipping method
And      I click on Apply button
Then      I should be able to add item with shipping charges in shopping cart
Scenario:Verify Negative scenario for address to ship functionality on ElegantGemNecklacePage
When     I click on address to ship link on elegantgemnecklacepage
Then     I navigate to address to ship popup
When      I select Select country
When      I click on apply button on elegantgemstone necklace page without entering mandatory fields
Then      I should get error messages dispalyed for zip/postalcode
Scenario:  Verify review functionality of the Product
When      I click link on review the product in ElegantGemNecklcePage
Then      I should see a review form in products review page
When      I enter addproduct review title
And       I enter addproduct review text
And       I select the rating of the product
And       I click on submit review button
Scenario: Verify Wishlist from elegantgem necklace Page
When      I click on elegantgem necklace link on jewelery page
Then      I should be navigated to elegantgem necklace page
When      I enter start date as "05/29/2021"
And       I enter end date as "05/30/2021"
And       I enter the product quantity as "2"
And       I should click on wishlist button to add item to the wishlist cart
Then      I should see a message as "The product has been added to your wishlist"
When      I should click the Wishlist link
Then      I should navigate to wishlist page
When      I select addtocart chechbox
And       I click on AddtoCart button
Then      I should see product added to ShoppingCart
Scenario: Verify update button to add updated products to shopping cart
  When      I click on elegantgem necklace link on jewelery page
  Then      I should be navigated to elegantgem necklace page
  When      I enter start date as "05/29/2021"
  And       I enter end date as "05/30/2021"
  And       I enter the product quantity as "2"
  And       I should click on wishlist button to add item to the wishlist cart
  Then      I should see a message as "The product has been added to your wishlist"
  When      I should click the Wishlist link
  Then      I should navigate to wishlist page
  When      I select addtocart chechbox
  And       I enter new quantity in qty
  And       I click on UpdateWishlist button
  Then      I should see wishlint should get updated with new quantity
Scenario:   verify email a friend button
  When      I click on elegantgem necklace link on jewelery page
  Then      I should be navigated to elegantgem necklace page
  When      I enter start date as "05/29/2021"
  And       I enter end date as "05/30/2021"
  And       I enter the product quantity as "2"
  And       I should click on wishlist button to add item to the wishlist cart
  Then      I should see a message as "The product has been added to your wishlist"
  When      I should click the Wishlist link
  Then      I should navigate to wishlist page
  When      I click on email a friend button
  Then      I navigate to nopCommerce demo store. Email wishlist to a friend page
  When      I enter friends email as "kushal@gamil.com"
  And       I enter your email address as "swapna@gmail.com"
  And       I enter personal message
  And       I click on sendemail button
Scenario:   Verify Negative functionality for email a friend
When           I click on elegantgem necklace link on jewelery page
Then           I should be navigated to elegantgem necklace page
When           I click on email a friend button
Then           I should be navigated to email a friend page
When           I click on sendemail button without entering mandatory fields
Then           I should be able to see error messages
Scenario:   Verify flower girl bracelet product link
When        I click on jewelry link on home page
And         I click on flower girl bracelet link
Then        I should be able to navigate to flower girl bacelet page
When       I enter the quantity as "3"
And        I click on AddtoCart button on flowergirlbraceletPage
Then       I should be able to add the product in shopping cart
Scenario: Verify vintage style engagement product link
When      I click on jewelry link on home page
And       I click on vintage style engagement link
Then      I should be navigated to vintage style engagement page
When      I enter the product quantity
And       I click on AddtoCart button
Then      I should be able to add the product in shopping cart