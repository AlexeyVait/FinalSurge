package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import steps.*;
import tests.base.TestListener;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
@Log4j
@Log4j2

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

    WebDriver driver;
    WebDriverWait wait;

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

    @BeforeClass
    @Parameters("browser")
    public void initialization(String browser) {
        if (browser.equalsIgnoreCase("chrome_suite_one")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            driver = new ChromeDriver(options);
        }

        if (browser.equalsIgnoreCase("chrome_suite_two")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            driver = new ChromeDriver(options);
        }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 25);

            Configuration.baseUrl = PropertyReader.getProperty("finalsurge.url");
            user = PropertyReader.getProperty("finalsurge.user");
            password = PropertyReader.getProperty("finalsurge.pass");

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

        @AfterMethod(alwaysRun = true, description = "Close Browser")
        public void close() {
            Selenide.closeWebDriver();

    }
}
