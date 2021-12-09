package steps;

import io.qameta.allure.Step;
import pages.PaceCalculatorPage;

public class PaceCalculatorSteps {

    PaceCalculatorPage paceCalculatorPage;

    public PaceCalculatorSteps() {
        this.paceCalculatorPage = new PaceCalculatorPage();
    }

    @Step()
    public PaceCalculatorSteps resultPaceCalculator(String Dist, String hh,
                                                    String min, String sek) {
        paceCalculatorPage
                .openOtherCalculators()
                .openChapterPace()
                .indicateInRunDistance(Dist)
                .indicateTime(hh, min, sek)
                .paceSaveButton()
                .testShouldBeOutputResults();
        return this;
    }

    @Step()
    public PaceCalculatorSteps errorResult(String Dist, String hh,
                                           String min, String sek,
                                           String errorText) {
        paceCalculatorPage
                .openOtherCalculators()
                .openChapterPace()
                .indicateInRunDistance(Dist)
                .indicateTime(hh, min, sek)
                .paceSaveButton()
                .validateErrorText(errorText);
        return this;
    }
}
