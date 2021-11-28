package tests;

import org.testng.annotations.Test;

public class CaloricNeedsTest extends BaseTest {

    @Test
    public void shouldBeToCalculateTheCaloriesOfAMan() {
        loginPage
                .open()
                .login(user, password);
        caloricNeedsPage
                .openOtherCalculators()
                .indicateWeightInKilograms("86")
                .indicateLengthInCentimeters("178")
                .indicateAge("25")
                .genderSelection()
                .indicateInRunDistance("10")
                .caloricSaveButton()
                .testShouldBeOutputResults();
    }

    @Test
    public void errorEnteringValues() {
        loginPage
                .open()
                .login(user, password);
        caloricNeedsPage
                .openOtherCalculators()
                .indicateWeightInKilograms("86")
                .indicateLengthInCentimeters("178")
                .indicateAge("")
                .genderSelection()
                .indicateInRunDistance("10")
                .caloricSaveButton()
                .validateErrorText("Please fix the following errors:");
    }
}
