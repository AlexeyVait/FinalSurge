package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class PalladinoTest extends BaseTest {

    @Test (description = "Correct result when calculating the pace")
    public void correctInputOfValidData() {
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

    @Test(description = "Result error when there is no data in the Critical Power field")
    public void fillingInFieldsWithoutSpecifyingCriticalPower() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("", "20", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Critical Power.");
    }

    @Test(description = "Result error when specifying the maximum allowable value Critical Power")
    public void dataEntryIsHigherThanTheMaximumAllowableValueCP() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("501", "20", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Critical Power cannot be greater than 500.00.");
    }

    @Test(description = "Result error when specifying the minimum allowable value Critical Power")
    public void dataEntryIsBelowTheMinimumAllowableValueCP() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("99", "20", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Critical Power cannot be less than 100.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable value of Reserve Work Capacity")
    public void dataEntryIsHigherThanTheMaximumAllowableValueRWC() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("150", "31", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Reserve Work Capacity cannot be greater than 30.00.");
    }

    @Test(description = "Result error when specifying the minimum allowable value of Reserve Work Capacity")
    public void dataEntryIsHigherThanTheMinimumAllowableValueRWC() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorIntervalPowerTargetCalculator("150", "0.9", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Reserve Work Capacity cannot be less than 1.00.");
    }

    @Test(description = "Error in evaluating the result of running")
    public void fillingInFieldsWithoutSpecifyingAvgPower () {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "",
                                        "7", "33", "44","×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Average Power (Short).");
    }

    @Test(description = "Result error when specifying the minimum allowed Avg. Power in the field 'Short'")
    public void dataEntryIsHigherThanTheMinimumAllowableShortAP() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "19",
                        "7", "33", "44","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Short) cannot be less than 20.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable Avg. Power in the field 'Short'")
    public void dataEntryIsHigherThanTheMaximumAllowableShortAP() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "801",
                        "7", "33", "44","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Short) cannot be greater than 800.00.");
    }

    @Test(description = "Result error when specifying the minimum allowed Avg. Power in the field 'Long'")
    public void dataEntryIsHigherThanTheMinimumAllowableLongAP() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "7", "33", "19","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Long) cannot be less than 20.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable Avg. Power in the field 'Long'")
    public void dataEntryIsHigherThanTheMaximumAllowableLongAP() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "7", "33", "801","×\n" +
                                "Please fix the following errors:\n" +
                                "*Average Power (Long) cannot be greater than 800.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable Short mm")
    public void dataEntryIsHigherThanTheMaximumAllowableShortMM() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("60", "22", "25",
                        "7", "33", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*Minutes (Short Test) cannot be greater than 59.");
    }

    @Test(description = "Result error when specifying the maximum allowable Short ss")
    public void dataEntryIsHigherThanTheMaximumAllowableShortSS() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "60", "25",
                        "7", "33", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*Seconds (Short Test) cannot be greater than 59.");
    }

    @Test(description = "Result error when specifying the maximum allowable Long mm")
    public void dataEntryIsHigherThanTheMaximumAllowableLongMM() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "60", "33", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*Minutes (Long Test) cannot be greater than 59.");
    }

    @Test(description = "Result error when specifying the maximum allowable Long SS")
    public void dataEntryIsHigherThanTheMaximumAllowableLongSS() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpAndRwcFromACpTest("5", "22", "25",
                        "7", "60", "25","×\n" +
                                "Please fix the following errors:\n" +
                                "*SECONDS (Long Test) cannot be greater than 59.");
    }

    @Test(description = "Result error when calculation range from 40 minutes or more")
    public void errorEnteringValuesResultSecond() {
        loginSteps
                .correctLogin(user, password);
        palladinoSteps
                .errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes("2", "24", "39",
                                                                "", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter a value for Race Avg Power (W).");
    }

    @Test(description = "Result error when specifying the minimum allowable value of AVG Power in the range from 40 minutes or more")
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

    @Test(description = "Result error when specifying the maximum allowable value of AVG Power in the range from 40 minutes or more")
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

    @Test(description = "Result error when specifying the maximum allowable value of minutes in the range from 40 minutes or more")
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

    @Test(description = "Result error when specifying the maximum allowable value of second in the range from 40 minutes or more")
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

        @Test(enabled = false, description = "Result error when calculation range up to 40 minutes or less")
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


