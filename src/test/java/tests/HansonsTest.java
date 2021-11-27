package tests;

import org.testng.annotations.Test;

public class HansonsTest extends BaseTest {

    @Test
    public void openCalcul() {
        loginPage
                .open()
                .login(user, password);
        hansonsPage
                .openCalcul()
                .openHansons()
                .distance("10")
                .time("1", "22", "54")
                .optional("38", "40", "18")
                .button();

    }
}
