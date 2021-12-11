package tests;

import org.testng.annotations.Test;

public class HansonsTest extends BaseTest {

    @Test(description = "The correct result during the calculation of the pace")
    public void correctInputOfValidData() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .calculationData("10", "1", "23",
                        "54", "38", "48", "18");
    }

    @Test(description = "Result error when there is no data in the minutes field")
    public void fillingInFieldsWithoutSpecifyingValues() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("10", "1", "",
                        "54", "38", "48", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*Please enter an Integer value for Minutes.");
    }

    @Test(description = "Result error when specifying the maximum allowable pace")
    public void dataEntryIsAboveTheMaximumAllowableRate() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("10", "1", "22",
                        "54", "151", "48", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*Temperature Adjustment cannot be greater than 150.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable humidity")
    public void enteringDataAboveTheMaximumAllowableHumidity() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("10", "1", "22",
                        "54", "38", "151", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*Humidity Adjustment cannot be greater than 100.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable distance")
    public void enteringDataAboveTheMaximumAllowableDistance() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("43", "1", "22",
                        "54", "38", "48", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*You cannot enter a race greater than a marathon.");
    }
}
