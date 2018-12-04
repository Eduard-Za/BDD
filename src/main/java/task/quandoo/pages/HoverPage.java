package task.quandoo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;


/**
 * HoversPage
 * Class that describes Hover page.
 *
 * @author Eduard Zaretski
 * */

public class HoverPage extends BasePage {

    public HoverPage(WebDriver driver) {
        super(driver);
    }

    public void hoverImage(Integer index) {
        String userIndexLocator = String.format("(//img[@alt='User Avatar'])[%d]", index);
        $(By.xpath(userIndexLocator)).hover();
    }

    public String getUserNameFromPage(String username) {
        String userLocator = String.format("//h5[contains(text(), '%s')]", username);
        String usernameFromPage = $(By.xpath(userLocator)).getText();
        return usernameFromPage;
    }
}



