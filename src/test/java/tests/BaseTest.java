package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import pages.*;
import utils.PropertyReader;
import org.testng.annotations.BeforeMethod;

@Listeners(tests.base.TestListener.class)

public class BaseTest {

    CalendarPage calendarPage;
    LoginPage loginPage;
    CaloricNeedsPage caloricNeedsPage;
    PaceCalculatorPage pacecalculatoPage;
    HansonsPage hansonsPage;
    IntensityPage intensityPage;
    McMillanPage mcmillanPage;
    PalladinoPage palladinoPage;
    TinmanPage tinmanPage;
    WebDriver driver;

    public String user;
    public String password;

    @BeforeMethod(alwaysRun = true)
    public void setup(@Optional("chrome") String browser, ITestContext context) {
        context.setAttribute("driver", driver);
        Configuration.baseUrl = PropertyReader.getProperty("finalsurge.url");
        user = PropertyReader.getProperty("finalsurge.user");
        password = PropertyReader.getProperty("finalsurge.pass");
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.clickViaJs = false;


        loginPage = new LoginPage();
        caloricNeedsPage = new CaloricNeedsPage();
        pacecalculatoPage = new PaceCalculatorPage();
        hansonsPage = new HansonsPage();
        intensityPage = new IntensityPage();
        mcmillanPage = new McMillanPage();
        palladinoPage = new PalladinoPage();
        tinmanPage = new TinmanPage();
        calendarPage = new CalendarPage();

    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        Selenide.closeWebDriver();
    }
}
