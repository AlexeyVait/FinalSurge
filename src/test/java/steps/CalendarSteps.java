package steps;

import io.qameta.allure.Step;
import pages.CalendarPage;

public class CalendarSteps {

    CalendarPage calendarPage;

    public CalendarSteps() {
        this.calendarPage = new CalendarPage();
    }

    @Step("Add main workout")
    public CalendarSteps addingAWorkout(String name, String description, String distance, String HH, String MM,
                                        String SS, String distancePlan, String hh, String mm, String ss,
                                        String notes, String aPlace, String group) {
        calendarPage
                .selectionDay()
                .timeAndDay()
                .selectionTimeAndDay()
                .selectionActivityType_1()
                .selectionActivityType_2()
                .workoutName(name)
                .workDescription(description)
                .galochka()
                .distancePlanGalka(distance)
                .selectDistanceGalka()
                .selectKmDistanceGalka()
                .planTimeGalka(HH, MM, SS)
                .distancePlan(distancePlan)
                .selectDistance()
                .selectKmDistance()
                .planTime(hh, mm, ss)
                .selectSpeed()
                .selectKmSpeed()
                .selectSamochyvstvie()
                .selectSamochyvstvieGood()
                .selectYsilie()
                .itogYsilie()
                .zametki(notes)
                .dopGalka()
                .obcheeMesto(aPlace)
                .vozrastGrupa(group)
                .saveGalka()
                .dobavitTrenirivky();
        return this;
    }

    @Step("Open the settings of the added workout and update the data")
    public CalendarSteps updatingThisWorkout(String distance, String min, String sred,
                                             String max, String calories) {
        calendarPage
                .openCalendar()
                .openView()
                .openRedactirovanie()
                .updateDistance(distance)
                .selectUpdateRasstoianie()
                .selectUpdateKmRasstoianie()
                .updateTime()
                .updateSamochuvstvie()
                .updateYsilie()
                .updateUrovenYsilie()
                .minUdarVMinyty(min)
                .sredneUdarVMinyty(sred)
                .maxUdarVMinyty(max)
                .caloriesUpdate(calories);
        return this;
    }

    @Step("Open and update weather conditions during training")
    public CalendarSteps weather(String degrees, String moisture) {
        calendarPage
                .updateGalka()
                .updatePogoda()
                .updatePogodaGalka()
                .updateGradys(degrees)
                .updateSelectGradys()
                .updateSelectCGradys()
                .updateVlaga(moisture);
        return this;
    }

    @Step("Add pre-workout warm-up data")
    public CalendarSteps addingAWarmUp(String distance, String HH, String MM, String SS) {
        calendarPage
                .updateRazminki()
                .updateRazminkiDistance(distance)
                .updateRazminkiSelect()
                .updateRazminkiSelectKm()
                .updateRazminkiTime(HH, MM, SS);
        return this;
    }

    @Step("Add post-workout cooling data")
    public CalendarSteps addCooling(String distance, String HH, String MM, String SS) {
        calendarPage
                .updateOhlachdeniaDistance(distance)
                .updateOhlachdeniaDistanceSelect()
                .updateOhlachdeniaDistanceSelectKm()
                .updateOhlachdeniaTime(HH, MM, SS);
        return this;
    }

    @Step("Add a workout with all changes")
    public CalendarSteps addModifiedWorkout() {
        calendarPage
                .updateBibliotekaGalka()
                .updateTrenirovki()
                .openCalendarResult()
                .clickNaGotovTrenirovky();
        return this;
    }

    @Step("Deleting an added workout")
    public CalendarPage deleteWorkout() {
        calendarPage
                .deleteResultTrenirovki()
                .deleteResultTrenirovkiOK();
        return calendarPage;
    }
}
