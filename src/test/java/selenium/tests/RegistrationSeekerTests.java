package selenium.tests;

import org.testng.annotations.Test;

import selenium.model.RegistrationSeekerData;

public class RegistrationSeekerTests extends TestNgTestBase{
    
    @Test
    public void RegistrationSeekerTests() {
        //app.openSite();
        app.getRegistration().initRegistration();
        app.getRegistration().fillRegistrationSeekerForm(new RegistrationSeekerData(
                "John", "Jonson", "aaa@mail.ru", "+972543212321", "abcdefgh"));
        app.getRegistration().submitRegistration();
    }

}
