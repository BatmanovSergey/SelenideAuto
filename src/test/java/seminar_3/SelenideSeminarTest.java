package seminar_3;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.page;

public class SelenideSeminarTest {

    @BeforeEach
    void init() {
        Selenide.open("https://test-stand.gb.ru/login");
    }

    @Test
    void profileTest () {
        LoginPageS3 loginPageS3 = page(LoginPageS3.class);
        loginPageS3.loginInSystemS3("GB202306611b512", "a5c6730434");

        Selenide.sleep(2000L);

        MainPageS3 mainPageS3 = Selenide.page(MainPageS3.class);
        mainPageS3.openProfileS3();

        Selenide.sleep(2000L);

        ProfilePageS3 profilePageS3 = Selenide.page(ProfilePageS3.class);
        Assertions.assertEquals(profilePageS3.getFullNameTextS3(),profilePageS3.getH2FullNameTextS3());
    }

    @AfterEach
    void close() {
        WebDriverRunner.closeWebDriver();
    }
}
