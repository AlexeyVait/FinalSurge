package tests;

import org.testng.annotations.Test;

public class IntensityTest extends BaseTest {

    @Test
    public void openCalcul() {
        loginPage
                .open()
                .login(user, password);
        intensityPage
                .openCalcul()
                .openIntensity()
                .select()
                .eventTime("1", "44", "30")
                .calButton();
    }
}
