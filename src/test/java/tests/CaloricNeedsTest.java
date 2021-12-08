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
}
