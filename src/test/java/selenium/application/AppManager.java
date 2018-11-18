package selenium.application;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import ru.stqa.selenium.factory.WebDriverPool;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Alex on 11/18/2018.
 */
public class AppManager {

    protected static URL gridHubUrl = null;
    protected static String baseUrl;
    protected static Capabilities capabilities;
    protected RegistrationHelper registration;
    protected WebDriver driver;

    public void setUpSuit() throws IOException {
      SuiteConfiguration config = new SuiteConfiguration();
      baseUrl = config.getProperty("site.url");
      if (config.hasProperty("grid.url") && !"".equals(config.getProperty("grid.url"))) {
        gridHubUrl = new URL(config.getProperty("grid.url"));
      }
      capabilities = config.getCapabilities();
    }

    public void start() {
      driver = WebDriverPool.DEFAULT.getDriver(gridHubUrl, capabilities);
      registration = new RegistrationHelper(driver);
      openSite();
    }

    public void stop() {
      WebDriverPool.DEFAULT.dismissAll();
    }

    public void openSite() {
        driver.get("https://cv-app-test.herokuapp.com/");
    }

    public RegistrationHelper getRegistration() {
        return registration;
    }
}
