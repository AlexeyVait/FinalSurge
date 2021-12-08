package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.testng.Assert;
import utils.AllureUtils;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class LoginPage {

    public static final String USERNAME_CSS = "#login_name";
    public static final String PASSWORD_CSS = "#login_password";
    public static final String LOGIN_SUBMIT_CSS = "#login_password";
    public static final String errorTextLocator_CSS = "//div[contains(@class, 'alert alert-error')]";
    public static final String welcomeHome_CSS = "[class=user-info]";


    public LoginPage open() {
        Selenide.open("login.cshtml");
        return this;
    }

    public LoginPage isOpened() {
        $(welcomeHome_CSS).shouldBe(visible, Duration.ofSeconds(5));
        // исправить если что тайминг
        return this;
    }

    @Step("Login using credentials: '{user}' and '{pass}'")
    public LoginPage login(String user, String pass) {
        $(USERNAME_CSS).sendKeys(user);
        $(PASSWORD_CSS).sendKeys(pass);
        $(LOGIN_SUBMIT_CSS).submit();
        return this;
    }

    public CalendarPage isSelectionDay(String user, String password) {
        login(user, password);
        return new CalendarPage().selectionDay();
    }

    public LoginPage error(String user, String password) {
        login(user, password);
        return this;
    }

    public LoginPage getError() {
        $x(errorTextLocator_CSS).shouldBe(visible);
        return this;
    }

    public String getErrorText() {
        return $x(errorTextLocator_CSS).getText();
    }


    public LoginPage validateErrorText(String errorText) {
        Assert.assertEquals(getErrorText(), errorText, "Invalid login credentials. Please try again.");
        return this;
    }
}
