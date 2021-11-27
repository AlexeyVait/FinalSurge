package pages.WorkoutCalculatorsPages;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class IntensityPage {

    public static final String WORKOUT_CALCULATORS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-stop-watch']";
    public static final String Intensity = "//button[@class='btn btn-small btn-inverse disabled']";//"//a[@href='https://log.finalsurge.com/WorkoutIntensityCalc.cshtml?c=1&ssl=1']";
    public static final String MILE_INTENSITY = "//input[@id='MILE']";
    public static final String KM_5_INTENSITY = "//input[@id='FIVEK']";
    public static final String KM_10_INTENSITY = "//input[@id='TENK']";
    public static final String HALF_MARATHON_INTENSITY = "//input[@id='HALFMAR']";
    public static final String MARATHON_INTENSITY_INTENSITY = "//input[@id='MARATHON']";
    public static final String HH_INTENSITY = "//input[@id='TimeHH']";
    public static final String MM_INTENSITY = "//input[@id='TimeMM']";
    public static final String SS_INTENSITY = "//input[@id='TimeSS']";
    public static final String CALCULATE_PACES_INTENSITY_BUTTON = "//input[@value='Calculate Paces']";
    //error
    public static final String ERROR_TIME_MILE = "//div[@class='alert alert-error']";//min time 3.39; max time 15.45
    //5km(min=12.37) (max=55.41); 10km(min=26.19) (max=1.52.13); Half marathon(min=57.50) (max=4.03.21)
    //Marathon(min=2.01.10) (max=8.11.57) - max znach v HH = 8;
    //green test = 2 lokatora
    public static final String RESULT = "//table[@class='table table-condensed table-hover']";

    public IntensityPage openCalcul() {
        $x(WORKOUT_CALCULATORS_BUTTON).click();
        switchTo().frame("IntensityCalciFrame");
        return this;
    }

    public IntensityPage openIntensity() {
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

    public IntensityPage calButton() {
        $x(CALCULATE_PACES_INTENSITY_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }
}
