@Feature1

Feature: Log into the SwagLabs account
  Me as a SwagLabs user
  I want to be able to log into my swag labs account


  @Case1
  Scenario Outline: The user successfully logs into its SwagLabs account
    Given that the user is on the SwagLabs login screen
    When that the user authenticates with the username <username> and the password <password>
    Then the user should see it was redirected to the store page
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|

  @Case2
  Scenario: The user unsuccessfully logs into its SwagLabs account because the account was locked out
    Given that the user is on the SwagLabs login screen
    When that the user authenticates with the username locked_out_user and the password secret_sauce
    Then the user should see an error label on the login page stating that the account is locked
