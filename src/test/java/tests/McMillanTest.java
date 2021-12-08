package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class McMillanTest extends BaseTest {

    @Test(description = "Result for McMillan test")
    @Description()
    public void shouldBeToCalculateTheMcMillan() {
        loginSteps
                .correctLogin(user, password);
        mcMillanSteps
                .resultCalculator("1", "45", "23",
                        "1", "47", "52");
    }

    @Test(enabled = false, description = "Error entering values for McMillan test")
    @Description()
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        mcMillanSteps
                .errorResult("", "", "", "1",
                        "34","24", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }
}
