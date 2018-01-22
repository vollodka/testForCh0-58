package testpages;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import setting.SettingTest;

public class SignInPageTest extends SettingTest {

    public static final String LOGIN = "Vovka1";
    public static final String PASSWORD = "Aspirine!1";
    public static final String TITLE_FIELD = "zavod kvartc";
    public static final String DESCRIPTION = "soft-serve company it has been";

    @org.testng.annotations.Test
    public void autorizate() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.loginClick();
        pages.SignInPage signInPage = new pages.SignInPage(webDriver);
        signInPage.inputLogin(LOGIN);
        signInPage.inputPassword(PASSWORD);
        signInPage.signInButtonClick();

    }

    @Test
    public void createNewIssue() throws Exception {
        HomePage homePage = new HomePage(webDriver);
//        homePage.loginClick();
//        pages.SignInPageTest signInPage = new pages.SignInPageTest(webDriver);
//        signInPage.inputLogin(LOGIN);
//        signInPage.inputPassword(PASSWORD);
//        signInPage.signInButtonClick();
        Actions actions = new Actions(webDriver);
        homePage.mapArea.click();
//        actions.doubleClick(homePage.mapArea).perform();
//        homePage.inputTitleField(TITLE_FIELD);
//        homePage.inputDescriptionField(DESCRIPTION);
////        homePage.addImageButton.click();
//        homePage.typeButton.click();
//        homePage.typeButtonproblemClick();
//        webDriver.get("http://localhost:8081/#/issue/14");
//        ViewExistIssuePage viewExistIssuePage = new ViewExistIssuePage(webDriver);
//        viewExistIssuePage.login.click();
//        viewExistIssuePage.logOutButton.click();

    }
}
