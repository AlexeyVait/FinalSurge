package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

@Log4j2
public class HansonsPage {

    public static final String WORKOUT_CALCULATORS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-stop-watch']";
    public static final String HANSONS = "//a[@href='https://log.finalsurge.com/HansonsCalc.cshtml?c=1&ssl=1']";
    public static final String DISTANCE_HANSONS = "//input[@id='Distance'][@maxlength='6']";
    public static final String KM_HANSONS = "//select[@id='DistType'][@class='span2']//option[@value='km']";
    public static final String HH_HANSONS = "//input[@id='TimeHH'][@maxlength='1']";
    public static final String MM_HANSONS = "//input[@id='TimeMM'][@maxlength='2']";
    public static final String SS_HANSONS = "//input[@id='TimeSS'][@maxlength='2']";
    public static final String TEMPERATURE_HANSONS = "//input[@id='Temp'][@maxlength='3']";
    public static final String C_HANSONS = "//select[@id='TempType']//option[@value='C']";
    public static final String HUMIDITY_HANSONS = "//input[@id='Humid']";
    public static final String WIND_SPEED_HANSONS = "//input[@id='Wind']";
    public static final String KPH_HANSONS = "//select[@id='SpeedType']//option[@value='kph']";
    public static final String CALCULATE_PACES_HANSONS_BUTTON = "//div[@class='span6'][@style='width: 575px;']";
    public static final String ERROR_TIME_MILE = "//div[@class='alert alert-error']";
    public static final String RESULT = "//div[@class='alert alert-info']";

    public HansonsPage openWorkoutCalculators() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public HansonsPage openChapterHansons() {
        $x(HANSONS).click();
        return this;
    }

    public HansonsPage indicateInRunDistance(String dis) {
        $x(DISTANCE_HANSONS).sendKeys(dis);
        $x(KM_HANSONS).click();
        return this;
    }

    public HansonsPage indicateTime(String hh, String mm, String ss) {
        $x(HH_HANSONS).sendKeys(hh);
        $x(MM_HANSONS).sendKeys(mm);
        $x(SS_HANSONS).sendKeys(ss);
        return this;
    }

    public HansonsPage dataAdjustments (String temp, String humidity, String speed) {
        $x(TEMPERATURE_HANSONS).sendKeys(temp);
        $x(C_HANSONS).click();
        $x(HUMIDITY_HANSONS).sendKeys(humidity);
        $x(WIND_SPEED_HANSONS).sendKeys(speed);
        $x(KPH_HANSONS).click();
        return this;
    }

    public HansonsPage hansonSaveButton() {
        $x(CALCULATE_PACES_HANSONS_BUTTON).submit();
        return this;
    }

    public boolean locatorForOutput() {
        $x(RESULT);
        return true;
    }

    public HansonsPage testShouldBeOutputResults () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        return  $x(ERROR_TIME_MILE).getText();
    }

    public HansonsPage validateErrorText (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter an Integer value for Minutes.");
        switchTo().defaultContent();
        return this;
    }
}
