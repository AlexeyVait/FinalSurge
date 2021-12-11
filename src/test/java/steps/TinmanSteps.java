package steps;

import io.qameta.allure.Step;
import pages.TinmanPage;

public class TinmanSteps {

    TinmanPage tinmanPage;

    public TinmanSteps() {
        this.tinmanPage = new TinmanPage();
    }

    @Step("Entering data to calculate the race time")
    public TinmanSteps enterDataTheRaceTime(String hh, String mm, String ss) {
        tinmanPage
                .openWorkoutCalculators()
                .openChapterTinman()
                .indicateInRunDistance()
                .indicateTime(hh, mm, ss)
                .genderSelection()
                .tinmanSaveButton()
                .testShouldBeOutputResults();
        return this;
    }

    @Step("If the data is not filled in, we should get an error message")
    public TinmanSteps dataEntryError(String hh, String mm, String ss, String getError){
        tinmanPage
                .openWorkoutCalculators()
                .openChapterTinman()
                .indicateInRunDistance()
                .indicateTime(hh, mm , ss)
                .genderSelection()
                .tinmanSaveButton()
                .validateErrorText(getError);
        return this;
    }
}
