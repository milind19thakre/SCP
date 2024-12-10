package testslayer;

import org.testng.annotations.Test;
import pagelayer.ScpLoginPage;

public class LoginTest extends ScpLoginPage {

    @Test
    public void loginTest() {
        login("implementation", "Bluer1dge@3"); // Call the login method from ScpLoginPage
    }
}
