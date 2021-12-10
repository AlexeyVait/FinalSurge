package pages;

import org.testng.Assert;
import steps.CalendarSteps;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class CalendarPage {

    public static final String PLUS_CALENDAR = "//td[@data-day]";
    //public static final String DESEMBR = "//a[@data-day='13'][@data-month='12'][@class='quick-add']";

    public static final String  TIME_OF_DAY = "//input[@id='WorkoutTime']";//click
    public static final String CHOICE_TIME_OF_DAY = "//ul[@class='ui-timepicker-list picktime']";//click

    public static final String ACTIVITY_TYPE = "//select[@id='ActivityType']";//click
    //RUN
    public static final String RUN_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001']";
    public static final String FARTLEK_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000001-0001-0001-0001-000000000001']";
    public static final String HILLS_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000002-0002-0002-0002-000000000002']";
    public static final String LACTATE_THRESHOLD_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000008-0008-0008-0008-000000000008']";
    public static final String LONG_RUN_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000003-0003-0003-0003-000000000003']";
    public static final String MARATHON_PACE_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000021-0021-0021-0021-000000000021']";
    public static final String RECOVERY_RUN_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000004-0004-0004-0004-000000000004']";
    public static final String TEMPO_RUN_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000005-0005-0005-0005-000000000005']";
    public static final String TRACK_WORCOUT_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000006-0006-0006-0006-000000000006']";
    public static final String MAX_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000007-0007-0007-0007-000000000007']";
    //BIKE
    public static final String BIKE_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002']";
    public static final String INTERVALS_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000009-0009-0009-0009-000000000009']";
    public static final String LONG_RIDE_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000010-0010-0010-0010-000000000010']";
    public static final String POWER_STRENGTH_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000022-0022-0022-0022-000000000022']";
    public static final String RECOVERY_RIDE_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000011-0011-0011-0011-000000000011']";
    public static final String TEMPO_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000014-0014-0014-0014-000000000014']";
    public static final String TIME_TRIAL_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000013-0013-0013-0013-000000000013']";
    public static final String TRAINER_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000002-0002-0002-0002-000000000002|00000012-0012-0012-0012-000000000012']";
    //SWIM
    public static final String SWIM_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003']";
    public static final String DRILLS_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003|00000015-0015-0015-0015-000000000015']";
    public static final String ENDURANCE_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003|00000016-0016-0016-0016-000000000016']";
    public static final String INTERVALS_ACTIVITY_TYPE_SWIM = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003|00000017-0017-0017-0017-000000000017']";
    public static final String OPEN_WATER_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003|00000018-0018-0018-0018-000000000018']";
    public static final String RECOVERY_SWIM_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003|00000019-0019-0019-0019-000000000019']";
    public static final String TEMPO_ACTIVITY_TYPE_SWIM = "//select[@id='ActivityType']//option[@value='00000003-0003-0003-0003-000000000003|00000020-0020-0020-0020-000000000020']";
    //CROSS TRAINING
    public static final String CROSS_TRAINING_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000004-0004-0004-0004-000000000004']";
    //WALK
    public static final String WALK_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000010-0010-0010-0010-000000000010']";
    //REST DAY
    public static final String REST_DAY_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000006-0006-0006-0006-000000000006']";
    //STRENGTH TRAINING
    public static final String STRENGTH_TRAINING_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000005-0005-0005-0005-000000000005']";
    //RECOVERY/REHAB
    public static final String RECOVERY_REHAB_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000007-0007-0007-0007-000000000007']";
    public static final String ACTIVE_RELEASE_RUN_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000007-0007-0007-0007-000000000007|00000026-0026-0026-0026-000000000026']";
    public static final String CHIROPRACTOR_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000007-0007-0007-0007-000000000007|00000025-0025-0025-0025-000000000025']";
    public static final String MESSAGE_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000007-0007-0007-0007-000000000007|00000024-0024-0024-0024-000000000024']";
    public static final String PHYSICAL_THERAPY_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000007-0007-0007-0007-000000000007|00000023-0023-0023-0023-000000000023']";
    //OTHER
    public static final String OTHER_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000008-0008-0008-0008-000000000008']";
    public static final String APPOINTMENT_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000008-0008-0008-0008-000000000008|00000028-0028-0028-0028-000000000028']";
    public static final String ILLNESS_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000008-0008-0008-0008-000000000008|00000030-0030-0030-0030-000000000030']";
    public static final String INJURY_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000008-0008-0008-0008-000000000008|00000029-0029-0029-0029-000000000029']";
    public static final String NOTES_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000008-0008-0008-0008-000000000008|00000027-0027-0027-0027-000000000027']";
    //TRANSITION
    public static final String TRANSITION_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000009-0009-0009-0009-000000000009']";

    public static final String WORKOUT_NAME = "//input[@id='Name']";
    public static final String WORKOUT_DESCRIPTION = "//textarea[@id='Desc']";
    //При нажатии на галочку
    public static final String CHECK_MARK_BUTTON_GALKA = "//input[@id='PlannedWorkout']";
    public static final String PLANNED_DISTANCE_GALKA = "//input[@id='PDistance']";
    public static final String SELECT_GALKA = "//select[@id='PDistType']"; //CLICK
    public static final String MILE_GALKA = "//select[@id='PDistType']//option[@value='mi']";
    public static final String KM_GALKA = "//select[@id='PDistType']//option[@value='km']";
    public static final String ME_GALKA = "//select[@id='PDistType']//option[@value='me']";
    public static final String YD_GALKA = "//select[@id='PDistType']//option[@value='yd']";
    public static final String PLANNED_DURATION_GALKA = "//input[@id='PDuration']";

    public static final String DISTANCE = "//input[@id='Distance']";
    public static final String SELECT_MILE = "//select[@id='DistType']";
    public static final String MILE = "//select[@id='DistType']//option[@value='mi']";
    public static final String KM = "//select[@id='DistType']//option[@value='km']";
    public static final String ME = "//select[@id='DistType']//option[@value='me']";
    public static final String YD = "//select[@id='DistType']//option[@value='yd']";
    public static final String DURATION = "//input[@id='Duration']";
    //public static final String PACE = "//input[@id='Pace']";
    public static final String SELECT_MIN_MI_PACE = "//select[@id='PaceType']";
    public static final String MIN_MI_PACE = "//select[@id='PaceType']//option[@value='mi']";
    public static final String MIN_KM_PACE = "//select[@id='PaceType']//option[@value='km']";
    public static final String MILE_PACE = "//select[@id='PaceType']//option[@value='mp']";
    public static final String KM_PACE = "//select[@id='PaceType']//option[@value='kp']";
    public static final String MIN_STO_M_PACE = "//select[@id='PaceType']//option[@value='me']";
    public static final String MIN_STO_Y_PACE = "//select[@id='PaceType']//option[@value='yd']";
    public static final String MIN_TS_PATSOT_PACE = "//select[@id='PaceType']//option[@value='mm']";

    public static final String HOVE_I_FELT = "//select[@id='HowFeel']";
    public static final String GREAT = "//select[@id='HowFeel']//option[@value='1']";
    public static final String GOOD = "//select[@id='HowFeel']//option[@value='2']";
    public static final String NORMAL = "//select[@id='HowFeel']//option[@value='3']";
    public static final String POOR = "//select[@id='HowFeel']//option[@value='4']";
    public static final String TERRIBLE = "//select[@id='HowFeel']//option[@value='5']";

    public static final String PERCEIVED_EFFORT = "//select[@id='PerEffort']";
    public static final String VERY_LIGHT = "//select[@id='PerEffort']//option[@value='1']";
    public static final String LIGHT_1 = "//select[@id='PerEffort']//option[@value='2']";
    public static final String LIGHT_2 = "//select[@id='PerEffort']//option[@value='3']";
    public static final String MODERATE_1 = "//select[@id='PerEffort']//option[@value='4']";
    public static final String MODERATE_2 = "//select[@id='PerEffort']//option[@value='5']";
    public static final String MODERATE_3 = "//select[@id='PerEffort']//option[@value='6']";
    public static final String HARD_1 = "//select[@id='PerEffort']//option[@value='7']";
    public static final String HARD_2 = "//select[@id='PerEffort']//option[@value='8']";
    public static final String VERY_HARD = "//select[@id='PerEffort']//option[@value='9']";
    public static final String MAX_EFFORT = "//select[@id='PerEffort']//option[@value='10']";

    public static final String POST_WORKOUT_NOTES_RESULTS = "//textarea[@id='PostDesc']";

    public static final String MARK_AS_RACE_GALKA = "//input[@id='IsRace']";
    public static final String OVERALL_PLACE = "//input[@id='OverallPlace']";
    public static final String AGE_GROUP_PLACE = "//input[@id='AgeGroupPlace']";

    public static final String SAVE_TO_LIBRARY = "//input[@id='SaveLibrary']";
    public static final String ADD_WORKOUT_BUTTON = "//input[@id='saveButton']";
    public static final String CANCEL = "//a[@id='CancelClose']";

    //Тест ставим на 30.11.2021 (локаторы по календарю)
    public static final String CALENDAR = "//div[@class='fc-event-activity-title']"; //В зависимости от дней, локатор будет меняться
        public static final String VIEW = "//a[@class='full-view']";
        public static final String UPDATE_WORKOUT_BUTTON_VIEW = "//span[@class='dropdown-toggle']";
        public static final String DATA_CALENDAR_VIEW = "//I[@class='icon-calendar']";//
        public static final String TIME_OF_DAY_VIEW = "//input[@id='WorkoutTime']";
        public static final String WORKOUT_NAME_VIEW = "//input[@id='Name']";
        public static final String WORKOUT_DESCRIPTION_VIEW = "//textarea[@id='Desc']";
        public static final String SHOW_PLANNED_DISTANCE_DURATION_VIEW_GALKA = "//input[@id='PlannedWorkout']";
        public static final String PLANNED_DISTANCE_VIEW_GALKA = "//input[@id='PDistance']";
        public static final String SELECT_KM_VIEW = "//select[@id='PDistType']";
        public static final String MILE_VIEW = "//select[@id='PDistType']//option[@value='mi']";
        public static final String KM_VIEW = "//select[@id='PDistType']//option[@value='km']";
        public static final String ME_VIEW = "//select[@id='PDistType']//option[@value='me']";
        public static final String YD_VIEW = "//select[@id='PDistType']//option[@value='yd']";
        public static final String PLANNED_DURATION_VIEW = "//input[@id='PDuration']";
        //BASIK WORKOUT
        public static final String DISTANCE_VIEW = "//input[@id='Distance']";
        public static final String SELECT_KM_BASIK_VIEW = "//select[@id='DistType']";
        public static final String MILE_BASIK_VIEW = "//select[@id='DistType']//option[@value='mi']";
        public static final String KM_BASIK_VIEW = "//select[@id='DistType']//option[@value='km']";
        public static final String ME_BASIK_VIEW = "//select[@id='DistType']//option[@value='me']";
        public static final String YD_BASIK_VIEW = "//select[@id='DistType']//option[@value='yd']";
        public static final String DURATION_VIEW = "//input[@id='Duration']";
        public static final String MARK_AS_RACE_VIEW_GALKA = "//input[@id='IsRace']";
        public static final String OVERALL_PLACE_BASIK_VIEW = "//input[@id='OverallPlace']";
        public static final String AGE_GROUP_PLACE_BASIK_VIEW = "//input[@id='AgeGroupPlace']";
        //HOF I FELT
        public static final String GREAT_VIEW = "//input[@id='hf_great']";
        public static final String GOOD_VIEW = "//input[@id='hf_good']";
        public static final String NORMAL_VIEW = "//input[@id='hf_normal']";
        public static final String POOR_VIEW = "//input[@id='hf_poor']";
        public static final String TERRIBLE_VIEW = "//input[@id='hf_terrible']";
        //Perceived Effort
        public static final String SELECT_VIEW = "//select[@id='PerEffort']";
        public static final String VERY_LIGHT_VIEW = "//select[@id='PerEffort']//option[@value='1']";
        public static final String LIGHT_1_VIEW = "//select[@id='PerEffort']//option[@value='2']";
        public static final String LIGHT_2_VIEW = "//select[@id='PerEffort']//option[@value='3']";
        public static final String MODERATE_1_VIEW = "//select[@id='PerEffort']//option[@value='4']";
        public static final String MODERATE_2_VIEW = "//select[@id='PerEffort']//option[@value='5']";
        public static final String MODERATE_3_VIEW = "//select[@id='PerEffort']//option[@value='6']";
        public static final String HARD_1_VIEW = "//select[@id='PerEffort']//option[@value='7']";
        public static final String HARD_2_VIEW = "//select[@id='PerEffort']//option[@value='8']";
        public static final String VERY_HARD_VIEW = "//select[@id='PerEffort']//option[@value='9']";
        public static final String MAX_EFFORT_VIEW = "//select[@id='PerEffort']//option[@value='10']";
        public static final String MIN_HR_VIEW = "//input[@id='MinHR']";
        public static final String AVG_HR_VIEW = "//input[@id='AvgHR']";
        public static final String MAX_HR_VIEW = "//input[@id='MaxHR']";
        public static final String CALORIES_BURNED = "//input[@id='kCal']";
        public static final String SAVE_V_BIBLIOTEKU = "//input[@id='SaveLibrary']";
        public static final String UPDATE_WORKOUT_BUTTON_SAVE_VIEW = "//input[@id='saveButton']";
        public static final String SAVE_TO_LIBRARY_GALKA_VIEW = "//input[@id='SaveLibrary']";
        public static final String KARZINA = "//a[@id='del-workout']";

        public static final String RAZMINKA = "//div[@id='WarmCoolBox']";
        public static final String DISTANCE_RAZMINKI = "//input[@id='WUDistance']";
        public static final String DISTANCE_SELECT_RAZMINKI = "//select[@id='WUDistType']";
        public static final String DISTANCE_SELECT_KM_RAZMINKI = "//select[@id='WUDistType']//option[@value='km']";
        public static final String TIME_RAZMINKI = "//input[@id='WUDuration']";
        public static final String DISTANCE_OHLACHDENIA = "//input[@id='CDDistance']";
        public static final String DISTANCE_SELECT_OHLACHDENIA = "//select[@id='CDDistType']";
        public static final String DISTANCE_SELECT_KM_OHLACHDENIA = "//select[@id='CDDistType']//option[@value='km']";
        public static final String TIME_OHLACHDENIA = "//input[@id='CDDuration']";

        public static final String SCROLL = "//a[@class='scrollup']";
        public static final String POGODA = "//div[@data-label='weather']";
        public static final String POGODA_2_ = "//input[@id='PartSunny']";
        public static final String GRADYS = "//input[@id='Temp']";
        public static final String SELECT_F_C_ = "//select[@id='TempType']";
        public static final String _C_ = "//select[@id='TempType']//option[@value='C']";
        public static final String VLAGA = "//input[@id='Humid']";

        //Advanced Workout (Intervals)
        public static final String ADVANCED_WORKOUT_INTERVALS_BUTTON_VIEW = "//a[@id='tIntervals']";
        public static final String REPS_1_ = "//input[@id='SetReps1']";
        public static final String DISTANCE_1_ = "//input[@id='SetDist1']";
        public static final String SELECT_1_ = "//select[@id='SetDistType1']";//CLICK
        public static final String MILES_1_ = "//select[@id='SetDistType1']//option[@value='mi']";
        public static final String KM_1_ = "//select[@id='SetDistType1']//option[@value='km']";
        public static final String ME_1_ = "//select[@id='SetDistType1']//option[@value='me']";
        public static final String YD_1_ = "//select[@id='SetDistType1']//option[@value='yd']";
        public static final String DURATION_1_ = "//input[@id='SetTime1']";
        public static final String DOBAVLENIE_1_ = "//i[@id='SetAdd1']";
            public static final String REPS_2_ = "//input[@id='SetReps2']";
            public static final String DISTANCE_2_ = "//input[@id='SetDist2']";
            public static final String SELECT_2_ = "//select[@id='SetDistType2']";
            public static final String MILES_2_ = "//select[@id='SetDistType2']//option[@value='mi']";
            public static final String KM_2_ = "//select[@id='SetDistType2']//option[@value='km']";
            public static final String ME_2_ = "//select[@id='SetDistType2']//option[@value='me']";
            public static final String YD_2_ = "//select[@id='SetDistType2']//option[@value='yd']";
            public static final String DURATION_2_ = "//input[@id='SetTime2']";
            public static final String DOBAVLENIE_2_ = "//i[@id='SetAdd2']";
                public static final String REPS_3_ = "//input[@id='SetReps3']";
                public static final String DISTANCE_3_ = "//input[@id='SetDist3']";
                public static final String SELECT_3_ = "//select[@id='SetDistType3']";
                public static final String MILES_3_ = "//select[@id='SetDistType3']//option[@value='mi']";
                public static final String KM_3_ = "//select[@id='SetDistType3']//option[@value='km']";
                public static final String ME_3_ = "//select[@id='SetDistType3']//option[@value='me']";
                public static final String YD_3_ = "//select[@id='SetDistType3']//option[@value='yd']";
                public static final String DURATION_3_ = "//input[@id='SetTime3']";
                public static final String DOBAVLENIE_3_ = "//i[@id='SetAdd3']";
                    public static final String REPS_4_ = "//input[@id='SetReps4']";
                    public static final String DISTANCE_4_ = "//input[@id='SetDist4']";
                    public static final String SELECT_4_ = "//select[@id='SetDistType4']";
                    public static final String MILES_4_ = "//select[@id='SetDistType4']//option[@value='mi']";
                    public static final String KM_4_ = "//select[@id='SetDistType4']//option[@value='km']";
                    public static final String ME_4_ = "//select[@id='SetDistType4']//option[@value='me']";
                    public static final String YD_4_ = "//select[@id='SetDistType4']//option[@value='yd']";
                    public static final String DURATION_4_ = "//input[@id='SetTime4']";
                    public static final String DOBAVLENIE_4_ = "//i[@id='SetAdd4']";
                public static final String DELETE_1_ = "//i[@id='SetDelete1']";
                public static final String DELETE_2_ = "//i[@id='SetDelete2']";
                public static final String DELETE_3_ = "//i[@id='SetDelete3']";

    public static final String OPEN_CALENDAR = "//a[@href='Calendar.cshtml'][@class='ptip_s']";
    public static final String CLICK_NA_TRENIROVKY = "//div[@class='fc-event-inner fc-event-skin']";
    public static final String UPDATE_WORKOUT = "//a[@class='full-edit']";
    public static final String COMMENTS = "//a[@class='quick-comment']"; //iframe="WorkoutCommentsiFrame"
    public static final String PAIN_INJURY = "//a[@data-reveal-id='PainInjuryModal']";//data-reveal-iframe="PainInjuryFrame"
    public static final String MOVE = "//a[@class='quick-move']";
    public static final String COPY = "//a[@class='quick-copy']";
    public static final String DELETE = "//a[@class='quick-delete']";
        public static final String DELETE_OK = "//a[@data-handler='1']";
    public static final String ERROR = "//div[@class='alert alert-error']";



    public CalendarPage selectionDay() {
        $x(PLUS_CALENDAR).submit();
        return this;
    }

    public CalendarPage timeAndDay() {
        $x(TIME_OF_DAY).click();
        return this;
    }

    public CalendarPage selectionTimeAndDay() {
        $x(CHOICE_TIME_OF_DAY).click();
        return this;
    }

    public CalendarPage selectionActivityType_1() {
        $x(ACTIVITY_TYPE).click();
        return this;
    }
    public CalendarPage selectionActivityType_2() {
        $x(FARTLEK_ACTIVITY_TYPE).click();
        return this;
    }

    public CalendarPage workoutName(String name) {
        $x(WORKOUT_NAME).sendKeys(name);
        return this;
    }

    public CalendarPage workDescription(String description) {
        $x(WORKOUT_DESCRIPTION).sendKeys(description);
        return this;
    }

    public CalendarPage galochka() {
        $x(CHECK_MARK_BUTTON_GALKA).click();
        return this;
    }

    public CalendarPage distancePlanGalka(String distance) {
        $x(PLANNED_DISTANCE_GALKA).sendKeys(distance);
        return this;
    }

    public CalendarPage selectDistanceGalka() {
        $x(SELECT_GALKA).click();
        return this;
    }

    public CalendarPage selectKmDistanceGalka() {
        $x(KM_GALKA).click();
        return this;
    }

    public CalendarPage planTimeGalka(String HH, String MM, String SS) {
        $x(PLANNED_DURATION_GALKA).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage distancePlan(String distance) {
        $x(DISTANCE).sendKeys(distance);
        return this;
    }

    public CalendarPage selectDistance() {
        $x(SELECT_MILE).click();
        return this;
    }

    public CalendarPage selectKmDistance() {
        $x(KM).click();
        return this;
    }

    public CalendarPage planTime(String HH, String MM, String SS) {
        $x(DURATION).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage selectSpeed() {
        $x(SELECT_MIN_MI_PACE).click();
        return this;
    }

    public CalendarPage selectKmSpeed() {
        $x(MIN_KM_PACE).click();
        return this;
    }

    public CalendarPage selectSamochyvstvie() {
        $x(HOVE_I_FELT).click();
        return this;
    }

    public CalendarPage selectSamochyvstvieGood() {
        $x(GOOD).click();
        return this;
    }

    public CalendarPage selectYsilie() {
        $x(PERCEIVED_EFFORT).click();
        return this;
    }

    public CalendarPage itogYsilie() {
        $x(MODERATE_2).click();
        return this;
    }

    public CalendarPage zametki(String zam) {
        $x(POST_WORKOUT_NOTES_RESULTS).sendKeys(zam);
        return this;
    }

    public CalendarPage dopGalka() {
        $x(MARK_AS_RACE_GALKA).click();
        return this;
    }

    public CalendarPage obcheeMesto(String mesto) {
        $x(OVERALL_PLACE).sendKeys(mesto);
        return this;
    }

    public CalendarPage vozrastGrupa(String vozrastnaia){
        $x(AGE_GROUP_PLACE).sendKeys(vozrastnaia);
        return this;
    }

    public CalendarPage saveGalka() {
        $x(SAVE_TO_LIBRARY).click();
        return this;
    }

    public CalendarPage dobavitTrenirivky() {
        $x(ADD_WORKOUT_BUTTON).click();
        return this;
    }

    public CalendarPage openCalendar() {
        $x(CALENDAR).click();
        return this;
    }

    public CalendarPage openView() {
        $x(VIEW).click();
        return this;
    }

    public CalendarPage openRedactirovanie() {
        $x(UPDATE_WORKOUT_BUTTON_VIEW).click();
        return this;
    }

    public CalendarPage updateDistance(String basic_distance) {
        $x(DISTANCE_VIEW).sendKeys(basic_distance);
        return this;
    }

    public CalendarPage selectUpdateRasstoianie() {
        $x(SELECT_KM_BASIK_VIEW).click();
        return this;
    }

    public CalendarPage selectUpdateKmRasstoianie() {
        $x(KM_BASIK_VIEW).click();
        return this;
    }

    public CalendarPage updateTime() {
        $x(DURATION_VIEW).click();
        return this;
    }

    public CalendarPage updateSamochuvstvie() {
        $x(NORMAL_VIEW).click();
        return this;
    }

    public CalendarPage updateYsilie() {
        $x(SELECT_VIEW).click();
        return this;
    }

    public CalendarPage updateUrovenYsilie() {
        $x(HARD_1_VIEW).click();
        return this;
    }

    public CalendarPage minUdarVMinyty(String colichestvo) {
        $x(MIN_HR_VIEW).sendKeys(colichestvo);
        return this;
    }

    public CalendarPage sredneUdarVMinyty(String colichestvo) {
        $x(AVG_HR_VIEW).sendKeys(colichestvo);
        return this;
    }

    public CalendarPage maxUdarVMinyty(String colichestvo) {
        $x(MAX_HR_VIEW).sendKeys(colichestvo);
        return this;
    }

    public CalendarPage caloriesUpdate(String colichestvo) {
        $x(CALORIES_BURNED).sendKeys(colichestvo);
        return this;
    }

    public CalendarPage updateGalka() {
        $x(SAVE_TO_LIBRARY_GALKA_VIEW).click();
        return this;
    }


    public CalendarPage scroll() {
        $x(SCROLL).click();
        return this;
    }

    public CalendarPage updatePogoda() {
        $x(POGODA).click();
        return this;
    }

    public CalendarPage updatePogodaGalka() {
        $x(POGODA_2_).click();
        return this;
    }

    public CalendarPage updateGradys(String gradys) {
        $x(GRADYS).sendKeys(gradys);
        return this;
    }

    public CalendarPage updateSelectGradys() {
        $x(SELECT_F_C_).click();
        return this;
    }

    public CalendarPage updateSelectCGradys() {
        $x(_C_).click();
        return this;
    }

    public CalendarPage updateVlaga(String procent) {
        $x(VLAGA).sendKeys(procent);
        return this;
    }

    public CalendarPage updateRazminki() {
        $x(RAZMINKA).click();
        return this;
    }

    public CalendarPage updateRazminkiDistance(String distance) {
        $x(DISTANCE_RAZMINKI).sendKeys(distance);
        return this;
    }

    public CalendarPage updateRazminkiSelect() {
        $x(DISTANCE_SELECT_RAZMINKI).click();
        return this;
    }

    public CalendarPage updateRazminkiSelectKm() {
        $x(DISTANCE_SELECT_KM_RAZMINKI).click();
        return this;
    }

    public CalendarPage updateRazminkiTime(String HH, String MM, String SS) {
        $x(TIME_RAZMINKI).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage updateOhlachdeniaDistance(String km) {
        $x(DISTANCE_OHLACHDENIA).sendKeys(km);
        return this;
    }

    public CalendarPage updateOhlachdeniaDistanceSelect() {
        $x(DISTANCE_SELECT_OHLACHDENIA).click();
        return this;
    }

    public CalendarPage updateOhlachdeniaDistanceSelectKm() {
        $x(DISTANCE_SELECT_KM_OHLACHDENIA).click();
        return this;
    }

    public CalendarPage updateOhlachdeniaTime(String HH, String MM, String SS) {
        $x(TIME_OHLACHDENIA).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage updateBibliotekaGalka() {
        $x(SAVE_V_BIBLIOTEKU).click();
        return this;
    }

    public CalendarPage updateTrenirovki(){
        $x(UPDATE_WORKOUT_BUTTON_SAVE_VIEW).click();
        return this;
    }

    public CalendarPage openCalendarResult() {
        $x(OPEN_CALENDAR).click();
        return this;
    }

    public CalendarPage clickNaGotovTrenirovky() {
        $x(CLICK_NA_TRENIROVKY).click();
        return this;
    }

    public CalendarPage deleteResultTrenirovki() {
        $x(DELETE).click();
        return this;
    }

    public CalendarPage deleteResultTrenirovkiOK() {
        $x(DELETE_OK).click();
        return this;
    }

    public String getErrorText () {
        return  $x(ERROR).getText();
    }

    public CalendarPage validateErrorTextMinHH (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Maximum Heartrate cannot be greater than 300.");
        return this;
    }

    public CalendarPage validateErrorTextMaxHH (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Minimum Heartrate cannot be greater than 300.");
        return this;
    }

    public CalendarPage validateErrorTextAvgHH (String errorText) {
        Assert.assertEquals(getErrorText(),errorText, "×\n" +
                "Please fix the following errors:\n" +
                "*Average Heartrate cannot be greater than 300.");
        switchTo().defaultContent();
        return this;
    }
}
