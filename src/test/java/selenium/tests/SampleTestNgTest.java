package selenium.tests;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.application.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  /*@BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(app.driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    app.driver.get(AppManager.baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }*/
}
