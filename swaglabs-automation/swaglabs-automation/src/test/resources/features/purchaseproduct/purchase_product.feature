@Feature1

Feature: Purchase SwagLabs item
  Me as a SwagLabs user
  I want to be able to purchase products from the store


  @Case1
  Scenario: The user successfully purchases items from the SwagLabs store
    Given that the user logs into the SwagLabs with the username standard_user and the password secret_sauce
    When the user successfully purchases items from the store
    Then the user should be redirected a successful payment screen
    And the user should be redirected to the home screen when tapping the go back home button


  @Case2
  Scenario: The user unsuccessfully purchases items from the SwagLabs store because a checkout information error
    Given that the user logs into the SwagLabs with the username problem_user and the password secret_sauce
    When the user fails during a purchase because an checkout information error
    Then the user should see an error label on the checkout information screen stating that a problem occurred