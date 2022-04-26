Feature: Test login functionality
 
## Scenario: Testing the valid login
  
   ## Given user is on login page                      given \"(.*)\" and \"(.*)\"$"
  ##  When given "admin" and "admin123"
   ## And click on login button
   ## Then landed on homepage
   
  Scenario Outline: Testing the valid login  
    Given user is on login page                      
    When given <username> and <password>
    And click on login button
    Then landed on homepage    
    Examples:
    |username|password|
    |Admin|admin123|
    |admin|adminn12345|
    
    

