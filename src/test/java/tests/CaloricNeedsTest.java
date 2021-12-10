package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CaloricNeedsTest extends BaseTest {

    @Test(description = "Result for Caloric Needs test")
    @Description()
    public void shouldBeToCalculateTheCaloriesOfAMan() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .calculationCaloric("86", "178", "25", "10");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "178", "", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Age.");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValuesForMinAge() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "178", "4", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Age cannot be less than 5.");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValuesForMinWeight() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("29", "178", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Weight cannot be less than 30.00.");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValuesForMaxWeight() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("501", "178", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Weight cannot be greater than 500.00.");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValuesForMinGrowth() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "59", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Height in Centimeters cannot be less than 60.00.");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValuesForMaxGrowth() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "241", "25", "10", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Height in Centimeters cannot be greater than 240.00.");
    }

    @Test(description = "Error entering values for CaloricNeeds test")
    @Description()
    public void errorEnteringValuesForMaxDistance() {
        loginSteps
                .correctLogin(user, password);
        caloricNeedsSteps
                .errorResult("86", "178", "25", "501", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Run Distance cannot be greater than 500.00.");
    }
}
