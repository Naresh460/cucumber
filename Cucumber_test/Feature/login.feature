Feature: Test login functionality
 
@sanity 
Scenario: Testing the valid login
  
    Given user is on login page                 
    When provided the input parameters username "admin@yourstore.com" and password "admin"
   When click on login buttonn
    And verified the homepage
   Then clicked on logout button
   
   
 #Scenario Outline: Testing to valid login with outline
  #
    #Given user is on login page                 
    #When provided the input parameters username "<username>" and password "<password>"
   #When click on login buttonn
    #And verified the homepage
   #Then clicked on logout button
   #And   quite the browser
     #
     #Examples:
    #|username|password|
    #|admin@yourstore.com|admin|
    #|admin@yourstore.com|admin|
    #|admin@yourstore.com|admin|
   #
   
   #Scenario Outline: Testing the valid login
  #
    #Given user is on login pages                    
    #When givenn <username> and <password>
   #And click on login buttonn
   #Then landed on homepagee
   #Examples:
   #|username|password|
    #|admin@yourstore.com|admin|
    #|admin@yourstore.com|admin|
    #|admin@yourstore.com|admin|
    