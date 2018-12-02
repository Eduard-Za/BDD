package task.quandoo.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import task.quandoo.exceptions.UnknownOsException;

import static task.quandoo.drivers.Drivers.*;
import static task.quandoo.utils.PropertiesLoader.loadProperty;

/**
 * Class sets the chromedriver path and returns an instance of ChromeDriver object.
 *
 * @author Eduard Zaretski
 */


public class ChromeWebDriver {

    private static final String OS = "os.name";
    private static final String DRIVER = "webdriver.chrome.driver";

    /**
     * Static method checks for the system name and sets the system chromedriver properties.
     *
     * @return new proper ChromeDriver instance.
     */
    public static WebDriver getWebDriverInstance() {
        String os = System.getProperty(OS);
        String chromeDriverPath = null;
        if (os.contains(WINDOWS.getOsName())) {
            chromeDriverPath = loadProperty(WINDOWS.getPath());
        } else if (os.contains(MAC.getOsName())) {
            chromeDriverPath = loadProperty(MAC.getPath());
        } else if (os.contains(Linux.getOsName())) {
            chromeDriverPath = loadProperty(Linux.getPath());
        } else {
            throw new UnknownOsException("Unsupported OS");
        }
        System.setProperty(DRIVER, chromeDriverPath);
        return new ChromeDriver();
    }
}
