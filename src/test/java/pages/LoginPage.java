package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import utils.AllureUtils;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

@Log4j2
public class LoginPage {

    public static final String USERNAME_CSS = "#login_name";
    public static final String PASSWORD_CSS = "#login_password";
    public static final String LOGIN_SUBMIT_CSS = "#login_password";
    public static final String errorTextLocator_CSS = "//div[contains(@class, 'alert alert-error')]";
    public static final String welcomeHome_CSS = "[class=user-info]";


    public LoginPage open() {
        log.info("Open");
        Selenide.open("login.cshtml");
        return this;
    }


    @Step("Login using credentials: '{user}' and '{pass}'")
    public LoginPage login(String user, String pass) {
        log.info("Login");
        $(USERNAME_CSS).sendKeys(user);
        $(PASSWORD_CSS).sendKeys(pass);
        $(LOGIN_SUBMIT_CSS).submit();
        return this;
    }

    public LoginPage error(String user, String password) {
        log.info("Error");
        login(user, password);
        return this;
    }

    public LoginPage getError() {
        log.info("Get error");
        $x(errorTextLocator_CSS).shouldBe(visible);
        return this;
    }

    public String getErrorText() {
        log.info("Get error text");
        return $x(errorTextLocator_CSS).getText();
    }


    public LoginPage validateErrorText(String errorText) {
        log.info("Validate error text");
        Assert.assertEquals(getErrorText(), errorText, "Invalid login credentials. Please try again.");
        return this;
    }
}
