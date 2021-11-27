package tests;

import org.testng.annotations.Test;

public class CaloricNeedsTest extends BaseTest {

    @Test
    public void shouldBeToCalculateTheCaloriesOfAMan() {
        loginPage
                .open()
                .login(user, password);
        caloricNeedsPage
                .openCalculators()
                .indicateЕheWeightInKg("86")
                .indicateРeightInСentimeters("178")
                .indicateInAgeMan("25")
                .indicateInRunDistance("10")
                .CaloricButton();
    }
}
