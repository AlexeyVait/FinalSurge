package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Authorization in site")
    public void enterValidData() {
        loginSteps
                .correctLogin(user, password);

    }

    @Test(description = "Incorrect authorization")
    public void enteringAnInvalidUsername() {
        loginSteps
                .invalidLogin("rytu@gmail.com", password,
                        "Invalid login credentials. Please try again.");
    }
}
