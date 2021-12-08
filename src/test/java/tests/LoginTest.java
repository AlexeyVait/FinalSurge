package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Authorization in site")
    public void userShouldBeAuthorization() {
        loginSteps
                .correctLogin(user, password);

    }

    @Test(description = "Authorization is not true")
    public void userShouldNotAuthorization() {
        loginSteps
                .invalidLogin("rytu@gmail.com", password,
                        "Invalid login credentials. Please try again.");
    }
}
