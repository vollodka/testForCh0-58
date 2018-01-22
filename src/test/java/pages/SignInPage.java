package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    private WebDriver webDriver;
    @FindBy(xpath = "//*[@id=\"authorization\"]/form/div/div[2]/button/div/div")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"authorization\"]/form/div/div[3]/button/div/div")
    private WebElement homeButton;

    @FindBy(xpath = "//*[@id=\"a-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"a-password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"authorization\"]/form/div/div[2]/div/div[1]/div/span")
    private WebElement loginErrorLabel;

    @FindBy(xpath = "//*[@id=\"authorization\"]/form/div/div[2]/div/div[2]/div/span")
    private WebElement passwordErrorLabel;

    public SignInPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebDriver inputLogin(String login) throws IllegalStateException {
        loginField.sendKeys(login);
        return webDriver;
    }

    public WebDriver inputPassword(String password) throws IllegalStateException {
        passwordField.sendKeys(password);
        return webDriver;
    }

    public WebDriver signInButtonClick(){
        signInButton.click();
        return webDriver;
    }




}
