package tests;

import org.testng.annotations.Test;


public class PalladinoTest extends BaseTest {

    @Test (description = "Result for Palladino test")
    public void shouldBeToCalculateThePalladino() {
        loginPage
                .open()
                .login(user, password);
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .criticalPower("115")
                .reserveWorkCapacity("20")
                .pacesSaveButton()
                .shortTest("5", "22")
                .shortTestAvgPower("55")
                .longTest("7", "33")
                .longTestAvgPower("44")
                .resultsSaveButtonOne()
                .raceTimeOne("2", "24", "39")
                .raceAvgPowerOne("42")
                .resultsSaveButtonTwo()
                .raceTimeTwo("8", "30")
                .raceAvgPowerTwo("47")
                .resultsSaveButtonFree()
                .testShouldBeOutputResultsPaceCalculator()
                .testShouldBeOutputEstimateResultsFirst()
                .testShouldBeOutputEstimateResultsSecond()
                .testShouldBeOutputEstimateResultsThird();
    }

    @Test(description = "Error entering values for Palladino test")
    public void errorEnteringValuesPaceCalculator() {
        loginPage
                .open()
                .login(user, password);
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .criticalPower("")
                .reserveWorkCapacity("20")
                .pacesSaveButton()
                .validateErrorTextPaceCalculator("Please fix the following errors:");
    }

    @Test(description = "Error entering values for Palladino in first test")
    public void errorEnteringValuesResultFirst() {
        loginPage
                .open()
                .login(user, password);
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .shortTest("5", "22")
                .shortTestAvgPower("")
                .longTest("7", "33")
                .longTestAvgPower("44")
                .resultsSaveButtonOne()
                .validateErrorTextFirst("Please fix the following errors:");
    }

    @Test(description = "Error entering values for Palladino in second test")
    public void errorEnteringValuesResultSecond() {
        loginPage
                .open()
                .login(user, password);
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .raceTimeOne("2", "24", "39")
                .raceAvgPowerOne("")
                .resultsSaveButtonTwo()
                .validateErrorTextSecond("Please fix the following errors:");
    }

    @Test(enabled = false, description = "Error entering values for Palladino in third test")
    public void errorEnteringValuesResultThird() {
        loginPage
                .open()
                .login(user, password);
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .raceTimeTwo("12", "43")
                .raceAvgPowerTwo("")
                .resultsSaveButtonFree()
                .validateErrorTextThird("Please fix the following errors:");
    }
}
