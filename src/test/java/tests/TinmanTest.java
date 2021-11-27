package tests;

import org.testng.annotations.Test;

public class TinmanTest extends BaseTest{

    @Test
    public void openCalcul() {
        loginPage
                .open()
                .login(user, password);
        tinmanPage
                .openCalcul()
                .openTinman()
                .Distance()
                .raceTime("2", "33", "45")
                .gender()
                .button();
    }
}
