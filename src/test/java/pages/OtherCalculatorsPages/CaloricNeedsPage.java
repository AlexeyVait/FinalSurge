package pages.OtherCalculatorsPages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CaloricNeedsPage {

    public static final String OOO = "//a[@href=\"https://log.finalsurge.com/CaloricNeedsCalc.cshtml?c=1&ssl=1\"][@class='btn btn-small']";

    //Caloric needs
    public static final String CALORIC_NEEDS_BUTTON = "//a[@href='#'][@data-reveal-id='OtherCalc']";
    public static final String WEIGHT = "//input[@name='Weight'][@class='span2 inline']";
    public static final String LBS = "//input[@value='l']";
    public static final String KG = "//input[@name='WeightType'][@value='k']";
    public static final String ROST = "//input[@id='HeightInchCent']";
    public static final String INCHES = "//input[@value='i']";
    public static final String CENTIMETERS = "//input[@name='HeightType'][@value='m']";
    public static final String AGE = "//input[@id='Age']";
    // POL
    public static final String MALE = "//input[@id='optionsRadios5']";
    public static final String FEMALE = "//input[@id='optionsRadios6']";
    public static final String TODAY_RUN_DISTANCE = "//input[@id='RunDist']";
    public static final String MILES = "//input[@id='optionsRadios7']";
    public static final String KILOMETERS = "//input[@id='optionsRadios8']";
    public static final String CALCULATING_THE_REQUIRED_CALORIES_BUTTON = "//input[@id='saveButtonSettings']/../..//input";

    public CaloricNeedsPage openCalculators() {
        $x(CALORIC_NEEDS_BUTTON).click();
        return this;
    }

    public CaloricNeedsPage indicateЕheWeightInKg(String kg) {
        $x(WEIGHT).sendKeys(kg);
        return this;
    }

    public CaloricNeedsPage indicateРeightInСentimeters(String cm) {
        $x(ROST).sendKeys(cm);
        $(CENTIMETERS).click();
        return this;
    }


    public CaloricNeedsPage indicateInAgeMan(String age) {
        $x(AGE).sendKeys(age);
        $(MALE).click();
        return this;
    }

    public CaloricNeedsPage indicateInRunDistance(String dist) {
        $x(TODAY_RUN_DISTANCE).sendKeys(dist);
        $(KILOMETERS).click();
        return this;
    }

    public CaloricNeedsPage CaloricButton () {
        $x(CALCULATING_THE_REQUIRED_CALORIES_BUTTON).click();
        return this;
    }
}
