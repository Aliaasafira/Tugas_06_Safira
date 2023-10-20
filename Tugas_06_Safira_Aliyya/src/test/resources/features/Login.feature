Feature: Login
  Description : Login with valid credentials and Login with invalid credentials

Scenario: Login with valid credentials
  When user open link 'https://www.saucedemo.com/'
  And user input valid username 'standard_user'
  And user input valid password 'secret_sauce'
  Then user click login button

Scenario: Login with invalid credentials (invalid password)
  When user open link 'https://www.saucedemo.com/'
  And user input invalid username 'standard_user'
  And user input invalid password 'invalid'
  Then user click login button