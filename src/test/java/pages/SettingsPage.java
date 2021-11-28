package pages;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class SettingsPage {

    public static final String SETTINGS_BUTTON = "//ul[@class='unstyled']//a";
    public static final String EDIT_SETTINGS_BUTTON = "//a[@href='UserProfile.cshtml?edit=s#settings']//div";
    public static final String LANGUAGE_RUS_BUTTON = "#feffc33d-42f4-4a9f-b13d-ca330654bc7b";
    public static final String LANGUAGE_ENG_BUTTON = "#bcda30bd-3c85-46ac-992a-ee98d4f55323";
    public static final String SAVE_BUTTON = "#saveButtonSettings";

    public SettingsPage isOpened() {
        $x(SETTINGS_BUTTON).click();
        return this;
    }

    public SettingsPage editSettings() {
        $x(EDIT_SETTINGS_BUTTON).click();
        return this;
    }

    public SettingsPage saveChanges() {
        $(SAVE_BUTTON).click();
        return this;
    }

    String ENG = LANGUAGE_ENG_BUTTON;
    String RUS = LANGUAGE_RUS_BUTTON;

    public SettingsPage languageSelection() {
        String ENG = LANGUAGE_ENG_BUTTON;
        String RUS = LANGUAGE_RUS_BUTTON;
        try {
            if (RUS != null) {
                $(LANGUAGE_ENG_BUTTON).click();
            }
            if (ENG != null) {
                $(LANGUAGE_RUS_BUTTON).click();
            }
        } catch (Exception ignored) {}
        return new SettingsPage().saveChanges();
    }
}

