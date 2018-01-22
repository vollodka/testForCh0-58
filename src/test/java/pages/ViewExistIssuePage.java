package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewExistIssuePage {
    private WebDriver webDriver;


    @FindBy(className = "md-button-content")
    public WebElement login;

    @FindBy(xpath = "/html/body/div[2]")
    public WebElement logoutArea;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li/button/div")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div[1]/div/div[1]/button/div/div/i")
    public WebElement backDown;

    @FindBy(xpath = "//*[@id=\"parent\"]/div[2]/img")
    public WebElement issueImg;

    @FindBy(xpath = "//*[@id=\"issueMap\"]")
    public WebElement isueMapArea;

    @FindBy(xpath = "//*[@id=\"button\"]/div/div")
    public WebElement openChatButton;

    @FindBy(xpath = "//*[@id=\"child\"]/a[1]/img")
    public WebElement likeButton;

    @FindBy(xpath = "//*[@id=\"child\"]/a[2]/img")
    public WebElement disLikeButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div[1]/div/div[2]/div[2]/button/div/div/i")
    public WebElement choseLeangueButton;

    public ViewExistIssuePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebDriver loginClick() throws IllegalStateException {
        login.click();
        return webDriver;
    }

    public WebDriver logOutButtonClick() throws IllegalStateException {
        if (logoutArea.isDisplayed()){
            logOutButton.click();
        }
        else {
            login.click();
            logOutButton.click();
        }
        return webDriver;
    }

    public WebDriver backDownClick() throws IllegalStateException {
        backDown.click();
        return webDriver;
    }

    public WebDriver issueImgClick() throws IllegalStateException {
        issueImg.click();
        return webDriver;
    }

    public WebDriver isueMapAreaClick() throws IllegalStateException {
        isueMapArea.click();
        return webDriver;
    }

    public WebDriver openChatButton() throws IllegalStateException {
        openChatButton.click();
        return webDriver;
    }

    public WebDriver likeButtonClick() throws IllegalStateException {
        likeButton.click();
        return webDriver;
    }

    public WebDriver disLikeButtonClick() throws IllegalStateException {
        disLikeButton.click();
        return webDriver;
    }

    public WebDriver choseLeangueButtonClick() throws IllegalStateException {
        choseLeangueButton.click();
        return webDriver;
    }


}
