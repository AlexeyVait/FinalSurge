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

    @Test(description = "Error entering values for Hansons test")
    @Description("")
    public void errorEnteringValuesMaxTemperature() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("10", "1", "22",
                        "54", "151", "48", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*Temperature Adjustment cannot be greater than 150.00.");
    }

    @Test(description = "Error entering values for Hansons test")
    @Description("")
    public void errorEnteringValuesMaxHumidity() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("10", "1", "22",
                        "54", "38", "151", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*Humidity Adjustment cannot be greater than 100.00.");
    }

    @Test(description = "Error entering values for Hansons test")
    @Description("")
    public void errorEnteringValuesMaxDistance() {
        loginSteps
                .correctLogin(user, password);
        hansonsSteps
                .errorResult("43", "1", "22",
                        "54", "38", "48", "18",
                        "×\n" + "Please fix the following errors:\n" +
                                "*You cannot enter a race greater than a marathon.");
    }
}
