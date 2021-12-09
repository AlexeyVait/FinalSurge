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
                .select()
                .eventTime(hh, mm, ss)
                .intensitySaveButton()
                .testShouldBeOutputResults();
        return this;
    }

    @Step("Error data intensity an result")
    public IntensitySteps errorResult(String hh, String mm, String ss,
                                      String errorText) {
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .select()
                .eventTime(hh, mm, ss)
                .intensitySaveButton()
                .validateErrorText(errorText);
        return this;
    }
}
