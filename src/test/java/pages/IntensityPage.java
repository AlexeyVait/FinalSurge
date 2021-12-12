package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

@Log4j2
public class IntensityPage {

    public static final String WORKOUT_CALCULATORS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-stop-watch']";
    public static final String Intensity = "//button[@class='btn btn-small btn-inverse disabled']";
    public static final String KM_10_INTENSITY = "//input[@id='TENK']";
    public static final String HH_INTENSITY = "//input[@id='TimeHH']";
    public static final String MM_INTENSITY = "//input[@id='TimeMM']";
    public static final String SS_INTENSITY = "//input[@id='TimeSS']";
    public static final String CALCULATE_PACES_INTENSITY_BUTTON = "//input[@value='Calculate Paces']";
    public static final String ERROR_TIME_MILE = "//div[@class='alert alert-error']";
    public static final String RESULT = "//table[@class='table table-condensed table-hover']";

    public IntensityPage openWorkoutCalculators() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public IntensityPage openChapterIntensity() {
        $x(Intensity).click();
        return this;
    }

    public IntensityPage select() {
        $x(KM_10_INTENSITY).click();
        return this;
    }

    public IntensityPage eventTime(String hh, String mm, String ss) {
        $x(HH_INTENSITY).sendKeys(hh);
        $x(MM_INTENSITY).sendKeys(mm);
        $x(SS_INTENSITY).sendKeys(ss);
        return this;
    }

    public IntensityPage intensitySaveButton() {
        $x(CALCULATE_PACES_INTENSITY_BUTTON).click();
        return this;
    }

    public boolean locatorForOutput() {
        $x(RESULT);
        return true;
    }

    public IntensityPage testShouldBeOutputResults () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        return  $x(ERROR_TIME_MILE).getText();
    }

    public IntensityPage validateErrorText (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter an Integer value for Minutes.");
        switchTo().defaultContent();
        return this;
    }
}
