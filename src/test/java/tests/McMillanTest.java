package tests;

import org.testng.annotations.Test;

public class McMillanTest extends BaseTest {

    @Test
    public void openCalcul() {
        loginPage
                .open()
                .login(user, password);
        mcmillanPage
                .openCalcul()
                .openMcMillan()
                .distance()
                .time("1", "27", "15")
                .distance2()
                .time2("2", "13", "55")
                .button();
    }
}
