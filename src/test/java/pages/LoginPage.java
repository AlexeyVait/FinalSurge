package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage open () {
        Selenide.open("login.cshtml");
        return this;
    }

    public ProjectsPage login (String user, String pass) {
        $("#login_name").sendKeys(user);
        $("#login_password").sendKeys(pass);
        $("#login_remember").click();
        $("#login_password").submit();
        return new ProjectsPage().isOpened();
    }

    public ProjectsPage password (String user, String pass) {
        $("#login_name").sendKeys(user);
        $("#login_password").sendKeys(pass);
        $("#login_remember").click();
        $("#login_password").submit();
        return new ProjectsPage().isOpened();
    }

    public ProjectsPage settings () {
        $("#UserProfile.cshtml").click();

        return new ProjectsPage().isOpened();
    }
}
