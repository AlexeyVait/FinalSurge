package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import pages.OtherCalculatorsPages.CaloricNeedsPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
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
        $(welcomeHome_CSS).shouldBe(Condition.visible, Duration.ofSeconds(5));
        // исправить если что тайминг
        return this;
    }


    public LoginPage login(String user, String pass) {
        $(USERNAME_CSS).sendKeys(user);
        $(PASSWORD_CSS).sendKeys(pass);
        $(LOGIN_SUBMIT_CSS).submit();
        return this.isOpened();
    }

    public LoginPage erorr(String user, String pass) {
        $(USERNAME_CSS).sendKeys(user);
        $(PASSWORD_CSS).sendKeys(pass);
        $(LOGIN_SUBMIT_CSS).submit();
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
