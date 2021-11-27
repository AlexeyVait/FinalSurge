package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Authorization in site")
    public void userShouldBeAuthorization() {
        loginPage
                .open()
                .login(user, password);
    }

    @Test(description = "Authorization is not true")
    public void userShouldNotAuthorization() {
        loginPage
                .open()
                .erorr("rytu@gmail.com", password)
                .validateErrorText("Invalid login credentials. Please try again.");
    }
}
