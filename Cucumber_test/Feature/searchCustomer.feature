Feature: Search for a Customer functionality
 
Scenario: Search Customer 
  
    Given user is on login page                 
    When provided the input parameters username "admin@yourstore.com" and password "admin"
    When click on login buttonn
    And click on customer menu
    And click on customer sub menu
    And user enters emaild "victoria_victoria@nopCommerce.com"
    And user clicked on search button
    And verifying the emailid in the results set    
    Then clicked on logout button
  
   
   #The new customer has been added successfully.---//div[@class="alert alert-success alert-dismissable"]
   
 