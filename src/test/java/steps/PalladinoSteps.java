package steps;

import io.qameta.allure.Step;
import pages.PalladinoPage;

public class PalladinoSteps {

    PalladinoPage palladinoPage;

    public PalladinoSteps() {
        this.palladinoPage = new PalladinoPage();
    }

    @Step("Result Calculate Interval Power Targets")
    public PalladinoSteps  intervalPowerTargetCalculator(String c, String rw) {
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .criticalPower(c)
                .reserveWorkCapacity(rw)
                .pacesSaveButton()
                .testShouldBeOutputResultsPaceCalculator();
        return this;
    }

    @Step("Result Enter Data Here Long Short Test")
    public PalladinoSteps  cpAndRwcFromACpTest(String short_min, String short_sek,
                                               String short_sh, String long_min,
                                               String long_sek, String long_sh) {
        palladinoPage
                .shortTest(short_min, short_sek)
                .shortTestAvgPower(short_sh)
                .longTest(long_min, long_sek)
                .longTestAvgPower(long_sh)
                .resultsSaveButtonOne()
                .testShouldBeOutputEstimateResultsFirst();
        return this;
    }

    @Step("Result Enter Data Here Race Time Less Than Or Equal To Forty Minute")
    public PalladinoSteps  cpFromRaceOrTTLessThanOrEqualToFortyMinutes(String hh, String min,
                                                                       String sek, String avg) {
        palladinoPage
                .raceTimeOne(hh, min, sek)
                .raceAvgPowerOne(avg)
                .resultsSaveButtonTwo()
                .testShouldBeOutputEstimateResultsSecond();
        return this;
    }

    @Step("Result Enter Data Here Race Time Greater Than Or Equal To Forty Minute")
    public PalladinoSteps  cpFromRaceOrTTGreaterThanOrEqualToFortyMinutes(String min, String sek,
                                                                          String avg) {
        palladinoPage
                .raceTimeTwo(min, sek)
                .raceAvgPowerTwo(avg)
                .resultsSaveButtonFree()
                .testShouldBeOutputEstimateResultsThird();
        return this;
    }

    @Step("Error Calculate Interval Power Targets")
    public PalladinoSteps  errorIntervalPowerTargetCalculator(String c, String rw,
                                                              String getError) {
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .criticalPower(c)
                .reserveWorkCapacity(rw)
                .pacesSaveButton()
                .validateErrorTextPaceCalculator(getError);
        return this;
    }

    @Step("Error Enter Data Here Long Short Test")
    public PalladinoSteps  errorCpAndRwcFromACpTest(String short_min, String short_sek,
                                                    String short_sh, String long_min,
                                                    String long_sek, String long_sh,
                                                    String getError) {
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .shortTest(short_min, short_sek)
                .shortTestAvgPower(short_sh)
                .longTest(long_min, long_sek)
                .longTestAvgPower(long_sh)
                .resultsSaveButtonOne()
                .validateErrorTextFirst(getError);
        return this;
    }

    @Step("Error Enter Data Here Race Time Less Than Or Equal To Forty Minute")
    public PalladinoSteps  errorCpFromRaceOrTTLessThanOrEqualToFortyMinutes(String hh,
                                                                            String min,
                                                                            String sek,
                                                                            String avg,
                                                                            String getError) {
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .raceTimeOne(hh, min, sek)
                .raceAvgPowerOne(avg)
                .resultsSaveButtonTwo()
                .validateErrorTextSecond(getError);
        return this;
    }

    @Step("Error Enter Data Here Race Time Greater Than Or Equal To Forty Minute")
    public PalladinoSteps  errorCpFromRaceOrTTGreaterThanOrEqualToFortyMinutes(String min,
                                                                               String sek,
                                                                               String avg,
                                                                               String getError) {
        palladinoPage
                .openWorkoutCalculators()
                .openChapterPalladino()
                .raceTimeTwo(min, sek)
                .raceAvgPowerTwo(avg)
                .resultsSaveButtonFree()
                .validateErrorTextThird(getError);
        return this;
    }


}
