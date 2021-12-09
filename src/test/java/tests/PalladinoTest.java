package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class PalladinoTest extends BaseTest {

    @Test (description = "Result for Palladino test")
    public void shouldBeToCalculateThePalladino() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .intervalPowerTargetCalculator("115", "20")
                .cpAndRwcFromACpTest("5", "22", "55",
                                    "7", "33", "44")
                .cpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "24",
                                                            "39", "42")
                .cpFromRaceOrTTGreaterThanOrEqualToFortyMinutes("8", "30", "47");
    }

    @Test(description = "Error entering values for Palladino test")
    public void errorEnteringValuesPaceCalculator() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("", "20", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Critical Power.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirst() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "",
                                        "7", "33", "44","×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Average Power (Short).");
    }

    @Test(description = "Error entering values for Palladino in second test")
    @Description()
    public void errorEnteringValuesResultSecond() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "24", "39",
                                                                "", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Race Avg Power (W).");
    }

    @Test(enabled = false, description = "Error entering values for Palladino in third test")
    public void errorEnteringValuesResultThird() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTGreaterThanOrEqualToFortyMinutes("12", "43", "",
                                                                    "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Race Avg Power (W).");
    }
}


