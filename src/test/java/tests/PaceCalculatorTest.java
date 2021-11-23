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
                .iport("7")
                .paceCalculators1();
    }
}
