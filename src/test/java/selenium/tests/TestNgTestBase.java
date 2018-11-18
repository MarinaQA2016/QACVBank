package selenium.tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import selenium.application.AppManager;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected final AppManager app = new AppManager();

  @BeforeSuite
  public void initTestSuite() throws IOException {
    app.setUpSuit();
  }

  @BeforeMethod
  public void initWebDriver() {
    app.start();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    app.stop();
  }

  public AppManager getApp() {
    return app;
  }
}
