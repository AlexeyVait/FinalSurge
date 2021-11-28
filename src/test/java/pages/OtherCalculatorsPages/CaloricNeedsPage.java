package pages.OtherCalculatorsPages;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class CaloricNeedsPage {

    //Caloric needs
    public static final String CALORIC_NEEDS_BUTTON_2 = "//a[@href='#'][@data-reveal-id='OtherCalc']";
    public static final String WEIGHT = "//input[@name='Weight'][@class='span2 inline']";
    //public static final String LBS = "//input[@value='l']";
    public static final String KG = "//input[@name='WeightType'][@value='k']";
    public static final String ROST = "//input[@id='HeightInchCent']";
    //public static final String INCHES = "//input[@value='i']";
    public static final String CENTIMETERS = "//input[@name='HeightType'][@value='m']";
    public static final String AGE = "//input[@id='Age']";
    // Gender
    public static final String MALE = "//input[@id='optionsRadios5']";
    public static final String FEMALE = "//input[@id='optionsRadios6']";
    public static final String TODAY_RUN_DISTANCE = "//input[@id='RunDist']";
    //public static final String MILES = "//input[@id='optionsRadios7']";
    public static final String KILOMETERS = "//input[@id='optionsRadios8']";
    public static final String CALCULATING_THE_REQUIRED_CALORIES_BUTTON = "//input[@id='saveButtonSettings']/../..//input";
    public static final String DATA_RESULT= "//div[@class='w-box w-box-green']";
    public static final String ERROR  = "//div[@class='alert alert-error']";

    public CaloricNeedsPage openOtherCalculators() {
        $x(CALORIC_NEEDS_BUTTON_2).click();
        switchTo().frame("OtherCalciFrame");
        //switchTo().defaultContent();
        return this;
    }

    public CaloricNeedsPage indicateWeightInKilograms(String kg) {
        $x(WEIGHT).sendKeys(kg);
        $x(KG).click();
        return this;
    }

    public CaloricNeedsPage indicateLengthInCentimeters(String cm) {
        $x(ROST).sendKeys(cm);
        $x(CENTIMETERS).click();
        return this;
    }

    public CaloricNeedsPage indicateAge(String age) {
        $x(AGE).sendKeys(age);
        return this;
    }

    public CaloricNeedsPage genderSelection() {
        $x(MALE).click();
        return this;
    }

    public CaloricNeedsPage indicateInRunDistance(String dist) {
        $x(TODAY_RUN_DISTANCE).sendKeys(dist);
        $x(KILOMETERS).click();
        return this;
    }

    public CaloricNeedsPage caloricSaveButton () {
        $x(CALCULATING_THE_REQUIRED_CALORIES_BUTTON).click();
        //switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        $x(DATA_RESULT);
        return true;
    }

    public String getErrorText () {
        return  $x(ERROR).getText();
    }

    public CaloricNeedsPage testShouldBeOutputResults () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public CaloricNeedsPage validateErrorText (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "Please fix the following errors:");
        switchTo().defaultContent();
        return this;
    }
}
