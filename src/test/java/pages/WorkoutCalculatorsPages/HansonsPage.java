package pages.WorkoutCalculatorsPages;

public class HansonsPage {

    public static final String HANSONS = "//a[@href='https://log.finalsurge.com/HansonsCalc.cshtml?c=1&ssl=1']";
    public static final String Select = "//select[@id='RaceDist']//option[@value='']['Select']"; //??????
    public static final String Marathon_Hansons = "//select[@id='RaceDist']//option[@value='Marathon']"; //??????
    public static final String Half_Marathon_Hansons = "//select[@id='RaceDist']//option[@value='Half Marathon']"; //??????
    public static final String Metrov_1500 = "//select[@id='RaceDist']//option[@value='1500m']";//??????
    public static final String Metrov_1600 = "//select[@id='RaceDist']//option[@value='1600m']";//??????
    public static final String Metrov_1609 = "//select[@id='RaceDist']//option[@value='1609m']";//??????
    public static final String k3 = "//select[@id='RaceDist']//option[@value='3k']";//??????
    public static final String k5 = "//select[@id='RaceDist']//option[@value='5k']";//??????
    public static final String k8 = "//select[@id='RaceDist']//option[@value='8k']";//??????
    public static final String k10 = "//select[@id='RaceDist']//option[@value='10k']";//??????
    public static final String k12 = "//select[@id='RaceDist']//option[@value='12k']";//??????
    public static final String k15 = "//select[@id='RaceDist']//option[@value='15k']";//??????
    public static final String Miles_10 = "//select[@id='RaceDist']//option[@value='10 Miles']";//??????
    public static final String k20 = "//select[@id='RaceDist']//option[@value='20k']";//??????
    public static final String k25 = "//select[@id='RaceDist']//option[@value='25k']";//??????
    public static final String k30 = "//select[@id='RaceDist']//option[@value='30k]";//??????
    public static final String DISTANCE_HANSONS = "//input[@id='Distance']";
    public static final String MI_HANSONS = "//select[@id='DistType'][@class='span2']";
    public static final String KM_HANSONS = "//select[@id='DistType'][@class='span2']//option[@value='km']";
    public static final String METERS_HANSONS = "//select[@id='DistType'][@class='span2']//option[@value='me']";
    public static final String HH_HANSONS = "//input[@id='TimeHH'][@maxlength='1']";
    public static final String MM = "//input[@id='TimeMM'][@maxlength='2']";//?????
    public static final String SS = "//input[@id='TimeSS'][@maxlength='2']";//?????
    public static final String TEMPERATURE_HANSONS = "//input[@id='Temp'][@maxlength='3']";
    public static final String F_HANSONS = "//select[@id='TempType']//option[@value='F']";
    public static final String C_HANSONS = "//select[@id='TempType']//option[@value='C']";
    public static final String HUMIDITY_HANSONS = "//input[@id='Humid']";
    public static final String WIND_SPEED_HANSONS = "//input[@id='Wind']";
    public static final String MPH_HANSONS = "//select[@id='SpeedType']//option[@value='mph']";
    public static final String KPH_HANSONS = "//select[@id='SpeedType']//option[@value='kph']";
    public static final String CALCULATE_PACES_HANSONS_BUTTON = "//input[@value='Calculate Paces']";
}
