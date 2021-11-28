package pages.WorkoutCalculatorsPages;


import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static pages.WorkoutCalculatorsPages.PalladinoPage.WORKOUT_CALCULATORS_BUTTON;

public class TinmanPage {

    public static final String TINMAN_BUTTON = "//a[@href='https://log.finalsurge.com/TinmanCalc.cshtml?c=1&ssl=1']";
    public static final String SELECT_TINAMN = "//select[@name='distance']";
    public static final String KM_10_TINMAN_ = "//select[@name='distance']//option[@value='10']";
    public static final String HALF_MARATHON_TINMAN = "//select[@name='distance']//option[@value='21.0974537664']";
    public static final String MARATHON_TINMAN = "//select[@name='distance']//option[@value='42.1949075328']";
    public static final String METERS_400_TINMAN = "//select[@name='distance']//option[@value='0.4']";
    public static final String METERS_600_TINMAN = "//select[@name='distance']//option[@value='0.6']";
    public static final String METERS_800_TINMAN = "//select[@name='distance']//option[@value='0.8']";
    public static final String METERS_1100_TINMAN = "//select[@name='distance']//option[@value='1']";
    public static final String METERS_1200_TINMAN = "//select[@name='distance']//option[@value='1.2']";
    public static final String METERS_1500_TINMAN = "//select[@name='distance']//option[@value='1.5']";
    public static final String METERS_2000_TINMAN = "//select[@name='distance']//option[@value='2']";
    public static final String METERS_2400_TINMAN = "//select[@name='distance']//option[@value='2.4']";
    public static final String METERS_3000_TINMAN = "//select[@name='distance']//option[@value='3']";
    public static final String METERS_3200_TINMAN = "//select[@name='distance']//option[@value='3.2']";
    public static final String KM_4_TINMAN = "//select[@name='distance']//option[@value='4']";
    public static final String KM_6_TINMAN = "//select[@name='distance']//option[@value='6']";
    public static final String KM_8_TINMAN = "//select[@name='distance']//option[@value='8']";
    public static final String KM_10_TINMAN = "//select[@name='distance']//option[@value='10']";
    public static final String KM_15_TINMAN = "//select[@name='distance']//option[@value='15']";
    public static final String KM_20_TINMAN = "//select[@name='distance']//option[@value='20']";
    public static final String KM_30_TINMAN = "//select[@name='distance']//option[@value='30']";
    public static final String KM_50_TINMAN = "//select[@name='distance']//option[@value='50']";
    public static final String YARDS_440_TINMAN = "//select[@name='distance']//option[@value='0.402336']";
    public static final String YARDS_880_TINMAN = "//select[@name='distance']//option[@value='0.804672']";
    public static final String MILES_1_TINMAN = "//select[@name='distance']//option[@value='1.609344']";
    public static final String POLTOTA_MILES_TINMAN = "//select[@name='distance']//option[@value='2.414016']";
    public static final String MILES_2_TINMAN = "//select[@name='distance']//option[@value='3.218688']";
    public static final String MILES_3_TINMAN = "//select[@name='distance']//option[@value='4.828032']";
    public static final String MILES_4_TINMAN = "//select[@name='distance']//option[@value='6.437376']";
    public static final String MILES_5_TINMAN = "//select[@name='distance']//option[@value='8.04672']";
    public static final String MILES_6_TINMAN = "//select[@name='distance']//option[@value='9.656064']";
    public static final String MILES_10_TINMAN = "//select[@name='distance']//option[@value='16.09344']";
    public static final String MILES_20_TINMAN = "//select[@name='distance']//option[@value='32.18688']";
    public static final String MILES_30_TINMAN = "//select[@name='distance']//option[@value='48.28032']";
    public static final String MILES_50_TINMAN = "//select[@name='distance']//option[@value='80.4672']";
    public static final String MILES_100_TINMAN = "//select[@name='distance']//option[@value='160.9344']";
    public static final String HH_TINMAN = "//input[@id='TimeHH']";//??????
    public static final String MM_TINMAN = "//input[@id='TimeMM']";//??????
    public static final String SS_TINMAN = "//input[@id='TimeSS'][@maxlength='5']";
    public static final String MALE_TINMAN = "//input[@id='Male']";
    public static final String FEMALE_TINMAN = "//input[@id='Female']";
    public static final String CALCULATE_PACES_TINMAN_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate Paces']";
    public static final String RESULT = "//table[@class='table table-condensed table-hover table-striped']";
    public static final String ERROR_OF_SITE = "#IntensityCalciFrame";

    public TinmanPage openWorkoutCalculators() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public TinmanPage openChapterTinman() {
        $x(TINMAN_BUTTON).click();
        return this;
    }

    public TinmanPage indicateInRunDistance() {
        $x(KM_20_TINMAN).click();
        return this;
    }

    public TinmanPage indicateTime(String hh, String mi, String sek) {
        $x(HH_TINMAN).sendKeys(hh);
        $x(MM_TINMAN).sendKeys(mi);
        $x(SS_TINMAN).sendKeys(sek);
        return this;
    }

    public TinmanPage genderSelection() {
        $x(MALE_TINMAN).click();
        return this;
    }

    public TinmanPage tinmanSaveButton() {
        $x(CALCULATE_PACES_TINMAN_BUTTON). click();
        switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        $x(RESULT);
        return true;
    }

    public TinmanPage testShouldBeOutputResults () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        return  $x(ERROR_OF_SITE).getText();
    }

    public TinmanPage validateErrorText (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "Please fix the following errors:");
        switchTo().defaultContent();
        return this;
    }

}
