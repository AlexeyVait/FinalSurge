package tests;

import com.codeborne.selenide.Configuration;
import groovy.beans.PropertyReader;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    
    public String user;
    public String password;

    @BeforeMethod
    public void setup() {
        Configuration.baseUrl = "https://log.finalsurge.com/";
        user = System.getenv().getOrDefault("LOGIN",PropertyReader.("login_name"));
        password = System.getenv().getOrDefault("PASS",PropertyReader.("login_password"));
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.clickViaJs = false;
    }
}
