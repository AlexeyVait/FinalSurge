package tests;

import org.testng.annotations.Test;

public class McMillanTest extends BaseTest {

    @Test
    public void shouldBeToCalculateTheMcMillan() {
        loginPage
                .open()
                .login(user, password);
        mcmillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .indicateInEstimatedRunDistance()
                .indicateEstimatedTime("1", "27", "15")
                .indicateInRunDistanceOptional()
                .indicateTimeOptional("2", "13", "55")
                .mcMillanSaveButton()
                .testShouldBeOutputResults();
    }

    @Test
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        mcmillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .indicateInEstimatedRunDistance()
                .indicateEstimatedTime("1", "27", "15")
                .indicateInRunDistanceOptional()
                .indicateTimeOptional("2", "13", "55")
                .mcMillanSaveButton()
                .validateErrorText("Please fix the following errors:");
    }
}
