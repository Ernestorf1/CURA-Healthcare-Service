Feature: Testing login functionalities
@Test1
Scenario: Login Test
Given user on cura page and clicks on Appointment Button
When Enter a valid username
And Enter a valid password
And Click on the Login button
Then verify appointment form is loaded successfully