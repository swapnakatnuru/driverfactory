Feature:Login to nop commerce application
@regression
  Scenario: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigated to home page
    When   I click on login link from the navbar
    Then   T should be navigated to login page
    When   I enter email as "qa1@nop.com"
    And    I enter password as "swapna"
    And    I click on login button
    Then   I should be logged in sucessfully




