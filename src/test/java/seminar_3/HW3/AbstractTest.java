package seminar_3.HW3;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AbstractTest {
    @BeforeEach
    void init() {
//        Configuration.remote = "https://localhost:4444/wd/hub";
////        Configuration.browser = "opera";
////        Configuration.browserVersion = "112";
//        Map<String, Object> options = new HashMap<>();
//        options.put("enableVNC", true);
//        options.put("enableLog", true);
//        Configuration.browserCapabilities.setCapability("selenoid:options", options);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Selenide.open("https://test-stand.gb.ru/login");
    }

    @AfterEach
    void close() {
        WebDriverRunner.closeWebDriver();
    }
}