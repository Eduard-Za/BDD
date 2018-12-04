package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import task.utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;


/**
 * LoginPage
 * Class that describes Login Page.
 *
 * @author Eduard Zaretski
 */
public class LoginPage extends BasePage {

    /* locators*/
    private By usernameField = By.cssSelector("#username");
    private By passwordField = By.cssSelector("#password");
    private By loginButton = By.cssSelector("button.radius");
    private By textMessage = By.cssSelector("#flash");


    /* properties*/
    private String validUsername = PropertiesLoader.loadProperty("valid.username");
    private String validPassword = PropertiesLoader.loadProperty("valid.password");
    private String invalidUsername = PropertiesLoader.loadProperty("invalid.username");
    private String invalidPassword = PropertiesLoader.loadProperty("invalid.password");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setCredentials(String credentials) {
        switch (credentials) {
            case "valid.credentials":
                $(usernameField).setValue(validUsername);
                $(passwordField).setValue(validPassword);
                break;
            case "invalid.username":
                $(usernameField).setValue(invalidUsername);
                $(passwordField).setValue(validPassword);
                break;
            case "invalid.password":
                $(usernameField).setValue(validUsername);
                $(passwordField).setValue(invalidPassword);
                break;
        }
    }

    public void clickLoginButton() {
        $(loginButton).click();
    }

    public String getMessageFromPage() {
        String actualMessage = $(textMessage).getText().trim();
        return actualMessage;
    }


}
