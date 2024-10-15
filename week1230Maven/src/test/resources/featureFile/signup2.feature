Feature: Demo signup functionality

  Background: 
    Given user is at signuppage

  @single
  Scenario: Verify the signup with valid data
    #Given user is at signuppage
    When user enter the name and email
      | name   | email      |
      | rajesh | rajesh.com |
    And click on signup Button
    Then user naviagted to the information page

  @multiple
  Scenario Outline: Verify the signup with multiple set of data
    When user input the <fullname> and <emailid>
    And click on button
    Then user should naviagte to the information page with valid data

    Examples: 
      | fullname | emailid          |
      | abc      | rajesh.@com      |
      | xyz      | abc@.in          |
      | tushar   | tushar@gmail.com |
