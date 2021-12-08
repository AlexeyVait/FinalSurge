package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import pages.*;
import steps.CalendarSteps;
import steps.CaloricNeedsSteps;
import steps.LoginSteps;
import utils.PropertyReader;
import org.testng.annotations.BeforeMethod;


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

    public LoginSteps loginSteps;
    public CalendarSteps calendarSteps;
    public CaloricNeedsSteps caloricNeedsSteps;

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


        loginPage = new LoginPage();
        caloricNeedsPage = new CaloricNeedsPage();
        pacecalculatoPage = new PaceCalculatorPage();
        hansonsPage = new HansonsPage();
        intensityPage = new IntensityPage();
        mcmillanPage = new McMillanPage();
        palladinoPage = new PalladinoPage();
        tinmanPage = new TinmanPage();
        calendarPage = new CalendarPage();
        loginSteps = new LoginSteps();
        calendarSteps = new CalendarSteps();
        caloricNeedsSteps = new CaloricNeedsSteps();


    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        Selenide.closeWebDriver();
    }
}
