package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class PaceCalculatorTest extends BaseTest {

    @Test(description = "Result for Pace Calculator test")
    @Description()
    public void shouldBeToCalculateThePace() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .resultPaceCalculator("10", "1", "24", "35");
    }

    @Test(description = "Error entering values for Pace Calculator test")
    @Description()
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("10", "1", "", "13", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }
}
