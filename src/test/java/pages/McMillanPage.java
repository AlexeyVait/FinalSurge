package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

@Log4j2
public class McMillanPage {

    public static final String WORKOUT_CALCULATORS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-stop-watch']";
    public static final String MC_MILLAN = "//a[@href='https://log.finalsurge.com/McMillanCalc.cshtml?c=1&ssl=1']";
    public static final String KM_10_MC_MILLAN = "//select[@id='distance']//option[@value='10km']";
    public static final String HH_MC_MILLAN = "//input[@id='TimeHH']";
    public static final String MM_MC_MILLAN = "//input[@id='TimeMM']";
    public static final String SS_MC_MILLAN = "//input[@id='TimeSS']";
    public static final String SGD_KM_15_MC_MILLAN = "//select[@name='goaldistance']//option[@value='15km']";
    public static final String SGD_HH_MC_MILLAN = "//input[@id='GTimeHH']";
    public static final String SGD_MM_MC_MILLAN = "//input[@id='GTimeMM']";
    public static final String SGD_SS_MC_MILLAN = "//input[@id='GTimeSS']";
    public static final String CALCULATE_MY_PACES_MC_MILLAN_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate My Paces']";
    public static final String RESULT = "//a[@id='btnShowEndurance']";
    public static final String ERROR = "//div[@class='alert alert-error']";

    public McMillanPage openWorkoutCalculators() {
        log.info("Open Workout Calculators");
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public McMillanPage openChapterMcMillan() {
        log.info("Open chapter McMillan");
        $x(MC_MILLAN).click();
        return this;
    }

    public McMillanPage clickInDistance() {
        log.info("Click in distance");
        $x(KM_10_MC_MILLAN).click();
        return this;
    }

    public McMillanPage interDataInEstimatedTime(String hh_time, String mm_time, String ss_time) {
        log.info("Inter data in estimated time");
        $x(HH_MC_MILLAN).sendKeys(hh_time);
        $x(MM_MC_MILLAN).sendKeys(mm_time);
        $x(SS_MC_MILLAN).sendKeys(ss_time);
        return this;
    }

    public McMillanPage enterInRunDistanceOptional() {
        log.info("Enter in run distance optional");
        $x(SGD_KM_15_MC_MILLAN).click();
        return this;
    }

    public McMillanPage enterDataInTimeOptional(String hh_optional, String mm_optional,
                                             String ss_optional) {
        log.info("Enter data in timeO optional");
        $x(SGD_HH_MC_MILLAN).sendKeys(hh_optional);
        $x(SGD_MM_MC_MILLAN).sendKeys(mm_optional);
        $x(SGD_SS_MC_MILLAN).sendKeys(ss_optional);
        return this;
    }

    public McMillanPage mcMillanSaveButton() {
        log.info("Mc Millan save button");
        $x(CALCULATE_MY_PACES_MC_MILLAN_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        log.info("Locator for output");
        $x(RESULT);
        return true;
    }

    public McMillanPage buttonOnOutputResults () {
        log.info("Get page if opened");
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        log.info("Get error text");
        return  $x(ERROR).getText();
    }

    public McMillanPage validateErrorText (String errorText) {
        log.info("Validate error text");
        Assert.assertEquals(getErrorText(),errorText, "Please fix the following errors:");
        switchTo().defaultContent();
        return this;
    }
}
