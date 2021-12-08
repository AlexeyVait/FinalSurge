package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import pages.CalendarPage;
import pages.LoginPage;


@Log4j2
public class LoginSteps {

    LoginPage loginPage;
    CalendarPage calendarPage;


    public LoginSteps() {
        loginPage = new LoginPage();
        calendarPage = new CalendarPage();
    }

    @Step("Authorize with valid credentials: {username}, {password}")
    public LoginSteps correctLogin(String user, String password) {
        log.info("Authorize with invalid credentials: {}, {}", user, password);
        loginPage
                .open()
                .login(user, password);
        return this;
    }

    @Step("Authorize with invalid credentials: {username}, {password}")
    public LoginPage invalidLogin(String user, String password, String errorText) {
        log.info("Authorize with invalid credentials: {}, {}", user, password);
        loginPage
                .open()
                .error(user, password)
                .getError()
                .validateErrorText(errorText);
        return loginPage;
    }
}