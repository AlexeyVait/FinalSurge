package pages;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class PalladinoPage {

    public static final String WORKOUT_CALCULATORS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-stop-watch']";
    public static final String PALLADINO = "//a[@href='https://log.finalsurge.com/PalladinoCalc.cshtml?c=1&ssl=1']";
    public static final String CRITICAL_POWER_PALLADINO = "//input[@id='CP']";
    public static final String RESERVE_WORK_CAPACITY_PALLADINO = "//input[@id='RWC']";
    public static final String CALCULATE_PACES_PALLADINO_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate Paces']";
    public static final String SHORT_TEST_MM_PALLADINO = "//input[@id='TimeMM'][@class='span3']";
    public static final String SHORT_TEST_SS_PALLADINO = "//input[@id='TimeSS'][@class='span3']";
    public static final String SHORT_TEST_PALLADINO = "//input[@id='AVPWS'][@class='span5']";
    public static final String LONG_TEST_MM_PALLADINO = "//input[@id='TimeMML'][@class='span3']";
    public static final String LONG_TEST_SS_PALLADINO = "//input[@id='TimeSSL'][@class='span3']";
    public static final String LONG_TEST_PALLADINO = "//input[@id='AVPWL'][@class='span5']";
    public static final String SHORT_LONG_ESTIMATE_RESULTS_PALLADINO_BUTTON = "//input[@id='saveButtonSettings2'][@value='Estimate Results']";
    public static final String RACE_TIME_HH_PALLADINO = "//input[@id='TimeHHR']";
    public static final String RACE_TIME_MM_PALLADINO = "//input[@id='TimeMMR']";
    public static final String RACE_TIME_SS_PALLADINO = "//input[@id='TimeSSR']";
    public static final String RACE_AVG_POWER_PALLADINO = "//input[@id='RAP']";
    public static final String RACE_ESTIMATE_RESULTS_PALLADINO_BUTTON = "//input[@id='saveButtonSettings3']";
    public static final String RACE2_TIME_MM_PALLADINO = "//input[@id='TimeMMRR']";
    public static final String RACE2_TIME_SS_PALLADINO = "//input[@id='TimeSSRR']";
    public static final String RACE2_AVG_POWER_PALLADINO = "//input[@id='RAPR']";
    public static final String RACE2_ESTIMATE_RESULTS_PALLADINO_BUTTON = "//input[@id='saveButtonSettings4']";
    //Critical Power (CP): min=100, max=500;  Reserve Work Capacity (RWC): min=1, max=30;
    //Short Test (Avg. Power) and Long Test (Avg. Power): min=20, max=800 (time 01-09 sek. ERROR)
    //Race Avg Power (W): min=20, max=800;
    //Race Avg Power (W): min=20, max=800;
    public static final String ERROR = "//div[@class='alert alert-error']"; //Value was either too large or too small for a Decimal (1-9)
    public static final String RESULT_PACE_CALCULATOR = "//table[@class='table table-condensed table-hover table-striped']";

    public PalladinoPage openWorkoutCalculators() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public PalladinoPage openChapterPalladino() {
        $x(PALLADINO).click();
        return this;
    }

    public PalladinoPage criticalPower(String c) {
        $x(CRITICAL_POWER_PALLADINO).sendKeys(c);
        return this;
    }

    public  PalladinoPage reserveWorkCapacity(String rw) {
        $x(RESERVE_WORK_CAPACITY_PALLADINO).sendKeys(rw);
        return this;
    }

    public PalladinoPage pacesSaveButton() {
        $x(CALCULATE_PACES_PALLADINO_BUTTON).click();
       // switchTo().defaultContent();
        return this;
    }

    public PalladinoPage shortTest(String mi, String sek) {
        $x(SHORT_TEST_MM_PALLADINO).sendKeys(mi);
        $x(SHORT_TEST_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage shortTestAvgPower(String sh) {
        $x(SHORT_TEST_PALLADINO).sendKeys(sh);
        return this;
    }

    public PalladinoPage longTest(String mi, String sek) {
        $x(LONG_TEST_MM_PALLADINO).sendKeys(mi);
        $x(LONG_TEST_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage longTestAvgPower(String sh) {
        $x(LONG_TEST_PALLADINO).sendKeys(sh);
        return this;
    }

    public PalladinoPage resultsSaveButtonOne() {
        $x(SHORT_LONG_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage raceTimeOne(String hh, String mi, String sek) {
        $x(RACE_TIME_HH_PALLADINO).sendKeys(hh);
        $x(RACE_TIME_MM_PALLADINO).sendKeys(mi);
        $x(RACE_TIME_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage raceAvgPowerOne(String av) {
        $x(RACE_AVG_POWER_PALLADINO).sendKeys(av);
        return this;
    }

    public PalladinoPage resultsSaveButtonTwo() {
        $x(RACE_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage raceTimeTwo(String mi, String sek) {
        $x(RACE2_TIME_MM_PALLADINO).sendKeys(mi);
        $x(RACE2_TIME_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage raceAvgPowerTwo(String avg) {
        $x(RACE2_AVG_POWER_PALLADINO).sendKeys(avg);
        return this;
    }

    public PalladinoPage resultsSaveButtonFree() {
        $x(RACE2_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        $x(RESULT_PACE_CALCULATOR);
        return true;
    }

    public PalladinoPage testShouldBeOutputResultsPaceCalculator () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }


    public PalladinoPage testShouldBeOutputEstimateResultsFirst () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }


    public PalladinoPage testShouldBeOutputEstimateResultsSecond () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public PalladinoPage testShouldBeOutputEstimateResultsThird () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        return  $x(ERROR).getText();
    }

    public PalladinoPage validateErrorTextPaceCalculator (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Critical Power.");
        return this;
    }


    public PalladinoPage validateErrorTextFirst (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Average Power (Short).");
        return this;
    }


    public PalladinoPage validateErrorTextSecond (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Race Avg Power (W).");
        return this;
    }


    public PalladinoPage validateErrorTextThird (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "Please fix the following errors:");
        switchTo().defaultContent();
        return this;
    }
}
