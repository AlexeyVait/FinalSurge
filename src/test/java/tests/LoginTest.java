package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Authorization in site")
    public void userShouldBeAuthorization() {
        loginPage
                .open()
                .login(user, password);
    }

    @Test(enabled = false)
    public void userShouldNotAuthorization() {
        loginPage
                .open()
                .erorr("rytu@gmail.com", password);
    }
}
