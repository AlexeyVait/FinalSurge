package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class SettingsPage {

    public static final String SETTINGS_RUS_BUTTON = "//*[contains(text(), 'Настройки')]";
    public static final String SETTINGS_ENG_BUTTON = "//*[contains(text(), 'Settings')]";
    public static final String EDIT_SETTINGS_RUS_BUTTON = "//*[contains(text(), 'Редактировать настройки')]";
    public static final String EDIT_SETTINGS_ENG_BUTTON = "//*[contains(text(), 'Edit settings')]";
    public static final String LANGUAGE_RUS_BUTTON = "#feffc33d-42f4-4a9f-b13d-ca330654bc7b";
    public static final String LANGUAGE_ENG_BUTTON = "#bcda30bd-3c85-46ac-992a-ee98d4f55323";
    public static final String SAVE_BUTTON = "input[name~=btnSubmitSettings]";

    public SettingsPage(WebDriver driver){
    }

    public SettingsPage isOpened(String Settings) {
        switch (Settings) {
            case "RUS": {
            $x(SETTINGS_RUS_BUTTON).click();
            break;
            }
            case "ENG": {
            $x(SETTINGS_ENG_BUTTON).click();
            break;
            }
        }
        return this;
    }

    public SettingsPage editSettings(String Edit) {
        switch (Edit) {
            case "RUS": {
                $x(EDIT_SETTINGS_RUS_BUTTON).click();
                break;
            }
            case "ENG": {
                $x(EDIT_SETTINGS_ENG_BUTTON).click();
                break;
            }
        }
        return this;
    }

    public SettingsPage languageSelection(String Language) {
        switch (Language) {
            case "RUS": {
                $(LANGUAGE_RUS_BUTTON).click();
                break;
            }
            case "ENG": {
                $(LANGUAGE_ENG_BUTTON).click();
                break;
            }
        }
        return this;
    }

        public SettingsPage saveChanges() {
        $(SAVE_BUTTON).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }
}
