package tests;

import org.testng.annotations.Test;


public class PalladinoTest extends BaseTest {

    @Test
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

    @Test
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
                .validateErrorTextPaceCalculator("Please fix the following errors:");
    }

    @Test
    public void errorEnteringValuesResultFirst() {
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
                .shortTestAvgPower("")
                .longTest("7", "33")
                .longTestAvgPower("44")
                .resultsSaveButtonOne()
                .raceTimeOne("2", "24", "39")
                .raceAvgPowerOne("42")
                .resultsSaveButtonTwo()
                .raceTimeTwo("8", "30")
                .raceAvgPowerTwo("47")
                .resultsSaveButtonFree()
                .validateErrorTextFirst("Please fix the following errors:");
    }

    @Test
    public void errorEnteringValuesResultSecond() {
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
                .raceAvgPowerOne("")
                .resultsSaveButtonTwo()
                .raceTimeTwo("8", "30")
                .raceAvgPowerTwo("47")
                .resultsSaveButtonFree()
                .validateErrorTextSecond("Please fix the following errors:");
    }

    @Test
    public void errorEnteringValuesResultThird() {
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
                .raceTimeTwo("", "")
                .raceAvgPowerTwo("47")
                .resultsSaveButtonFree()
                .validateErrorTextThird("Please fix the following errors:");
    }
}
