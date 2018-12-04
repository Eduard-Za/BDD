package task.pages;

import org.openqa.selenium.WebDriver;
import task.utils.PropertiesLoader;



/**
 * BasePage
 * @author Eduard Zaretski
 */
public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static String url = PropertiesLoader.loadProperty("url");


}
