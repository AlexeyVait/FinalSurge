package tests;

import org.testng.annotations.Test;

public class HansonsTest extends BaseTest {

    @Test(description = "Result for Hansons test")
    public void shouldBeToCalculateTheHansons() {
        loginPage
                .open()
                .login(user, password);
        hansonsPage
                .openWorkoutCalculators()
                .openChapterHansons()
                .indicateInRunDistance("10")
                .indicateTime("1", "22", "54")
                .dataAdjustments("38", "40", "18")
                .hansonSaveButton()
                .testShouldBeOutputResults();
    }

    @Test(description = "Error entering values for Hansons test")
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        hansonsPage
                .openWorkoutCalculators()
                .openChapterHansons()
                .indicateInRunDistance("10")
                .indicateTime("1", "", "54")
                .dataAdjustments("38", "40", "18")
                .hansonSaveButton()
                .validateErrorText("Please fix the following errors:");
    }
}
