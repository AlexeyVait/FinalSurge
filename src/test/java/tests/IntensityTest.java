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
}
