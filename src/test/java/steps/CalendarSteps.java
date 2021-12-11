package steps;

import io.qameta.allure.Step;
import pages.CalendarPage;

public class CalendarSteps {

    CalendarPage calendarPage;

    public CalendarSteps() {
        this.calendarPage = new CalendarPage();
    }

    @Step("Workout quick add")
    public CalendarSteps addingAWorkout(String name, String description,
                                        String distance, String HH, String MM,
                                        String SS, String distancePlan,
                                        String hh, String mm, String ss,
                                        String notes, String data, String age) {
        calendarPage
                .clickInButtonForCreateNewWorkout()
                .clickInQuickAddButton()
                .selectionTimeAndDay()
                .selectionActivityType()
                .selectionFartlekActivityType()
                .enterInInputWorkoutName(name)
                .enterInformationInMenuWorkDescription(description)
                .showDistanceAndDuration()
                .enterDistanceInInputShow(distance)
                .selectShowDistance()
                .selectKmShowDistance()
                .enterDataInInputDistance(HH, MM, SS)
                .distancePlan(distancePlan)
                .selectDistance()
                .selectKmDistance()
                .planTime(hh, mm, ss)
                .selectSpeed()
                .selectKmSpeed()
                .needSelectHealth()
                .selectTheGoodButton()
                .needSelectPerceivedEffort()
                .resultPerceivedEffort()
                .enterResultInWorkoutNotes(notes)
                .clickInButtonRace()
                .enterDataInInputOverallPlace(data)
                .enterDataInInputGroupPlace(age)
                .saveToLibraryWorkout()
                .addWorkout();
        return this;
    }

    @Step("Open the settings of the added workout and update the data")
    public CalendarSteps updatingThisWorkout(String basic_distance, String min, String sred,
                                             String max, String calories) {
        calendarPage
                .openCalendar()
                .openView()
                .clickButtonView()
                .updateDistance(basic_distance)
                .selectUpdateDistance()
                .selectUpdateKmDistance()
                .updateTime()
                .updateNormalView()
                .updateSelectView()
                .updateHardView()
                .minNumberOfHeartBeatsPerMinute(min)
                .avgNumberOfHeartBeatsPerMinutey(sred)
                .maxNumberOfHeartBeatsPerMinute(max)
                .caloriesUpdate(calories);
        return this;
    }


    @Step("Open and update weather conditions during training")
    public CalendarSteps weather(String degrees, String moisture) {
        calendarPage
                .updateLibraryView()
                .scroll()
                .updateWeather()
                .updatePartSunny()
                .updateTemperature(degrees)
                .updateSelectTemperature()
                .updateSelectCTemperature()
                .updateHumidity(moisture);
        return this;
    }

    @Step("Add pre-workout warm-up data")
    public CalendarSteps addingAWarmUp(String distance, String HH, String MM, String SS) {
        calendarPage
                .updateWarmUp()
                .updateWarmUpDistance(distance)
                .updateWarmUpSelect()
                .updateWarmUpSelectKm()
                .updateWarmUpTime(HH, MM, SS);
        return this;
    }

    @Step("Add post-workout cooling data")
    public CalendarSteps addCooling(String distance, String HH, String MM, String SS) {
        calendarPage
                .updateCoolDownDistance(distance)
                .updateCoolDownDistanceSelect()
                .updateCoolDownDistanceSelectKm()
                .updateCoolDownTime(HH, MM, SS);
        return this;
    }

    @Step("Add a workout with all changes")
    public CalendarSteps addModifiedWorkout() {
        calendarPage
                .updateLibrary()
                .updateWorkout()
                .openCalendarResult()
                .clickInWorkout();
        return this;
    }

    @Step("Deleting an added workout")
    public CalendarSteps deleteWorkout() {
        calendarPage
                .deleteResultWorkout()
                .deleteResultWorkoutOK();
        return this;
    }

    @Step("Filling in values with error text")
    public CalendarSteps errorForMinHR(String errorText) {
        calendarPage
                .updateWorkout()
                .validateErrorTextMinHH(errorText);
        return this;
    }

    @Step("Filling in values with error text")
    public CalendarSteps errorForMaxHR(String errorText) {
        calendarPage
                .updateWorkout()
                .validateErrorTextMaxHH(errorText);
        return this;
    }

    @Step("Filling in values with error text")
    public CalendarSteps errorForAvgHR(String errorText) {
        calendarPage
                .updateWorkout()
                .validateErrorTextAvgHH(errorText);
        return this;
    }
}
