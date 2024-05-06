package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CuraPage extends BasePage {

	// Defino los selectores de elementos

	private String pageTitle = "//h1[normalize-space()='CURA Healthcare Service']";// xpath
	private String appointmentBtn = "//*[@id='btn-make-appointment']";
	private String firstResult = "//*[@id=\'top\'']/div/h3";
	private String loginResult = "//p[@class='lead']";
	private String usernameField = "//input[@id='txt-username']";
	private String passwordField = "//input[@id='txt-password']";
	private String loginButton = "//button[@id='btn-login']";
	private String selectHospital = "//select[@id='combo_facility']";
	private String checkBoxApply = "//label[@for='chk_hospotal_readmission']";
	private String radioButtonProgram = "//label[normalize-space()='Medicare']";
	private String selectVisitDate = "//input[@id='txt_visit_date']";
	private String commentField = "//textarea[@id='txt_comment']";
	private String bookAppointmentBtn = "//button[@id='btn-book-appointment']";
	private String appointmentConf = "//*[@id=\"appointment\"]/div/div/div/h2";

	// Constructor , es necesario para heredar
	public CuraPage() {
		super(driver);
	}

	// Es publico porque lo vamos a usar desde los step definitions
	public void navigateToCuraPage() {
		navigateTo("https://katalon-demo-cura.herokuapp.com/");
	}

	public void userIsOnTheLandingPage() {
		elementIsDisplayed(pageTitle);
	}

	public String firstResult() {
		return textFromElement(firstResult);

	}

	public void clicks_on_the_Appointment_button() {

		clickElement(appointmentBtn);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loginResult)));
	}

	public boolean isLoginPageLoaded() {

		try {
			// Espera a que el título de la página sea igual a "Login"
			elementIsDisplayed(appointmentConf);

			// Si la espera es exitosa, significa que la página se ha cargado correctamente
			return true;
		} catch (TimeoutException e) {
			// Si la espera falla, significa que la página no se ha cargado correctamente
			return false;
		}

	}

	public void usernameField() {
		// TODO Auto-generated method stub
		write(usernameField, "John Doe");

	}

	public void passwordField() {
		write(passwordField, "ThisIsNotAPassword");

	}

	public void clicksLogin() {
		// TODO Auto-generated method stub
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
	}

}
