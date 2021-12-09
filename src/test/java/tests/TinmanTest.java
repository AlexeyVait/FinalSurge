package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TinmanTest extends BaseTest{

    @Test(description = "Result for Tinman test")
    @Description()
    public void shouldBeToCalculateTheTinman() {
        loginSteps
                .correctLogin(user, password);
        tinmanSteps
                .enterYourMostRecentRaceTime("2", "32", "11");
    }

    @Test(enabled = false, description = "Error entering values for Tinman test")
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
