package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.appBookingPage;

public class appBookingSteps {
    appBookingPage appBookingP = new appBookingPage();
@Given("User is on form page and select the hospital")
public void user_is_on_form_page_and_select_the_hospital() {
   appBookingP.isOnBookingFormPage();
}
@When("verify readmission and health program")
public void verify_readmission_and_health_program() {
    appBookingP.verifyreadmisioonhealthprogram();
   
}
@And("Select an available date")
public void select_an_available_date() {
   appBookingP.selectDate();
}
@And("leaves a health comment")
public void leaves_a_health_comment() {
   appBookingP.writeComment();
}
@And("clicks on the book appointment button")
public void clicks_on_the_book_appointment_button() {
  appBookingP.clickBookAppointment();
}
@Then("user verify that the appointment confirmation page is loaded")
public void user_verify_that_the_appointment_confirmation_page_is_loaded() {
  appBookingP.confirmationPage();
    
}
}
