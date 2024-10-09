Feature: test feature

  Scenario Outline: To validate invaild and valid login
    Given user is navigated to the url
    When enters the <username> and <password>
    And Hit on Login button
    Then user should get logged success fully with valid data

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin    | Admin    |
