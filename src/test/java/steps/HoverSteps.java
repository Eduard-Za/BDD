package steps;

import cucumber.api.java8.En;
import org.junit.Assert;
import task.quandoo.pages.HoverPage;

import static steps.BaseSteps.driver;

/**
 * HoverSteps
 * Class that describes steps for Hover page.
 *
 * @author Eduard Zaretski
 */
public class HoverSteps implements En {

    private HoverPage hoverPage = new HoverPage(driver);

    public HoverSteps() {

        When("I hover (\\d+) avatar", (Integer index) -> {
            hoverPage.hoverImage(index);
        });

        Then("I check that (.*) is displayed", (String username) -> {
            String usernameFromPage = hoverPage.getUserNameFromPage(username);
            Assert.assertTrue(usernameFromPage.contains(username));
        });
    }
}
