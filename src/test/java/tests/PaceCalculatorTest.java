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

    @Test(description = "Error entering values for Pace Calculator test")
    @Description()
    public void errorEnteringValuesMaxDistance() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("10000", "1", "22", "13", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Distance cannot be greater than 9,999.00.");
    }

    @Test(description = "Error entering values for Pace Calculator test")
    @Description()
    public void errorEnteringValuesMaxMin() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("22", "1", "60", "13", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Minutes cannot be greater than 59.");
    }

    @Test(description = "Error entering values for Pace Calculator test")
    @Description()
    public void errorEnteringValuesMaxSek() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("22", "1", "55", "60", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Seconds cannot be greater than 59.");
    }
}
