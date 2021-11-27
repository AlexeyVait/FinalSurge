package pages.WorkoutCalculatorsPages;

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

    public PalladinoPage openCalcul() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public PalladinoPage openPalladino() {
        $x(PALLADINO).click();
        return this;
    }

    public PalladinoPage CP(String c) {
        $x(CRITICAL_POWER_PALLADINO).sendKeys(c);
        return this;
    }

    public  PalladinoPage RWC(String rw) {
        $x(RESERVE_WORK_CAPACITY_PALLADINO).sendKeys(rw);
        return this;
    }

    public PalladinoPage button() {
        $x(CALCULATE_PACES_PALLADINO_BUTTON).click();
       // switchTo().defaultContent();
        return this;
    }

    public PalladinoPage shortTest(String mi, String sek, String sh) {
        $x(SHORT_TEST_MM_PALLADINO).sendKeys(mi);
        $x(SHORT_TEST_SS_PALLADINO).sendKeys(sek);
        $x(SHORT_TEST_PALLADINO).sendKeys(sh);
        return this;
    }

    public PalladinoPage longTest(String mi, String sek, String sh) {
        $x(LONG_TEST_MM_PALLADINO).sendKeys(mi);
        $x(LONG_TEST_SS_PALLADINO).sendKeys(sek);
        $x(LONG_TEST_PALLADINO).sendKeys(sh);
        return this;
    }

    public PalladinoPage button2() {
        $x(SHORT_LONG_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage raceTest(String hh, String mi, String sek) {
        $x(RACE_TIME_HH_PALLADINO).sendKeys(hh);
        $x(RACE_TIME_MM_PALLADINO).sendKeys(mi);
        $x(RACE_TIME_SS_PALLADINO).sendKeys(sek);
        return this;
    }

    public PalladinoPage raceAvgTest(String av) {
        $x(RACE_AVG_POWER_PALLADINO).sendKeys(av);
        return this;
    }

    public PalladinoPage button3() {
        $x(RACE_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        return this;
    }

    public PalladinoPage race2Test(String mi, String sek, String avg) {
        $x(RACE2_TIME_MM_PALLADINO).sendKeys(mi);
        $x(RACE2_TIME_SS_PALLADINO).sendKeys(sek);
        $x(RACE2_AVG_POWER_PALLADINO).sendKeys(avg);
        return this;
    }

    public PalladinoPage button4() {
        $x(RACE2_ESTIMATE_RESULTS_PALLADINO_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }
}
