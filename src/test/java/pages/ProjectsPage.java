package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    public ProjectsPage isOpened() {
        $("#icsw16-home").shouldBe(Condition.visible, Duration.ofSeconds(5));
        // исправить если что тайминг
        return this;
    }
}
