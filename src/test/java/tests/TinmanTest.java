package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TinmanTest extends BaseTest{

    @Test(description = "Result for Tinman test")
    @Description()
    public void shouldBeToCalculateTheTinman() {
        loginPage
                .open()
                .login(user, password);
        tinmanPage
                .openWorkoutCalculators()
                .openChapterTinman()
                .indicateInRunDistance()
                .indicateTime("2", "33", "45")
                .genderSelection()
                .tinmanSaveButton()
                .testShouldBeOutputResults();
    }

    @Test(enabled = false, description = "Error entering values for Tinman test")
    @Description()
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        tinmanPage
                .openWorkoutCalculators()
                .openChapterTinman()
                .indicateInRunDistance()
                .indicateTime("", "", "")
                .genderSelection()
                .tinmanSaveButton()
                .validateErrorText("×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }
}
