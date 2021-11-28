package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SettingsPage;

public class SettingsTest extends BaseTest {

    @Test
    public void shouldBeLanguageTranslation(){
        loginPage
                .open()
                .login(user, password);
        settingsPage
                .isOpened()
                .editSettings()
                .languageSelection();
    }
}
