Feature: Test CURA Healthcare Page functionality

  @Test1
  Scenario: CuraPage Functionality Test
    Given As a user open the browser and navigate to CuraPage
    When User is on the landing Page
    And clicks on the Appointment button
    And User logs in with username field and password field
    And fill out the appointment form
    And submit the appointment form
    Then User should see a confirmation page