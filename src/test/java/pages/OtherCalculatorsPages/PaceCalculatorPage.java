package pages.OtherCalculatorsPages;

import static com.codeborne.selenide.Selenide.*;

public class PaceCalculatorPage {

    //Калькулятор темпа
    public static final String CALORIC_NEEDS_BUTTON_1 = "//li//a[@href='#']//i[@class='icsw16-calculator']";
    public static final String PACE_CALCULATORS_BUTTON = "//button[@class='btn btn-small btn-inverse disabled']";
    public static final String DISTANCE = "//input[@id='RunDist']";
    public static final String DISTANCE_KM = "//select[@id='DistType'][@class='span3']//option[@value='km']";
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
    public static final String CALCULATOR_PACES_BUTTON = "//input[@id='saveButtonSettings'][@value='Calculate Paces']";
    public static final String ERROR = "//div[@class='alert alert-error']";
    //RESULT = 4 locatora "//div[@class='w-box w-box-green']//div[@class='w-box-header']//h4";

    public PaceCalculatorPage openCalculators1() {
        $x(CALORIC_NEEDS_BUTTON_1).click();
        switchTo().frame("OtherCalciFrame");
        return this;
    }

    public PaceCalculatorPage paceCAL() {
        $x(PACE_CALCULATORS_BUTTON).doubleClick();
        return this;
    }

    public PaceCalculatorPage distance(String Dist) {
        $x(DISTANCE).sendKeys(Dist);
        $x(DISTANCE_KM).click();
        //$x(DISTANCE_12KM).click();
        return this;
    }

    public PaceCalculatorPage time(String chas, String minut, String sek) {
        $x(TIME_HH).sendKeys(chas);
        $x(TIME_MM).sendKeys(minut);
        $x(TIME_SS).sendKeys(sek);
        return this;
    }

    public PaceCalculatorPage paceCalculators1() {
        $x(CALCULATOR_PACES_BUTTON).click();
        switchTo().defaultContent();
        return this;
    }


}
