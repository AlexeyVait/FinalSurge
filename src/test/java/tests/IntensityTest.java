package tests;

import org.testng.annotations.Test;

public class IntensityTest extends BaseTest {

    @Test
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

    @Test
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .select()
                .eventTime("1", "44", "30")
                .intensitySaveButton()
                .validateErrorText("Please fix the following errors:");
    }
}
