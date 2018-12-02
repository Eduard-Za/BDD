package steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import task.quandoo.drivers.ChromeWebDriver;

/**
 * BaseSteps
 * Base steps - cover Before and After methods.
 *
 * @author Eduard Zaretski
 */
public class BaseSteps {

    protected static WebDriver driver;

    @Before
    public void createDriver() {
        driver = ChromeWebDriver.getWebDriverInstance();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
