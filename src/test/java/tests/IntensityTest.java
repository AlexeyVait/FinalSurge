package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class IntensityTest extends BaseTest {

    @Test(description = "Result for Intensity test")
    @Description()
    public void shouldBeToCalculateTheIntensity() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .resultIntensity("1","26", "54");
    }

    @Test(description = "Error entering values for Intensity test")
    @Description()
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("1", "","34","×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }

    @Test(description = "Error entering values for Intensity test")
    @Description()
    public void errorEnteringValuesMinTime() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("0", "26","18","×\n" +
                        "Please fix the following errors:\n" +
                        "*Your 10k time cannot be less than 26:19 in order to use this calculator.");
    }

    @Test(description = "Error entering values for Intensity test")
    @Description()
    public void errorEnteringValuesMaxMin() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("0", "60","18","×\n" +
                        "Please fix the following errors:\n" +
                        "*Minutes cannot be greater than 59.");
    }

    @Test(description = "Error entering values for Intensity test")
    @Description()
    public void errorEnteringValuesMaxSek() {
        loginSteps
                .correctLogin(user, password);
        intensitySteps
                .errorResult("0", "52","60","×\n" +
                        "Please fix the following errors:\n" +
                        "*Seconds cannot be greater than 59.");
    }
}
