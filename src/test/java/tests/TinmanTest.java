package tests;

import org.testng.annotations.Test;

public class TinmanTest extends BaseTest{

    @Test
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

    @Test
    public void errorEnteringValues() {
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
                .validateErrorText("Please fix the following errors:");
    }
}
