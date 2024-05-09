package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

    LoginPage loginP = new LoginPage();

    @Given("^user on cura page and clicks on Appointment Button$")
    public void user_on_cura_page_and_clicks_on_Appointment_button() {
        loginP.submitCuraPage();
    }

    @When("^Enter a valid username$")
    public void enter_a_valid_username() {
        loginP.usernameField();
    }

    @And("^Enter a valid password$")
    public void enter_a_valid_password() {
        loginP.passwordField();
    }

    @And("^Click on the Login button$")
    public void click_on_the_Login_button() {
        loginP.clickLoginBtn();
    }

    @Then("^verify appointment form is loaded successfully$")
    public void verify_appointment_form_is_loaded_successfully() {
        loginP.formIsLoaded();
    }
}