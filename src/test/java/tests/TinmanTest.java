package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TinmanTest extends BaseTest{


    @Test(description = "The correct result during the calculation of the data")
    @Description()
    public void correctInputOfValidData() {
        loginSteps
                .correctLogin(user, password);
        tinmanSteps
                .enterYourMostRecentRaceTime("2", "32", "11");
    }

    @Test(enabled = false, description = "Error result if we do not enter data")
    @Description()
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        tinmanSteps
                .enterYourMostRecentRaceTimeError("","","","\"×\\n\" +\n" +
                        "                        \"Please fix the following errors:\\n\" +\n" +
                        "                        \"*Please enter an Integer value for Minutes.\"");
    }
}
