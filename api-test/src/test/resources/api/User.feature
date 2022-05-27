Feature: User
  As an admin
  I want to see list user
  So that i can create new user

  Scenario: GET - As admin I have be able to get detail user
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user


  Scenario: POST - As Admin I have be able to create new user
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user


  Scenario: PUT - As admin I have be able to update existing user
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for updated user