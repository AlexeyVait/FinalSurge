package steps;

import io.qameta.allure.Step;
import pages.IntensityPage;

public class IntensitySteps {

    IntensityPage intensityPage;

    public IntensitySteps() {
        this.intensityPage = new IntensityPage();
    }

    @Step("Calculation intensity an result")
    public IntensitySteps resultIntensity(String ) {
        intensityPage
                .openWorkoutCalculators()
                .openChapterIntensity()
                .select()
                .eventTime("1", "44", "30")
                .intensitySaveButton()
                .testShouldBeOutputResults();
        return this;
    }
}
