package tests;

import org.testng.annotations.Test;

public class McMillanTest extends BaseTest {

    @Test(description = "The correct result when filling in the expected and optimal data")
    public void correctInputOfValidData() {
        loginSteps
                .correctLogin(user, password);
        mcMillanSteps
                .resultCalculator("1", "45", "23",
                        "1", "47", "52");
    }

    @Test(enabled = false, description = "Error when comparing expected and optimal data with blank fields")
    public void fillingInOnlyOptimalData() {
        loginSteps
                .correctLogin(user, password);
        mcMillanSteps
                .errorResult("", "", "", "1",
                        "34","24", "×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }
}
