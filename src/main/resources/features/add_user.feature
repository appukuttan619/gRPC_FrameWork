Feature: Adding a new user with hobbies

  Scenario Outline: Adding a new user with hobby and name
    When user sets body name as "<name>" and hobby as "<hobby>"
    And user calls addUser methode
    Then verify response has name "<name>" and hobby "<hobby>"
    Examples:
      | name   | hobby     |
      | arjun  | badminton |
      | shijas | football  |
      | anakha | Reed      |
      | bagyan | study     |
      | test   | test      |
   	  | uday   |footbll    |
   