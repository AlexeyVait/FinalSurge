package pages;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class McMillanPage {

    public static final String WORKOUT_CALCULATORS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-stop-watch']";
    public static final String MC_MILLAN = "//a[@href='https://log.finalsurge.com/McMillanCalc.cshtml?c=1&ssl=1']";
    public static final String SELECT_RACE_DISTANCE = "//select[@id='distance']";
    public static final String METERS_400_MC_MILLAN = "//select[@id='distance']//option[@value='400m']";
    public static final String METERS_600_MC_MILLAN = "//select[@id='distance']//option[@value='600m']";
    public static final String METERS_800_MC_MILLAN = "//select[@id='distance']//option[@value='800m']";
    public static final String METERS_1000_MC_MILLAN = "//select[@id='distance']//option[@value='1000m']";
    public static final String METERS_1500_MC_MILLAN = "//select[@id='distance']//option[@value='1500m']";
    public static final String MILES_1_MC_MILLAN = "//select[@id='distance']//option[@value='Mile']";
    public static final String METERS_2000_MC_MILLAN = "//select[@id='distance']//option[@value='2000m']";
    public static final String POLTORA_MILES_MC_MILLAN = "//select[@id='distance']//option[@value='1.5 Miles']";
    public static final String METERS_3000_MC_MILLAN = "//select[@id='distance']//option[@value='3000m']";
    public static final String METERS_3200_MC_MILLAN = "//select[@id='distance']//option[@value='3200m']";
    public static final String MILES_2_MC_MILLAN = "//select[@id='distance']//option[@value='2 Miles']";
    public static final String METERS_4000_MC_MILLAN = "//select[@id='distance']//option[@value='4000m']";
    public static final String MILES_3_MC_MILLAN = "//select[@id='distance']//option[@value='3 Miles']";
    public static final String METERS_5000_MC_MILLAN = "//select[@id='distance']//option[@value='5000m']";
    public static final String METERS_6000_MC_MILLAN = "//select[@id='distance']//option[@value='6000m']";
    public static final String MILES_4_MC_MILLAN = "//select[@id='distance']//option[@value='4 Miles']";
    public static final String METERS_8000_MC_MILLAN = "//select[@id='distance']//option[@value='8000m']";
    public static final String MILES_5_MC_MILLAN = "//select[@id='distance']//option[@value='5 Miles']";
    public static final String KM_10_MC_MILLAN = "//select[@id='distance']//option[@value='10km']";
    public static final String KM_12_MC_MILLAN = "//select[@id='distance']//option[@value='12km']";
    public static final String KM_15_MC_MILLAN = "//select[@id='distance']//option[@value='15km']";
    public static final String MILES_10_MC_MILLAN = "//select[@id='distance']//option[@value='10 Miles']";
    public static final String KM_20_MC_MILLAN = "//select[@id='distance']//option[@value='20km']";
    public static final String POL_MARATHON = "//select[@id='distance']//option[@value='1/2 Marathon']";
    public static final String MILES_15_MC_MILLAN = "//select[@id='distance']//option[@value='15 Miles']";
    public static final String KM_25_MC_MILLAN = "//select[@id='distance']//option[@value='25km']";
    public static final String KM_30_MC_MILLAN = "//select[@id='distance']//option[@value='30km']";
    public static final String MILES_20_MC_MILLAN = "//select[@id='distance']//option[@value='20 Miles']";
    public static final String MARATHON_MC_MILLAN = "//select[@id='distance']//option[@value='Marathon']";
    public static final String KM_50_MC_MILLAN = "//select[@id='distance']//option[@value='50km']";
    public static final String MILES_50_MC_MILLAN = "//select[@id='distance']//option[@value='50 Miles']";
    public static final String KM_100_MC_MILLAN = "//select[@id='distance']//option[@value='100km']";
    public static final String MILES_100_MC_MILLAN = "//select[@id='distance']//option[@value='100 Miles']";
    public static final String HH_MC_MILLAN = "//input[@id='TimeHH']";//??????
    public static final String MM_MC_MILLAN = "//input[@id='TimeMM']";//??????
    public static final String SS_MC_MILLAN = "//input[@id='TimeSS']";//??????
    public static final String SELECT_GOAL_DISTANCE = "//select[@name='goaldistance']";
    public static final String SGD_METERS_400_MC_MILLAN = "//select[@name='goaldistance']//option[@value='400m']";
    public static final String SGD_METERS_600_MC_MILLAN = "//select[@name='goaldistance']//option[@value='600m']";
    public static final String SGD_METERS_800_MC_MILLAN = "//select[@name='goaldistance']//option[@value='800m']";
    public static final String SGD_METERS_1000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='1000m']";
    public static final String SGD_METERS_1500_MC_MILLAN = "//select[@name='goaldistance']//option[@value='1500m']";
    public static final String SGD_MILES_1_MC_MILLAN = "//select[@name='goaldistance']//option[@value='Mile']";
    public static final String SGD_METERS_2000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='2000m']";
    public static final String SGD_POLTORA_MILES_MC_MILLAN = "//select[@name='goaldistance']//option[@value='1.5 Miles']";
    public static final String SGD_METERS_3000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='3000m']";
    public static final String SGD_METERS_3200_MC_MILLAN = "//select[@name='goaldistance']//option[@value='3200m']";
    public static final String SGD_MILES_2_MC_MILLAN = "//select[@name='goaldistance']//option[@value='2 Miles']";
    public static final String SGD_METERS_4000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='4000m']";
    public static final String SGD_MILES_3_MC_MILLAN = "//select[@name='goaldistance']//option[@value='3 Miles']";
    public static final String SGD_METERS_5000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='5000m']";
    public static final String SGD_METERS_6000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='6000m']";
    public static final String SGD_MILES_4_MC_MILLAN = "//select[@name='goaldistance']//option[@value='4 Miles']";
    public static final String SGD_METERS_8000_MC_MILLAN = "//select[@name='goaldistance']//option[@value='8000m']";
    public static final String SGD_MILES_5_MC_MILLAN = "//select[@name='goaldistance']//option[@value='5 Miles']";
    public static final String SGD_KM_10_MC_MILLAN = "//select[@name='goaldistance']//option[@value='10km']";
    public static final String SGD_KM_12_MC_MILLAN = "//select[@name='goaldistance']//option[@value='12km']";
    public static final String SGD_KM_15_MC_MILLAN = "//select[@name='goaldistance']//option[@value='15km']";
    public static final String SGD_MILES_10_MC_MILLAN = "//select[@name='goaldistance']//option[@value='10 Miles']";
    public static final String SGD_KM_20_MC_MILLAN = "//select[@name='goaldistance']//option[@value='20km']";
    public static final String SGD_POL_MARATHON = "//select[@name='goaldistance']//option[@value='1/2 Marathon']";
    public static final String SGD_MILES_15_MC_MILLAN = "//select[@name='goaldistance']//option[@value='15 Miles']";
    public static final String SGD_KM_25_MC_MILLAN = "//select[@name='goaldistance']//option[@value='25km']";
    public static final String SGD_KM_30_MC_MILLAN = "//select[@name='goaldistance']//option[@value='30km']";
    public static final String SGD_MILES_20_MC_MILLAN = "//select[@name='goaldistance']//option[@value='20 Miles']";
    public static final String SGD_MARATHON_MC_MILLAN = "//select[@name='goaldistance']//option[@value='Marathon']";
    public static final String SGD_KM_50_MC_MILLAN = "//select[@name='goaldistance']//option[@value='50km']";
    public static final String SGD_MILES_50_MC_MILLAN = "//select[@name='goaldistance']//option[@value='50 Miles']";
    public static final String SGD_KM_100_MC_MILLAN = "//select[@name='goaldistance']//option[@value='100km']";
    public static final String SGD_MILES_100_MC_MILLAN = "//select[@name='goaldistance']//option[@value='100 Miles']";
    public static final String SGD_HH_MC_MILLAN = "//input[@id='GTimeHH']";
    public static final String SGD_MM_MC_MILLAN = "//input[@id='GTimeMM']";
    public static final String SGD_SS_MC_MILLAN = "//input[@id='GTimeSS']";
    public static final String CALCULATE_MY_PACES_MC_MILLAN_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate My Paces']";
    public static final String RESULT = "//a[@id='btnShowEndurance']";
    public static final String RECALCULATION_BUTTON = "//a[@class='btn btn-primary']";
    public static final String ERROR = "//div[@class='alert alert-error']"; // 2 locatora

    public McMillanPage openWorkoutCalculators() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public McMillanPage openChapterMcMillan() {
        $x(MC_MILLAN).click();
        return this;
    }

    public McMillanPage indicateInEstimatedRunDistance() {
        $x(KM_10_MC_MILLAN).click();
        return this;
    }

    public McMillanPage indicateEstimatedTime(String hh, String mm, String ss) {
        $x(HH_MC_MILLAN).sendKeys(hh);
        $x(MM_MC_MILLAN).sendKeys(mm);
        $x(SS_MC_MILLAN).sendKeys(ss);
        return this;
    }

    public McMillanPage indicateInRunDistanceOptional() {
        $x(SGD_KM_15_MC_MILLAN).click();
        return this;
    }

    public McMillanPage indicateTimeOptional(String hh, String mm, String ss) {
        $x(SGD_HH_MC_MILLAN).sendKeys(hh);
        $x(SGD_MM_MC_MILLAN).sendKeys(mm);
        $x(SGD_SS_MC_MILLAN).sendKeys(ss);
        return this;
    }

    public McMillanPage mcMillanSaveButton() {
        $x(CALCULATE_MY_PACES_MC_MILLAN_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }

    public boolean locatorForOutput() {
        $x(RESULT);
        return true;
    }

    public McMillanPage testShouldBeOutputResults () {
        Assert.assertTrue(locatorForOutput());
        return this;
    }

    public String getErrorText () {
        return  $x(ERROR).getText();
    }

    public McMillanPage validateErrorText (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "Please fix the following errors:");
        switchTo().defaultContent();
        return this;
    }
}
