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
                .enterTheDataAndClickInDistanceButton(dis)
                .enterTheTime(hh, mm, ss)
                .enterTheDataInInputAdjustments(temp, humidity, speed)
                .hansonSaveButton()
                .outputOfTheRequiredResult();
        return this;
    }

    @Step("Error inter valid data")
    public HansonsSteps errorResult (String dis, String hh, String mm,
                                     String ss, String temp, String humidity,
                                     String speed, String errorText) {
        hansonsPage
                .openWorkoutCalculators()
                .openChapterHansons()
                .enterTheDataAndClickInDistanceButton(dis)
                .enterTheTime(hh, mm, ss)
                .enterTheDataInInputAdjustments(temp, humidity, speed)
                .hansonSaveButton()
                .validateErrorText(errorText);
        return this;
    }
}
