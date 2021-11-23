package pages.OtherCalculatorsPages;

import static com.codeborne.selenide.Selenide.$x;

public class PaceCalculatorPage {

    //Калькулятор темпа
    public static final String CALORIC_NEEDS_BUTTON = "//li//a[@href='#']//i[@class='icsw16-calculator']";
    public static final String PACE_CALCULATORS_BUTTON = "//button[@class='btn btn-small btn-inverse disabled']";
    public static final String DISTANCE = "//input[@id='RunDist']";
    public static final String DISTANCE_KM = "//select[@id='DistType']//option[@value='km']";
    public static final String DISTANCE_3KM = "//select[@id='RaceDist']//option[@value='3k']";
    public static final String DISTANCE_5KM = "//select[@id='RaceDist']//option[@value='5k']";
    public static final String DISTANCE_8KM = "//select[@id='RaceDist']//option[@value='8k']";
    public static final String DISTANCE_10KM = "//select[@id='RaceDist']//option[@value='10k']";
    public static final String DISTANCE_12KM = "//select[@id='RaceDist']//option[@value='12k']";
    public static final String DISTANCE_15KM = "//select[@id='RaceDist']//option[@value='15k']";
    public static final String DISTANCE_50KM = "//select[@id='RaceDist']//option[@value='50k']";
    public static final String DISTANCE_MARATHON = "//select[@id='RaceDist']//option[@value='Marathon']";
    public static final String DISTANCE_HALF_MARATHON = "//select[@id='RaceDist']//option[@value='Half Marathon']";
    public static final String TIME_HH = "//input[@id='TimeHH']";
    public static final String TIME_MM = "//input[@id='TimeMM']";
    public static final String TIME_SS = "//input[@id='TimeSS']";
    public static final String CALCULATOR_PACES_BUTTON = "//input[@id='saveButtonSettings']";

    public PaceCalculatorPage openCalculators1() {
        $x(CALORIC_NEEDS_BUTTON).click();
        return this;
    }
    public PaceCalculatorPage paceCAL() {
        $x(PACE_CALCULATORS_BUTTON).doubleClick();
        return this;
    }

    public PaceCalculatorPage paceCalculators1() {
        $x(CALCULATOR_PACES_BUTTON).click();
        return this;
    }

    public PaceCalculatorPage iport(String Dist) {
        $x(DISTANCE).sendKeys(Dist);
        return this;
    }


}
