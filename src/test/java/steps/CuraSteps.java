package steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CuraPage;



public class CuraSteps {
    CuraPage curaP = new CuraPage();
     

    @Given("^As a user open the browser and navigate to CuraPage$")
    public void as_a_user_open_the_browser_and_navigate_to_cura_page() {
    // Write code here that turns the phrase above into concrete actions
  curaP.navigateToCuraPage();
  curaP.maximizeWindow();
}
@When("^User is on the landing Page$")
public void user_is_on_the_landing_page() {
    // Write code here that turns the phrase above into concrete actions
    curaP.userIsOnTheLandingPage();
  
}
@And("^clicks on the Appointment button$")
public void clicks_on_the_Appointment_button() {
    // Write code here that turns the phrase above into concrete actions
  curaP.clicks_on_the_Appointment_button();
  
}
@And("^User logs in with username field and password field$")
public void User_logs_in_with_username_field_and_password_field() {
    // Write code here that turns the phrase above into concrete actions
curaP.usernameField();
curaP.passwordField();

    curaP.clicksLogin();
  
}
@And("^fill out the appointment form$")
public void fill_out_the_appointment_form() {
    // Write code here that turns the phrase above into concrete actions
  curaP.dropdownFacility();
  curaP.checkApply();
  curaP.radioProgram();
  curaP.selectDate();
  curaP.commentText();
   
  
}
@And("^submit the appointment form$")
public void submit_the_appointment_form() {
    // Write code here that turns the phrase above into concrete actions
    curaP.clicksBookAppointment();
  
}
@Then("^User should see a confirmation page$")
public void User_should_see_a_confirmation_page() {
    // Verificar que la página de inicio de sesión se haya cargado correctamente
    curaP.isLoginPageLoaded();
   
}
}
