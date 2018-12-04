package steps;

import cucumber.api.java8.En;
import org.junit.Assert;
import task.pages.TablePage;

import static steps.BaseSteps.driver;

/**
 * TableSteps
 * Class that describes steps for Table page.
 *
 * @author Eduard Zaretski
 */
public class TableSteps implements En {
    private TablePage tablePage = new TablePage(driver);


    public TableSteps() {
        When("I order by Last Name", () -> {
            tablePage.clickLastNameHeader();
        });

        Then("table is sorted by last name in (ascending|descending) order", (String order) -> {
            boolean isOrdered = tablePage.verifyOrder(order);
            Assert.assertTrue(isOrdered);
        });

    }
}
