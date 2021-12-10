package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CalendarTest extends BaseTest {

    @Test
    @Description()
    public void calenarTestDobavlenie() {
        loginSteps
                .correctLogin(user, password);
        calendarSteps
                .addingAWorkout("Hill running","Running workout","13",
                        "1","20","35","17","1","55","22",
                        "Was a very hard running workout","20","18")
                .updatingThisWorkout("22","70","110","150","2800")
                .weather("35","55")
                .addingAWarmUp("3","00","22","35")
                .addCooling("2","00","15","25")
                .addModifiedWorkout()
                .deleteWorkout();
    }

    @Test(description = "Error valid min HH")
    @Description()
    public void errorValidMinHH() {
        loginSteps
                .correctLogin(user, password);
        calendarSteps
                .addingAWorkout("Hill running","Running workout","13",
                        "1","20","35","17","1","55","22",
                        "Was a very hard running workout","20","18")
                .updatingThisWorkout("22","301","110","110","2800")
                .errorForMinHR("×\n" +
                        "Please fix the following errors:\n" +
                        "*Minimum Heartrate cannot be greater than 300.");
    }

    @Test(description = "Error valid max HH")
    @Description()
    public void errorValidMaxHH() {
        loginSteps
                .correctLogin(user, password);
        calendarSteps
                .addingAWorkout("Hill running","Running workout","13",
                        "1","20","35","17","1","55","22",
                        "Was a very hard running workout","20","18")
                .updatingThisWorkout("22","70","70","301","2800")
                .errorForMaxHR("×\n" +
                        "Please fix the following errors:\n" +
                        "*Maximum Heartrate cannot be greater than 300.");
    }

    @Test(description = "Error valid avg HH")
    @Description()
    public void errorValidAgHH() {
        loginSteps
                .correctLogin(user, password);
        calendarSteps
                .addingAWorkout("Hill running","Running workout","13",
                        "1","20","35","17","1","55","22",
                        "Was a very hard running workout","20","18")
                .updatingThisWorkout("22","70","301","150","2800")
                .errorForAvgHR("×\n" +
                        "Please fix the following errors:\n" +
                        "*Average Heartrate cannot be greater than 300.");
    }
}
