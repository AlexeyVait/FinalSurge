package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class HansonsTest extends BaseTest {

    @Test(description = "Result for Hansons test")
    @Description("")
    public void shouldBeToCalculateTheHansons() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .calculationData("10", "1", "23",
                        "54", "38", "48", "18");
    }

    @Test(description = "Error entering values for Hansons test")
    @Description("")
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("10", "1", "",
                        "54", "38", "48", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*Please enter an Integer value for Minutes.");
    }
}
