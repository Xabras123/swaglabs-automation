@Feature1

Feature: Log into the SwagLabs account
  Me as a SwagLabs user
  I want to be able to log into my swag labs account

  //Background: Open the browser on the SwagLabs login page
    //Given that the user authenticates with the username standard_user and the password secret_sauce on the SwagLabs loggin page

  @CSuccessfullyLogIntoTheSwagLabsAccount
  Scenario Outline: The user successfully logs into its SwagLabs account
    Given that the user is on the SwagLabs login screen
    When that the user authenticates with the username <username> and the password <password>
    Then the user should see it was redirected to the store page
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user|secret_sauce|