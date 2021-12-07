package tests;

import org.testng.annotations.Test;

public class PaceCalculatorTest extends BaseTest {

    @Test(description = "Result for Pace Calculator test")
    public void shouldBeToCalculateThePace() {
        loginPage
                .open()
                .login(user, password);
        pacecalculatoPage
                .openOtherCalculators()
                .openChapterPace()
                .indicateInRunDistance("12")
                .indicateTime("1", "15", "35")
                .paceSaveButton()
                .testShouldBeOutputResults();
    }

    @Test(description = "Error entering values for Pace Calculator test")
    public void errorEnteringValues () {
        loginPage
                .open()
                .login(user, password);
        pacecalculatoPage
                .openOtherCalculators()
                .openChapterPace()
                .indicateInRunDistance("12")
                .indicateTime("1", "", "35")
                .paceSaveButton()
                .validateErrorText("×\n" +
                        "Please fix the following errors:\n" +
                        "*Please enter an Integer value for Minutes.");
    }
}
