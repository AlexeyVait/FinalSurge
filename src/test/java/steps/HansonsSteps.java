package steps;

import io.qameta.allure.Step;
import pages.HansonsPage;

public class HansonsSteps {

    HansonsPage hansonsPage;

    public HansonsSteps() {
        this.hansonsPage = new HansonsPage();
    }

    @Step("Calculation of results at data")
    public HansonsSteps calculationData (String dis, String hh, String mm,
                                        String ss, String temp, String humidity,
                                        String speed) {
        hansonsPage
                .openWorkoutCalculators()
                .openChapterHansons()
                .indicateInRunDistance(dis)
                .indicateTime(hh, mm, ss)
                .dataAdjustments(temp, humidity, speed)
                .hansonSaveButton()
                .testShouldBeOutputResults();
        return this;
    }

    @Step("Error inter valid data")
    public HansonsSteps errorResult (String dis, String hh, String mm,
                                     String ss, String temp, String humidity,
                                     String speed, String errorText) {
        hansonsPage
                .openWorkoutCalculators()
                .openChapterHansons()
                .indicateInRunDistance(dis)
                .indicateTime(hh, mm, ss)
                .dataAdjustments(temp, humidity, speed)
                .hansonSaveButton()
                .validateErrorText(errorText);
        return this;
    }
}
