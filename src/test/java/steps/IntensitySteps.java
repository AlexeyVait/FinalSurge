package steps;

import io.qameta.allure.Step;
import pages.IntensityPage;

public class IntensitySteps {

    IntensityPage intensityPage;

    public IntensitySteps() {
        this.intensityPage = new IntensityPage();
    }

    @Step("Calculation intensity an result")
    public IntensitySteps resultIntensity(String hh, String mm, String ss) {
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .clickInDistanceButton()
                .enterTheTime(hh, mm, ss)
                .clickSaveButton()
                .outputOfTheRequiredResult();
        return this;
    }

    @Step("Error data intensity an result")
    public IntensitySteps errorResult(String hh, String mm, String ss,
                                      String errorText) {
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .clickInDistanceButton()
                .enterTheTime(hh, mm, ss)
                .clickSaveButton()
                .validateErrorText(errorText);
        return this;
    }
}
