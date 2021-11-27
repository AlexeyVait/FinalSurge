package tests;

import org.testng.annotations.Test;

public class PaceCalculatorTest extends BaseTest {

    @Test
    public void openCalcul() {
        loginPage
                .open()
                .login(user, password);
        pacecalculatoPage
                .openCalculators1()
                .paceCAL()
                .distance("12")
                .time("1", "15", "35")
                .paceCalculators1();
    }
}
