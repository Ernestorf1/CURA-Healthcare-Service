package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CuraPage extends BasePage {

	

	private String pageTitle = "//h1[normalize-space()='CURA Healthcare Service']";// xpath
	private String appointmentBtn = "//*[@id='btn-make-appointment']";
	private String firstResult = "//*[@id=\"login\"]/div/div/div[1]/h2";
	


	public CuraPage() {
		super(driver);
	}

	public void navigateToCuraPage() {
		navigateTo("https://katalon-demo-cura.herokuapp.com/");
	}

	public void infoIsDisplayed() {
		elementIsDisplayed(pageTitle, "xpath");
	}

<<<<<<< HEAD
    public void clicksAppBtn() {
       clickElement(appointmentBtn, "xpath");
=======
	public String firstResult() {
		return textFromElement(firstResult);

	}

	public void clicks_on_the_Appointment_button() {

		clickElement(appointmentBtn);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loginResult)));
	}

	public boolean isLoginPageLoaded() {

		try {
			
			elementIsDisplayed(appointmentConf);

			// Si la espera es exitosa, significa que la página se ha cargado correctamente
			return true;
		} catch (TimeoutException e) {
			// Si la espera falla, significa que la página no se ha cargado correctamente
			return false;
		}

	}

	public void usernameField() {
		
		write(usernameField, "John Doe");

	}

	public void passwordField() {
		write(passwordField, "ThisIsNotAPassword");

	}

	public void clicksLogin() {
		
		clickElement(loginButton);
	}

	public void dropdownFacility() {
		selectFromDropdownByIndex(selectHospital, 1);
	}

	public void checkApply() {
		elementIsDisplayed(checkBoxApply);
	}

	public void radioProgram() {
		elementIsSelected(radioButtonProgram);
	}

	public void selectDate() {
		write(selectVisitDate, "22/09/2024");
	}

	public void commentText() {
		write(commentField, "I am Lorem Ipsum");
	}

	public void clicksBookAppointment() {
		clickElement(bookAppointmentBtn);
>>>>>>> 70c3bdaefc1deb1a2ca5270840c496086ec37a31
	}
    public void infoIsLoaded() {
     elementIsDisplayed(firstResult,"xpath");
    }

	
}
