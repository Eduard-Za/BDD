package steps;

import cucumber.api.java8.En;
import org.junit.Assert;
import task.quandoo.pages.LoginPage;
import task.quandoo.utils.PropertiesLoader;

import static steps.BaseSteps.driver;

/**
 * LoginSteps
 * Class that describes steps for Login page.
 *
 * @author Eduard Zaretski
 */
public class LoginSteps implements En {

    private LoginPage loginPage = new LoginPage(driver);

    public LoginSteps() {

        When("I fill in (.*) in the login fields", (String credentials) -> {
            loginPage.setCredentials(credentials);
            loginPage.clickLoginButton();
        });

        Then("I verify that the text (.*) is displayed", (String message) -> {
            String expectedMessage = PropertiesLoader.loadProperty(message);
            String actualMessage = loginPage.getMessageFromPage();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        });
    }
}
