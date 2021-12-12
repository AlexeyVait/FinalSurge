package steps;

import io.qameta.allure.Step;
import pages.McMillanPage;

public class McMillanSteps {

    McMillanPage mcMillanPage;

    public McMillanSteps() {
        this.mcMillanPage = new McMillanPage();
    }

    @Step("Filling in values for data output")
    public McMillanSteps resultCalculator(String hh_time, String mm_time, String ss_time,
                                          String hh_optional, String mm_optional,
                                          String ss_optional) {
        mcMillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .clickInDistance()
                .interDataInEstimatedTime(hh_time, mm_time, ss_time)
                .enterInRunDistanceOptional()
                .enterDataInTimeOptional(hh_optional, mm_optional, ss_optional)
                .mcMillanSaveButton()
                .buttonOnOutputResults();
        return this;
    }

    @Step("Filling in values with error text")
    public McMillanSteps errorResult(String hh_time, String mm_time, String ss_time,
                                          String hh_optional, String mm_optional,
                                          String ss_optional, String getError) {
        mcMillanPage
                .openWorkoutCalculators()
                .openChapterMcMillan()
                .clickInDistance()
                .interDataInEstimatedTime(hh_time, mm_time, ss_time)
                .enterInRunDistanceOptional()
                .enterDataInTimeOptional(hh_optional, mm_optional, ss_optional)
                .mcMillanSaveButton()
                .validateErrorText(getError);
        return this;
    }
}
