package seminar_3;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageS3 {
        private final SelenideElement createNewPost = $(By.id("create-btn"));
        private final SelenideElement userButton = $x(
                "//li[@class='svelte-1rc85o5 mdc-menu-surface--anchor']/a");
        private final SelenideElement profileButton = $x("//ul[@role='menu']/li");

        public void createPostS3() {
            createNewPost.click();
        }

        public void openProfileS3() {
            userButton.shouldBe(visible).click();
            profileButton.shouldBe(visible).click();
        }
}
