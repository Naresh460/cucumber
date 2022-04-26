Feature: Test login functionality
 @P1
Scenario Outline: Testing the valid login
  
    Given user is on login pages                    
    When givenn <username> and <password>
   And click on login buttonn
   Then landed on homepagee
   Examples:
   |username|password|
    |Admin|admin123|
     
   
   @P2
   Scenario Outline: Testing the valid login
  
    Given user is on login pages                    
    When givenn <username> and <password>
   And click on login buttonn
   Then landed on homepagee
   Examples:
   |username|password|
    |Admin|admin1234|
    