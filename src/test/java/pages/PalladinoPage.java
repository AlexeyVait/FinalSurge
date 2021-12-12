package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

@Log4j2
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
    public static final String ERROR = "//div[@class='alert alert-error']";
    public static final String RESULT_PACE_CALCULATOR = "//table[@class='table table-condensed table-hover table-striped']";

    public PalladinoPage openWorkoutCalculators() {
        log.info("Open workout calculators");
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public PalladinoPage openChapterPalladino() {
        log.info("Open chapter Palladino");
        $x(PALLADINO).click();
        return this;
    }

    public PalladinoPage enterDataInInputCriticalPower(String c) {
        log.info("Enter data in input critical power");
        $x(CRITICAL_POWER_PALLADINO).sendKeys(c);
        return this;
    }

    public  PalladinoPage reserveWorkCapacity(String rw) {
        log.info("Reserve work capacity");
        $x(RESERVE_WORK_CAPACITY_PALLADINO).sendKeys(rw);
        return this;
    }

    public PalladinoPage pacesSaveButton() {
        log.info("Pace save button");
        $x(CALCULATE_PACES_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage shortTest(String short_min, String short_sek) {
        log.info("Short test");
        $x(SHORT_TEST_MM_PALLADINO).sendKeys(short_min);
        $x(SHORT_TEST_SS_PALLADINO).sendKeys(short_sek);
        return this;
    }

    public PalladinoPage shortTestAvgPower(String short_sh) {
        log.info("Short test avg power");
        $x(SHORT_TEST_PALLADINO).sendKeys(short_sh);
        return this;
    }

    public PalladinoPage longTest(String long_min, String long_sek) {
        log.info("Long test");
        $x(LONG_TEST_MM_PALLADINO).sendKeys(long_min);
        $x(LONG_TEST_SS_PALLADINO).sendKeys(long_sek);
        return this;
    }

    public PalladinoPage longTestAvgPower(String long_sh) {
        log.info("Long test avg power");
        $x(LONG_TEST_PALLADINO).sendKeys(long_sh);
        return this;
    }

    public PalladinoPage resultsSaveButtonOne() {
        log.info("Results save buttonOn");
        $x(SHORT_LONG_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage raceTimeOne(String hh, String min, String sek) {
        log.info("Race time one");
        $x(RACE_TIME_HH_PALLADINO).sendKeys(hh);
        $x(RACE_TIME_MM_PALLADINO).sendKeys(min);
        $x(RACE_TIME_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage raceAvgPowerOne(String av) {
        log.info("Race avg power one");
        $x(RACE_AVG_POWER_PALLADINO).sendKeys(av);
        return this;
    }

    public PalladinoPage resultsSaveButtonTwo() {
        log.info("Results save buttonTwo");
        $x(RACE_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage raceTimeTwo(String min, String sek) {
        log.info("Race time two");
        $x(RACE2_TIME_MM_PALLADINO).sendKeys(min);
        $x(RACE2_TIME_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage raceAvgPowerTwo(String avg) {
        log.info("Race avg powerTwo");
        $x(RACE2_AVG_POWER_PALLADINO).sendKeys(avg);
        return this;
    }

    public PalladinoPage resultsSaveButtonFree() {
        log.info("resultsSaveButtonFree");
        $x(RACE2_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        log.info("Locator for output");
        $x(RESULT_PACE_CALCULATOR);
        return true;
    }

    public PalladinoPage outputOfTheRequiredResult () {
        log.info("Output of the required result");
        Assert.assertTrue(locatorForOutput());
        return this;
    }


    public PalladinoPage outputOfTheRequiredResultFirst () {
        log.info("Output of the first required result");
        Assert.assertTrue(locatorForOutput());
        return this;
    }


    public PalladinoPage outputOfTheRequiredResultSecond () {
        log.info("Output of the second required result");
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public PalladinoPage outputOfTheRequiredResultThird () {
        log.info("Output of the third required result");
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        log.info("Get error text");
        return  $x(ERROR).getText();
    }

    public PalladinoPage validateErrorTextPaceCalculator (String errorText) {
        log.info("Validate error text pace calculator");
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Critical Power.");
        return this;
    }


    public PalladinoPage validateErrorTextFirst (String errorText) {
        log.info("Validate error text first");
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Average Power (Short).");
        return this;
    }


    public PalladinoPage validateErrorTextSecond (String errorText) {
        log.info("Validate error text second");
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Race Avg Power (W).");
        return this;
    }


    public PalladinoPage validateErrorTextThird (String errorText) {
        log.info("Validate error text third");
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter a value for Race Avg Power (W).");
        switchTo().defaultContent();
        return this;
    }
}
