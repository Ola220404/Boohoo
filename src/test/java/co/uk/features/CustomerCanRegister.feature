Feature:  As a customer
   I want the ability to register on web or when i download the app


  Scenario Outline: User can register
    Given I navigate to boohoo homepage
    When I click on the image icon and select register to display the register form
    And I enter "<Title>" in the tittle field
    And I enter "<FirstName>" in the first name field
    And I enter "<LastName>" in the last name field
    And I enter "<DateOfBirth>" in the date of birth field
    And I select "<Gender>" from the gender dropdown
    And I enter "<EmailAddress>" in the email address field
    And I enter "<EmailAddress>" in the confirm email address field
    And I enter "<Password>" in the password field
    And I enter "<Password>" in the confirm password field
    And I click on "<Register>"
    Then I am taken to "<boohoo>" homepage

    Examples:
      |Title| FirstName|LastName|DateOfBirth|Gender|EmailAddress        |Password|
      |Mr    |Joss      |Ola     |13/04/1980 |M     |Auuto@mailinator.com| Boohoo123|
      |Mr    |Joss     |  Ola    |           |M     |Auuto@mailinator.com |Boohoo123|
