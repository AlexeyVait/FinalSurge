package steps;

import io.qameta.allure.Step;
import pages.CaloricNeedsPage;

public class CaloricNeedsSteps {

    CaloricNeedsPage caloricNeedsPage;

    public CaloricNeedsSteps() {
        this.caloricNeedsPage = new CaloricNeedsPage();
    }

    @Step("Calculation of results at caloric")
    public CaloricNeedsSteps calculationCaloric(String kg, String cm,
                                                String age, String dist) {
        caloricNeedsPage
                .openOtherCalculators()
                .indicateWeightInKilograms(kg)
                .indicateLengthInCentimeters(cm)
                .indicateAge(age)
                .genderSelection()
                .indicateInRunDistance(dist)
                .caloricSaveButton()
                .testShouldBeOutputResults();
        return this;
    }

    @Step("")
    public CaloricNeedsSteps errorResult (String kg, String cm,
                                          String age, String dist,
                                          String errorText) {
        caloricNeedsPage
                .openOtherCalculators()
                .indicateWeightInKilograms(kg)
                .indicateLengthInCentimeters(cm)
                .indicateAge(age)
                .genderSelection()
                .indicateInRunDistance(dist)
                .caloricSaveButton()
                .validateErrorText(errorText);
        return this;
    }
}
