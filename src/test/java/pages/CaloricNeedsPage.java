package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class CaloricNeedsPage {

    public static final String CALORIC_NEEDS_BUTTON = "//a[@href='#'][@data-reveal-id='OtherCalc']";
    public static final String WEIGHT = "//input[@name='Weight'][@class='span2 inline']";
    public static final String KG = "//input[@name='WeightType'][@value='k']";
    public static final String HEIGHT  = "//input[@id='HeightInchCent']";
    public static final String CENTIMETERS = "//input[@name='HeightType'][@value='m']";
    public static final String AGE = "//input[@id='Age']";
    public static final String MALE = "//input[@id='optionsRadios5']";
    public static final String TODAY_RUN_DISTANCE = "//input[@id='RunDist']";
    public static final String KILOMETERS = "//input[@id='optionsRadios8']";
    public static final String CALCULATING_SAVE_BUTTON = "//input[@id='saveButtonSettings']/../..//input";
    public static final String DATA_RESULT = "//div[@class='w-box w-box-green']";
    public static final String ERROR  = "//div[@class='alert alert-error']";


    public CaloricNeedsPage openOtherCalculators() {

        $x(CALORIC_NEEDS_BUTTON).click();
        log.info("Open other calculators");
        switchTo().frame("OtherCalciFrame");
        return this;
    }

    public CaloricNeedsPage enterTheDataOnWeightAndClickInButton(String kg) {
        log.info("Enter the data on weight and click in button");
        $x(WEIGHT).sendKeys(kg);
        $x(KG).click();
        return this;
    }

    public CaloricNeedsPage enterTheDataOnLengthAndClickInButton(String cm) {
        log.info("Enter the data on length and click in button");
        $x(HEIGHT).sendKeys(cm);
        $x(CENTIMETERS).click();
        return this;
    }

    public CaloricNeedsPage enterTheDataInInputAge(String age) {
        log.info("Enter the data in age");
        $x(AGE).sendKeys(age);
        return this;
    }

    public CaloricNeedsPage genderSelection() {
        log.info("Gender selection");
        $x(MALE).click();
        return this;
    }

    public CaloricNeedsPage enterDataInRunDistance(String dist) {
        log.info("Enter data in run distance");
        $x(TODAY_RUN_DISTANCE).sendKeys(dist);
        $x(KILOMETERS).click();
        return this;
    }

    public CaloricNeedsPage caloricSaveButton () {
        log.info("Caloric save button");
        $x(CALCULATING_SAVE_BUTTON).click();
        return this;
    }

    public boolean locatorForOutput() {
        log.info("Locator for output");
        $x(DATA_RESULT);
        return true;
    }

    public String getErrorText () {
        log.info("Get error text");
        return  $x(ERROR).getText();
    }

    public CaloricNeedsPage outputOfTheRequiredResult () {
        log.info("Output of the required result");
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public CaloricNeedsPage validateErrorText (String errorText) {
        log.info("Validate error text");
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Please enter an Integer value for Age.");
        switchTo().defaultContent();
        return this;
    }
}
