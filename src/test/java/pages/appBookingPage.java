package pages;

public class appBookingPage extends BasePage{
    private String appointmentBtn = "//*[@id='btn-make-appointment']";
	private String usernameField = "//*[@id=\'txt-username\']";
	private String passwordField = "//*[@id=\'txt-password\']";
	private String loginButton = "btn-login";
    private String makeAppointmentTitle = "//*[@id=\'appointment\']/div/div/div/h2";
    private String selectHospital = "//select[@id='combo_facility']";
	private String checkBoxApply = "//*[@id=\'appointment\']/div/div/form/div[2]/div/label";
	private String radioButtonProgram = "//*[@id=\'appointment\']/div/div/form/div[3]/div/label[1]";
	private String selectVisitDate = "//input[@id='txt_visit_date']";
	private String commentField = "//textarea[@id='txt_comment']";
	private String bookAppointmentBtn = "//*[@id=\'btn-book-appointment\']";
	private String appointmentConf = "//h2[normalize-space()='Appointment Confirmation']";
    public appBookingPage(){
        super(driver);
    }

    public void isOnBookingFormPage() {
        navigateTo("https://katalon-demo-cura.herokuapp.com/");
        clickElement(appointmentBtn, "xpath");   
        write(usernameField, "John Doe", "xpath");
        write(passwordField, "ThisIsNotAPassword", "xpath");
        clickElement(loginButton, "id");
        elementIsDisplayed(makeAppointmentTitle, "xpath");
        selectFromDropdownByIndex(selectHospital, 2, "xpath");
        
    }

    public void verifyreadmisioonhealthprogram() {
        elementIsDisplayed(checkBoxApply, "xpath");
        elementIsDisplayed(radioButtonProgram, "xpath");
      
    }

    public void selectDate() {
     write(selectVisitDate, "22/11/2024", "xpath");
    }

    public void writeComment() {
       write(commentField, "Hi I am John Doe I am feeiling a hurt in the chest, please attend my appointments urgently", "xpath");
    }

    public void clickBookAppointment() {
      clickElement(bookAppointmentBtn, "xpath");;
    }

    public void confirmationPage() {
      elementIsDisplayed(appointmentConf, "xpath");
    }


}
