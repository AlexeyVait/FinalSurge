package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldBeAuthorization() {
        new LoginPage()
                .open()
                .login("5alexbulls5@gmail.com", "Alex51423324150");
    }

    @Test
    public void userShouldBeAuthorization2() {
        new LoginPage()
                .open()
                .password("5alexbulls5@gmail.com", "Alex51423324150");
    }

    @Test
    public void upShouldBeSetting() {
        new LoginPage()
                .open()
                .settings();
    }
}
