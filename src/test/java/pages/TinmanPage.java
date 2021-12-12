package pages;


import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static pages.PalladinoPage.WORKOUT_CALCULATORS_BUTTON;

@Log4j2
public class TinmanPage {

    public static final String TINMAN_BUTTON = "//a[@href='https://log.finalsurge.com/TinmanCalc.cshtml?c=1&ssl=1']";
    public static final String KM_20_TINMAN = "//select[@name='distance']//option[@value='']";
    public static final String HH_TINMAN = "//input[@id='TimeHH']";//??????
    public static final String MM_TINMAN = "//input[@id='TimeMM']";//??????
    public static final String SS_TINMAN = "//input[@id='TimeSS'][@maxlength='5']";
    public static final String MALE_TINMAN = "//input[@id='Male']";
    public static final String CALCULATE_PACES_TINMAN_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate Paces']";
    public static final String RESULT = "//table[@class='table table-condensed table-hover table-striped']";
    public static final String ERROR_OF_SITE = "//a[@data-dismiss='alert']";

    public TinmanPage openWorkoutCalculators() {
        log.info("Open workout calculators");
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public TinmanPage openChapterTinman() {
        log.info("Open chapter Tinman");
        $x(TINMAN_BUTTON).click();
        return this;
    }

    public TinmanPage clickInDistanceButton() {
        log.info("Click in distance button");
        $x(KM_20_TINMAN).click();
        return this;
    }

    public TinmanPage enterTheDataInDistance(String hh, String mi, String sek) {
        log.info("Enter the data in distance");
        $x(HH_TINMAN).sendKeys(hh);
        $x(MM_TINMAN).sendKeys(mi);
        $x(SS_TINMAN).sendKeys(sek);
        return this;
    }

    public TinmanPage genderSelection() {
        log.info("Gender selection");
        $x(MALE_TINMAN).click();
        return this;
    }

    public TinmanPage tinmanSaveButton() {
        log.info("Tinman save button");
        $x(CALCULATE_PACES_TINMAN_BUTTON). click();
        switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        log.info("Locator for output");
        $x(RESULT);
        return true;
    }

    public TinmanPage outputOfTheRequiredResult () {
        log.info("Output of the required result");
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        log.info("Get error text");
        return  $x(ERROR_OF_SITE).getText();
    }

    public TinmanPage validateErrorText (String errorText) {
        log.info("Validate error text");
        Assert.assertEquals(getErrorText(),errorText, "Please fix the following errors:");
        switchTo().defaultContent();
        return this;
    }

}
