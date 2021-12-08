package steps;

import io.qameta.allure.Step;
import pages.McMillanPage;

public class McMillanSteps {

    McMillanPage mcMillanPage;

    public McMillanSteps() {
        this.mcMillanPage = new McMillanPage();
    }

    @Step()
    public McMillanSteps resultCalculator(String hh_time, String mm_time, String ss_time,
                                          String hh_optional, String mm_optional,
                                          String ss_optional) {
        mcMillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .indicateInEstimatedRunDistance()
                .indicateEstimatedTime(hh_time, mm_time, ss_time)
                .indicateInRunDistanceOptional()
                .indicateTimeOptional(hh_optional, mm_optional, ss_optional)
                .mcMillanSaveButton()
                .testShouldBeOutputResults();
        return this;
    }

    @Step()
    public McMillanSteps errorResult(String hh_time, String mm_time, String ss_time,
                                          String hh_optional, String mm_optional,
                                          String ss_optional, String getError) {
        mcMillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .indicateInEstimatedRunDistance()
                .indicateEstimatedTime(hh_time, mm_time, ss_time)
                .indicateInRunDistanceOptional()
                .indicateTimeOptional(hh_optional, mm_optional, ss_optional)
                .mcMillanSaveButton()
                .validateErrorText(getError);
        return this;
    }
}
