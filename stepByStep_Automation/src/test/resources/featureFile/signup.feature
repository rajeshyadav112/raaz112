Feature: Signup functionality with detailed personal and address information

  Scenario: Signup with valid details and selecting newsletter options
    Given The user is on the signup page
    When The user enters the following personal information
      | title | name         | email                      | password    | day | month | year |
      | Mr.   | Rajesh Yadav | rajeshyadav14112@gmail.com | password123 |  15 | March | 1990 |
    And selects "Sign up for our newsletter"
    And selects "Receive special offers from our partners"
    And enters the following address information
      | first_name | last_name | company   | address                  | address2 | country | state     | city      | zipcode | mobile_no  |
      | Rajesh     | Yadav     | MyCompany | 123 Street Name, Apt 456 |          | India   | Karnataka | Bangalore |  560001 | 9876543210 |
    And clicks on the signup button
    Then The user account should be created successfully

  Scenario: Signup without selecting newsletter options
    Given The user is on the signup page
    When The user enters the following personal information
      | title | name       | email             | password    | day | month | year |
      | Mrs.  | Arya Yadav | aryadav@gmial.com | password456 |  22 | April | 1985 |
    And enters the following address information
      | first_name | last_name | company | address                   | address2 | country | state       | city | zipcode | mobile_no  |
      | Anita      | Yadav     |         | 789 Road Avenue, Suite 10 | Apt 12   | India   | Maharashtra | Pune |  411001 | 8765432109 |
    And clicks on the signup button
    Then The user account should be created successfully
