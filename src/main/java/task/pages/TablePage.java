package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


/**
 * TablePage
 * Class that describes Table Page.
 *
 * @author Eduard Zaretski
 */
public class TablePage extends BasePage {

    private By tableLastNames = By.cssSelector("#table2 td.last-name");
    private By lastNameHeader = By.cssSelector("span.last-name");

    public TablePage(WebDriver driver) {
        super(driver);
    }

    public void clickLastNameHeader() {
        $(lastNameHeader).click();
    }

    public boolean verifyOrder(String order) {
        boolean isOrdered = false;
        List<String> actualFromPage = $$(tableLastNames).texts();
        List<String> expectedAscSortedLastName = $$(tableLastNames).texts().stream().sorted().collect(Collectors.toList());
        List<String> expectedDescLastName = expectedAscSortedLastName.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        switch (order) {
            case "ascending":
                isOrdered = expectedAscSortedLastName.equals(actualFromPage);
                break;
            case "descending":
                isOrdered = expectedDescLastName.equals(actualFromPage);
                break;
        }
        return isOrdered;
    }
}
