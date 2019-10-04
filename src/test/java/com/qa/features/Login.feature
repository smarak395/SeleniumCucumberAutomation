Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario Outline: : Automation Practice Login Test Scenario

    Given user is already on Login Page
    When title of login page is My Store
    Then user clicks on the header signIn link
    Then user enters "<username>" and "<password>"
    Then user clicks on signIn button
    Then user is on My Account page
    When user clicks on signOut button
    Then user should be signedOut from the application


    Examples:
      | username                   | password |
      | smarakuniversum@gmail.com  | hello |
