package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BasePage {
    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases
     */
    protected static WebDriver driver;
    private Actions action; // Declaración de la variable action
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
 
    /* 
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
    */
    static {
        WebDriverManager.chromedriver().setup();
 
        //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
    }
 
    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como argumento.
     */
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void navigateTo(String url) {
        // get() carga una pagina web nueva en la ventana del navegador actual
        try {
            driver.get(url);
        } catch (Exception e) {
            System.out.println("Error while navigating to URL: " + e.getMessage());
        }
    }

    public static void closeBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println("Error while closing browser: " + e.getMessage());
        }
    }

    // Metodo que devuelve un web element y Selenium puede trabajar con el, se va a
    // crear esta instancia del WebElement y
    // Navegador (con sus metodos), para después a traves de la herencia reutilizar
    // en tod o el proyecto.
    private WebElement Find(String locator) {
        // Espera hasta que el elemento este presente en la página
        // Utiliza el objeto wait para esperar, lleva dos p)arametros:
        // WebDriverWait(instanciaDelNavegador, tiempoDeEspera)
        WebElement element = null;
        try {
            element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        } catch (Exception e) {
            System.out.println("Error while finding element: " + e.getMessage());
        }
        return element;
    }

    public void clickElement(String locator) {
        // Le agrego una espera al elemento web para cuando sea visible y este
        // disponible para clickear
        /*
         * El objeto By en Selenium se utiliza para localizar elementos en la página
         * web. En otras palabras, es una forma
         * de decirle a Selenium cómo encontrar un elemento específico en el DOM
         * (Documento de Objeto del Modelo) de la página.
         */
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
            element.click();
        } catch (Exception e) {
            System.out.println("Error while clicking element: " + e.getMessage());
        }
        // Dado un xpath (locator), va a localizarlo y va a hacer un click sobre este
        // elemento
        // Find(locator).click();
    }

    public void write(String locator, String textToWrite) {
        // Limpiar el campo de texto
        Find(locator).clear();
        
        // Enviar el texto al campo de texto
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect) {
        // Creamos el dropdown
        Select dropdown = new Select(Find(locator));
        // Seleccionar por valor
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valueToSelect) {
        // Creamos el dropdown
        Select dropdown = new Select(Find(locator));
        // Seleccionar por index
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(String locator, String valueToSelect) {
        // Creamos el dropdown
        Select dropdown = new Select(Find(locator));
        // Seleccionar por index
        dropdown.selectByVisibleText(valueToSelect);
    }

    public void verTypeFile() {
        String change_visibility = "$(\"#fileField\").css(\"visibility,\"visible\");";
        String change_display = "$(\"#fileField\").css(\"display, \"block\");";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(change_display);
        js.executeScript(change_visibility);

        /*
         * ALGUNOS COMANDOS QUE PUEDEN SERVIR EN LA BUSQUEDA DE MOSTRAR LOS WEB ELEMENTS
         *
         * ("#fileField").style.visibility="visible";
         * ("#fileField").style.display="block";
         * ("#fileField").style.width="200px";
         * ("#fileField").style.height="200px";
         * ("#fileField").style.position="fixed";
         * ("#fileField").style.overflow="visible";
         * ("#fileField").style.zIndex="999999";
         * ("#fileField").style.top="500px";
         * ("#fileField").style.bottom="500px";
         * ("#fileField").style.left="500px";
         * ("#fileField").style.right="500px";
         * ("#fileField").style.marginBottom="100px";
         */
    }

    public void hoverOverElement(String locator) {
        action.moveToElement(Find(locator));
    }

    public void doubleClick(String locator) {
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator) {
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column) {
        String cellINeed = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        return Find(cellINeed).getText();
    }

    public void switchToiFrame(int iFrameIndex) {
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String textFromElement(String locator) {
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator) {
        // Devuelve un booleano si es mostrado o no
        return Find(locator).isDisplayed();
    }

    public boolean elementIsSelected(String locator) {
        // Devuelve un booleano si es seleccionado o no
        return Find(locator).isSelected();
    }

    public boolean elementIsEnabled(String locator) {
        // Devuelve un booleano si esta habilitado o no
        return Find(locator).isEnabled();
    }

    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }
}

