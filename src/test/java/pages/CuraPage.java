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

    public void clicksAppBtn() {
       clickElement(appointmentBtn, "xpath");
	}
    public void infoIsLoaded() {
     elementIsDisplayed(firstResult,"xpath");
    }

	
}
