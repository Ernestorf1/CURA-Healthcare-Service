Feature: Appointment Booking Test 
@Test1
Scenario: Fill out Appointment booking form
Given User is on form page and select the hospital
When verify readmission and health program
And Select an available date 
And leaves a health comment
And clicks on the book appointment button
Then user verify that the appointment confirmation page is loaded 