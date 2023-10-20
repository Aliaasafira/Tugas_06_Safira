Feature: Cart

  Background: User login with valid credentials
    When user open link 'https://www.saucedemo.com/'
    And user input valid username 'standard_user'
    And user input valid password 'secret_sauce'
    Then user click login button


  Scenario: User want to buy product with selected item
    Given user click add to cart button
    Then user click cart icon
    Then user click checkout button

  Scenario: User want to buy product without selected item
    Then user click cart icon
    Then user click checkout button