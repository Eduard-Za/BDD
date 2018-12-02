package steps;

import cucumber.api.java8.En;
import task.quandoo.pages.LoginPage;

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
            loginPage.validateMessage(message);
        });
    }
}
