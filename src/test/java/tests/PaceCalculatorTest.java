package tests;

import org.testng.annotations.Test;

public class PaceCalculatorTest extends BaseTest {

    @Test(description = "The correct result during the calculation of the pace")
    public void correctInputOfValidData() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .resultPaceCalculator("10", "1", "24", "35");
    }

    @Test(description = "Result error if there is no data in the minutes field")
    public void fillingInFieldsWithoutSpecifyingValues() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("10", "1", "", "13", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }

    @Test(description = "Result error when specifying the maximum allowable distance")
    public void enteringDataAboveTheMaximumAllowableDistance() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("10000", "1", "22", "13", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Distance cannot be greater than 9,999.00.");
    }

    @Test(description = "Result error when specifying the maximum allowed value of minutes")
    public void dataEntryAboveTheMaximumAllowedValuesMM() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("22", "1", "60", "13", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Minutes cannot be greater than 59.");
    }

    @Test(description = "Result error when specifying the maximum allowed value of seconds")
    public void dataEntryAboveTheMaximumAllowedValuesSS() {
        loginSteps
                .correctLogin(user, password);
        paceCalculatorSteps
                .errorResult("22", "1", "55", "60", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Seconds cannot be greater than 59.");
    }
}
