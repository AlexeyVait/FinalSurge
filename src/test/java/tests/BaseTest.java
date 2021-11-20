package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import pages.LoginPage;
import pages.SettingsPage;
import utils.PropertyReader;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public WebDriver driver;
    LoginPage loginPage;
    SettingsPage settingsPage;
    
    public String user;
    public String password;

    @BeforeMethod(alwaysRun = true)
    public void setup(@Optional("chrome") String browser) {
        Configuration.baseUrl = PropertyReader.getProperty("finalsurge.url");
        user = PropertyReader.getProperty("finalsurge.user");
        password = PropertyReader.getProperty("finalsurge.pass");
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.clickViaJs = false;


        loginPage = new LoginPage(driver);
        settingsPage = new SettingsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        Selenide.closeWebDriver();
    }
}
