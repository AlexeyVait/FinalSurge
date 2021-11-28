package tests;

import org.testng.annotations.Test;

public class PaceCalculatorTest extends BaseTest {

    @Test
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

    @Test
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
                .validateErrorText("Please fix the following errors:");
    }
}
