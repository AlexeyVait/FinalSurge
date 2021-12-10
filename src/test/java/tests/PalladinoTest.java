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

    @Test(description = "Error entering values for Palladino test")
    public void errorEnteringValuesPaceCalculatorMaxCriticalPower() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("501", "20", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Critical Power cannot be greater than 500.00.");
    }

    @Test(description = "Error entering values for Palladino test")
    public void errorEnteringValuesPaceCalculatorMinCriticalPower() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("99", "20", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Critical Power cannot be less than 100.00.");
    }

    @Test(description = "Error entering values for Palladino test")
    public void errorEnteringValuesPaceCalculatorMaxReserveWorkCapacity() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("150", "31", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Reserve Work Capacity cannot be greater than 30.00.");
    }

    @Test(description = "Error entering values for Palladino test")
    public void errorEnteringValuesPaceCalculatorMinReserveWorkCapacity() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("150", "0.9", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Reserve Work Capacity cannot be less than 1.00.");
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

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMinAveragePowerShort() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "19",
                        "7", "33", "44","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Short) cannot be less than 20.00.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMaxAveragePowerShort() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "801",
                        "7", "33", "44","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Short) cannot be greater than 800.00.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMinAveragePowerLong() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "7", "33", "19","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Long) cannot be less than 20.00.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMaxAveragePowerLong() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "7", "33", "801","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Long) cannot be greater than 800.00.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMaxMinShort() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("60", "22", "25",
                        "7", "33", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*Minutes (Short Test) cannot be greater than 59.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMaxSekShort() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "60", "25",
                        "7", "33", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*Seconds (Short Test) cannot be greater than 59.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMaxMinLong() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "60", "33", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*Minutes (Long Test) cannot be greater than 59.");
    }

    @Test(description = "Error entering values for Palladino in first test")
    @Description()
    public void errorEnteringValuesResultFirstMaxSekLong() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "7", "60", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*SECONDS (Long Test) cannot be greater than 59.");
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

    @Test(description = "Error entering values for Palladino in second test")
    @Description()
    public void errorEnteringValuesResultMinRaceAvgPowerW() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "24", "39",
                        "19", "×\n" +
                                "Please fix the following errors:\n" +
                                "*Race Avg Power (W) cannot be less than 20.00.");
    }

    @Test(description = "Error entering values for Palladino in second test")
    @Description()
    public void errorEnteringValuesResultMaxRaceAvgPowerW() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "24", "39",
                        "801", "×\n" +
                                "Please fix the following errors:\n" +
                                "*Race Avg Power (W) cannot be greater than 800.00.");
    }

    @Test(description = "Error entering values for Palladino in second test")
    @Description()
    public void errorEnteringValuesResultMaxMin() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "60", "39",
                        "50", "×\n" +
                                "Please fix the following errors:\n" +
                                "*Minutes (Race Time) cannot be greater than 59.");
    }

    @Test(description = "Error entering values for Palladino in second test")
    @Description()
    public void errorEnteringValuesResultMaxSecond() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "24", "60",
                        "50", "×\n" +
                                "Please fix the following errors:\n" +
                                "*Seconds (Race Time) cannot be greater than 59.");
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


