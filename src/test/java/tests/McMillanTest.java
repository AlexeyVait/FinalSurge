package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class McMillanTest extends BaseTest {

    @Test(description = "Result for McMillan test")
    @Description()
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

    @Test(enabled = false, description = "Error entering values for McMillan test")
    @Description()
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        mcmillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .indicateInEstimatedRunDistance()
                .indicateEstimatedTime("", "", "")
                .indicateInRunDistanceOptional()
                .indicateTimeOptional("2", "13", "55")
                .mcMillanSaveButton()
                .validateErrorText("Please fix the following errors:");
    }
}
