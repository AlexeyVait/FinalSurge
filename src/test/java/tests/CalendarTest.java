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

//    @Test
//    @Description()
//    public void calenarTestDobavlenie() {
//        loginSteps
//                .correctLogin(user, password);
//        calendarSteps
//                .addingAWorkout("Hill running","Running workout","13",
//                        "1","20","35","17","1","55","22",
//                        "Was a very hard running workout","20","18")
//                .updatingThisWorkout("22","70","110","150","2800")
//                .weather("35","55")
//                .addingAWarmUp("3","00","22","35")
//                .addCooling("2","00","15","25")
//                .addModifiedWorkout()
//                .deleteWorkout();
//    }
//
//    @Test
//    @Description()
//    public void calenarTestDobavlenie() {
//        loginSteps
//                .correctLogin(user, password);
//        calendarSteps
//                .addingAWorkout("Hill running","Running workout","13",
//                        "1","20","35","17","1","55","22",
//                        "Was a very hard running workout","20","18")
//                .updatingThisWorkout("22","70","110","150","2800")
//                .weather("35","55")
//                .addingAWarmUp("3","00","22","35")
//                .addCooling("2","00","15","25")
//                .addModifiedWorkout()
//                .deleteWorkout();
//    }
}
