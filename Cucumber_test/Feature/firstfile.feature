Feature: Test login functionality
 
## Scenario: Testing the valid login
  
   ## Given user is on login page                      given \"(.*)\" and \"(.*)\"$"
  ##  When given "admin" and "admin123"
   ## And click on login button
   ## Then landed on homepage
   
  Scenario: Testing the valid login  
  
    Given user is on login page                      
    When user enters below credentials from Datatable
    |username|password|
    |Admin|admin123|
     |Admin|admin123|
      |Admin|admin123|
       |Admin|admin123|
        |Admin|admin123|
    
    And click on login button
    Then landed on homepage    
    
   
    
    

