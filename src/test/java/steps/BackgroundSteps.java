package steps;

import cucumber.api.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static task.pages.BasePage.url;
/**
 * BackgroundSteps
 * Class that describes general steps.
 *
 * @author Eduard Zaretski
 */

public class BackgroundSteps implements En {
    public BackgroundSteps() {
        Given("I am on the (.*) page", (String page) -> {
            switch (page) {
                case "Login":
                    open(url + "/login");
                    break;
                case "Tables":
                    open(url + "/tables");
                    break;
                case "Hovers":
                    open(url + "/hovers");
                    break;
            }
        });
    }

}
