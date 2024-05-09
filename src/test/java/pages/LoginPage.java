package pages;

public class LoginPage extends BasePage {
    private String appointmentBtn = "//*[@id='btn-make-appointment']";
    private String appointmentFormTitle = "//*[@id=\'appointment\']/div/div/div/h2";
	private String usernameField = "//input[@id='txt-username']";
	private String passwordField = "//input[@id='txt-password']";
	private String loginButton = "//button[@id='btn-login']";
	
    public LoginPage(){
        super(driver);
    }

    public void submitCuraPage() {
        navigateTo("https://katalon-demo-cura.herokuapp.com/");
        clickElement(appointmentBtn, "xpath");      

    }

    public void usernameField() {
      write(usernameField, "John Doe", "xpath");
    }

    public void passwordField() {
       write(passwordField, "ThisIsNotAPassword", "xpath");
    }

    public void clickLoginBtn() {
       clickElement(loginButton, "xpath");
    }

    public void formIsLoaded() {
      elementIsDisplayed(appointmentFormTitle, "xpath");
    }
    
}
