package tests;

import org.testng.annotations.Test;

public class IntensityTest extends BaseTest {

    @Test(description = "The correct result during the calculation of the intensity data")
    public void correctInputOfValidData() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .resultIntensity("1","26", "54");
    }

    @Test(description = "Result error if there is no data in the minutes field")
    public void fillingInFieldsWithoutSpecifyingValues() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("1", "","34","×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }


    @Test(description = "Result error when specifying the maximum allowable minute value")
    public void dataEntryAboveTheMaximumAllowedValuesMM() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("0", "60","18","×\n" +
                        "Please fix the following errors:\n" +
                        "*Minutes cannot be greater than 59.");
    }

    @Test(description = "Result error when specifying the maximum allowed value in the seconds field")
    public void dataEntryAboveTheMaximumAllowedValuesSS() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("0", "52","60","×\n" +
                        "Please fix the following errors:\n" +
                        "*Seconds cannot be greater than 59.");
    }
}
