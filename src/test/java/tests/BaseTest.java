package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import pages.*;
import steps.*;
import tests.base.TestListener;
import utils.PropertyReader;
import org.testng.annotations.BeforeMethod;

@Listeners(TestListener.class)

public class BaseTest {

    CalendarPage calendarPage;
    LoginPage loginPage;
    CaloricNeedsPage caloricNeedsPage;
    PaceCalculatorPage paceCalculatorPage;
    HansonsPage hansonsPage;
    IntensityPage intensityPage;
    McMillanPage mcMillanPage;
    PalladinoPage palladinoPage;
    TinmanPage tinmanPage;

    public LoginSteps loginSteps;
    public CalendarSteps calendarSteps;
    public CaloricNeedsSteps caloricNeedsSteps;
    public PaceCalculatorSteps paceCalculatorSteps;
    public HansonsSteps hansonsSteps;
    public IntensitySteps intensitySteps;
    public McMillanSteps mcMillanSteps;
    public PalladinoSteps palladinoSteps;
    public TinmanSteps tinmanSteps;

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
        paceCalculatorPage = new PaceCalculatorPage();
        hansonsPage = new HansonsPage();
        intensityPage = new IntensityPage();
        mcMillanPage = new McMillanPage();
        palladinoPage = new PalladinoPage();
        tinmanPage = new TinmanPage();
        calendarPage = new CalendarPage();
        loginSteps = new LoginSteps();
        calendarSteps = new CalendarSteps();
        caloricNeedsSteps = new CaloricNeedsSteps();
        paceCalculatorSteps = new PaceCalculatorSteps();
        hansonsSteps = new HansonsSteps();
        intensitySteps = new IntensitySteps();
        mcMillanSteps = new McMillanSteps();
        palladinoSteps = new PalladinoSteps();
        tinmanSteps = new TinmanSteps();


    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        Selenide.closeWebDriver();
    }
}
