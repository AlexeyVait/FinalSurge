package tests;

import org.testng.annotations.Test;

public class CaloricNeedsTest extends BaseTest {

    @Test(description = "Correct result during calorie counting ")
    public void correctInputOfValidData () {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .calculationCaloric("86", "178", "25", "10");
    }

    @Test(description = "Result error if there is no data in the age field")
    public void fillingInFieldsWithoutSpecifyingTheAge() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "178", "", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Age.");
    }

    @Test(description = "Result error when specifying the minimum allowable age")
    public void dataEntryBelowTheMinimumAllowedAge() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "178", "4", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Age cannot be less than 5.");
    }

    @Test(description = "Result error when specifying the minimum allowable weight")
    public void dataEntryIsBelowTheMinimumAllowableWeight() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("29", "178", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Weight cannot be less than 30.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable weight")
    public void dataEntryIsHigherThanTheMaximumAllowableWeight() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("501", "178", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Weight cannot be greater than 500.00.");
    }

    @Test(description = "Result error when specifying the minimum allowable height")
    public void dataEntryIsBelowTheMinimumAllowableHeight() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "59", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Height in Centimeters cannot be less than 60.00.");
    }

    @Test(description = "Result error when specifying the Maximum allowable height")
    public void dataEntryIsBelowTheMaximumAllowableHeight() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "241", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Height in Centimeters cannot be greater than 240.00.");
    }

    @Test(description = "Result error when specifying the maximum allowable distance")
    public void dataEntryIsHigherThanTheMaximumAllowableDistance() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "178", "25", "501", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Run Distance cannot be greater than 500.00.");
    }
}
