package steps;

import io.qameta.allure.Step;
import pages.TinmanPage;

public class TinmanSteps {

    TinmanPage tinmanPage;

    public TinmanSteps() {
        this.tinmanPage = new TinmanPage();
    }

    @Step("")
    public TinmanSteps  enterYourMostRecentRaceTime(String hh, String mm, String ss) {
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

    @Step("")
    public TinmanSteps enterYourMostRecentRaceTimeError(String hh, String mm, String ss, String getError){
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
