# CURA-Healthcare-Service
## Test Plan for CuraPage Automation

### 1. Test Scenarios:

#### Scenario 1: CuraPage Functionality Test (CuraPage1)
1. Open the browser and navigate to the CuraPage.
2. Verify that the information on the landing page is displayed correctly.
3. Click on the "Appointment" button.
4. Verify that the login page (LoginPage) is loaded successfully.

#### Scenario 2: Login Test (LoginPage2)
1. Enter a valid username.
2. Enter a valid password.
3. Click on the "Login" button.
4. Verify that the appointment form page (AppointmentPage) is loaded successfully.

#### Scenario 3: Appointment Booking Test (AppointmentPage3)
1. Select an available date from the calendar.
2. Select an available time slot.
3. Fill in all the fields of the form (dropdown, checkbox, radio buttons, comment field).
4. Click on the "Book Appointment" button.
5. Verify that the appointment confirmation page (AppointmentConfPage) is loaded correctly with the entered data.

#### Scenario 4: Appointment Confirmation Verification (AppointmentConfPage4)
1. Verify that all appointment details are displayed correctly on the confirmation page.
2. Click on the "Go to Homepage" button.
3. Verify that the home page (CuraPage) is loaded correctly.

### 2. Test Requirements:

- Verify the loading of each page (CuraPage, LoginPage, AppointmentPage, AppointmentConfPage).
- Ensure that page elements (buttons, input fields, dropdowns, checkboxes, radio buttons) are present and functional.
- Verify that the data entered in the appointment form is displayed correctly on the confirmation page.

### 3. Considerations:

- Use valid test data for each field (username, password, appointment date, etc.).
- Perform tests on different browsers and screen sizes to ensure compatibility.
- Ensure that error messages are displayed correctly when invalid data is entered.

### 4. Additional Test Cases:

- Error handling tests: Verify that appropriate error messages are displayed when invalid data is entered in the form.
- Performance tests: Verify that the page loads quickly and actions are performed within a reasonable time.
