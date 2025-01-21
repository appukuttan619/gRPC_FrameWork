Feature: get user by id

  @Smoke @Regression
  Scenario: Adding a new user with hobby and name and getting the user wtih id
    When user sets body name as "shamil" and hobby as "swimming"
    And user calls addUser methode
    Then verify response has name "shamil" and hobby "swimming"
    When user stores the id
    And user sets the id as the body from add user
    And user calls getUserById methode
    Then verify the name of the user is "shamsdil"