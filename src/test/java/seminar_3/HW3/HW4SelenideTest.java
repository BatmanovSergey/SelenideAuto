package seminar_3.HW3;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import seminar_3.LoginPageS3;
import seminar_3.ProfilePageS3;
import seminar_3.StudentPageS3;

import static com.codeborne.selenide.Selenide.page;

public class HW4SelenideTest extends AbstractTest {
    @Test // Домашняя работа 4: задание 2
    void changeBirthDayInProfileSelenideTest () {

        LoginPageS3 loginPageS3 = page(LoginPageS3.class);
        loginPageS3.loginInSystemS3("GB202306611b512", "a5c6730434");

        StudentPageS3 studentPageS3 = page(StudentPageS3.class);
        studentPageS3.openProfileS3();

        ProfilePageS3 profilePageS3 = page(ProfilePageS3.class);
        profilePageS3.clickEditProfileS3();
        profilePageS3.uploadnewBirthDayDateS3("01.01.2001");
        profilePageS3.clickSaveProfileUpdateDataS3();
        profilePageS3.clickCloseWidowEditingProfileS3();

        Assertions.assertEquals("01.01.2001",profilePageS3.getDayOfBirthTextS3());
        Selenide.sleep(5000L);
    }
}
