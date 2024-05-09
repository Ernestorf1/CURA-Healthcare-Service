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
    @Given("^user open the browser and navigate to CuraPage$")
    public void user_open_the_browser_and_navigate_to_CuraPage() {
curaP.navigateToCuraPage();
    }
    @When("^verify the information is displayed$")
    public void verify_the_information_is_displayed(){
        curaP.infoIsDisplayed();
        
    }
    @And("^clicks on the Appointment button$")
    public void clicks_on_the_Appointment_button(){
        curaP.clicksAppBtn();
    }
    @Then("^Verify that the login page is loaded successfull$")
    public void Verify_that_the_login_page_is_loaded_successfull(){
        curaP.infoIsLoaded();
    }

}
