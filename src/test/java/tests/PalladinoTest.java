package tests;

import org.testng.annotations.Test;


public class PalladinoTest extends BaseTest {

    @Test
    public void openCalcul() {
        loginPage
                .open()
                .login(user, password);
        palladinoPage
                .openCalcul()
                .openPalladino()
                .CP("115")
                .RWC("20")
                .button()
                .shortTest("5", "22", "55")
                .longTest("7", "33", "44")
                .button2()
                .raceTest("2", "24", "41")
                .raceAvgTest("58")
                .button3()
                .race2Test("8", "13", "47")
                .button4();


    }
}
