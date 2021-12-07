package tests;

import org.testng.annotations.Test;

public class IntensityTest extends BaseTest {

    @Test(description = "Result for Intensity test")
    public void shouldBeToCalculateTheIntensity() {
        loginPage
                .open()
                .login(user, password);
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .select()
                .eventTime("1", "44", "30")
                .intensitySaveButton()
                .testShouldBeOutputResults();
    }

    @Test(description = "Error entering values for Intensity test")
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .select()
                .eventTime("1", "", "30")
                .intensitySaveButton()
                .validateErrorText("×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }
}
