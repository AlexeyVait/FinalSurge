package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class PaceCalculatorPage {

    public static final String CALORIC_NEEDS_BUTTON_1 = "//li//a[@href='#']//i[@class='icsw16-calculator']";
    public static final String PACE_CALCULATORS_BUTTON = "//a[@href='https://log.finalsurge.com/PaceCalc.cshtml?c=1&ssl=1']";
    public static final String DISTANCE = "//input[@class='span3 inline']";
    public static final String DISTANCE_KM = "//select[@id='DistType'][@class='span3']//option[@value='km']";
    public static final String TIME_HH = "//input[@id='TimeHH']";
    public static final String TIME_MM = "//input[@id='TimeMM']";
    public static final String TIME_SS = "//input[@id='TimeSS']";
    public static final String CALCULATOR_PACES_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate Paces']";
    public static final String ERROR = "//div[@class='alert alert-error']";
    public static final String RESULT = "//i[@class='splashy-help pop-over'][@data-content='These are common splits based off the pace calculated above.']";

    public PaceCalculatorPage openOtherCalculators() {
        log.info("Get page if opened");
        $x(CALORIC_NEEDS_BUTTON_1).click();
        switchTo().frame("OtherCalciFrame");
        return this;
    }

    public PaceCalculatorPage openChapterPace() {
        log.info("Get page if opened");
        $x(PACE_CALCULATORS_BUTTON).doubleClick();
        return this;
    }

    public PaceCalculatorPage indicateInRunDistance(String Dist) {
        log.info("Get page if opened");
        $x(DISTANCE).sendKeys(Dist);
        $x(DISTANCE_KM).click();
        return this;
    }

    public PaceCalculatorPage indicateTime(String hh, String min, String sek) {
        log.info("Get page if opened");
        $x(TIME_HH).sendKeys(hh);
        $x(TIME_MM).sendKeys(min);
        $x(TIME_SS).sendKeys(sek);
        return this;
    }

    public PaceCalculatorPage paceSaveButton() {
        log.info("Get page if opened");
        $x(CALCULATOR_PACES_BUTTON).submit();
        return this;
    }

    public boolean locatorForOutput() {
        log.info("Get page if opened");
        $x(RESULT);
        return true;
    }

    public PaceCalculatorPage testShouldBeOutputResults () {
        log.info("Get page if opened");
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        log.info("Get page if opened");
        return $x(ERROR).getText();
    }

    public PaceCalculatorPage validateErrorText (String errorText) {
        log.info("Get page if opened");
        Assert.assertEquals(getErrorText(), errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter an Integer value for Minutes.");
        switchTo().defaultContent();
        return this;
    }
}
