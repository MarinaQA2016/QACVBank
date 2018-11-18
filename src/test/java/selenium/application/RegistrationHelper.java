package selenium.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.model.RegistrationSeekerData;

/**
 * Created by Alex on 11/18/2018.
 */
public class RegistrationHelper extends Page{

    public RegistrationHelper(WebDriver driver) {
        super(driver);
    }

    public void submitRegistration() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void fillRegistrationSeekerForm(RegistrationSeekerData register) {
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys(register.getFirstName());
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys(register.getLastName());
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(register.getEmail());
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(register.getPhone());
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(register.getPassword());
        driver.findElement(By.id("password-confirm")).click();
        driver.findElement(By.id("password-confirm")).clear();
        driver.findElement(By.id("password-confirm")).sendKeys(register.getPassword());
    }

    public void initRegistration() {
        driver.findElement(By.xpath("//ul[@class='menu-btns']//button[.=' Register ']")).click();
    }
}
