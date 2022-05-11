Feature: Adding a New Customer
 
@sanity
Scenario: Add a new customer
  
    Given user is on login page                 
    When provided the input parameters username "admin@yourstore.com" and password "admin"
    When click on login buttonn
    And click on customer menu
    And click on customer sub menu
    And click on Add new button
    And user can see create cutomer form
    And user fill the form
    And click on save button
    And verify the customer registration
    Then clicked on logout button
    
   
   #The new customer has been added successfully.---//div[@class="alert alert-success alert-dismissable"]
   
 