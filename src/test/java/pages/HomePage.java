package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    protected WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div[1]/div/div[2]/a/div")
    public WebElement login;

    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[7]/button/div")
    public WebElement findYourLocation;

    @FindBy(xpath = "//*[@id=\"pac-input\"]")
    public WebElement enterLocation;

    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[10]/div[1]/div[1]")
    public WebElement buttonViewMapStreets;

    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[2]")
    public WebElement buttonGoogleMap;

    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[9]/div/div/button[1]")
    public WebElement buttonInGoogleMap;

    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[9]/div/div/button[2]")
    public WebElement buttonOutGoogleMap;

    @FindBy(xpath = "/html/body/div[6]")
    public WebElement listLocationsGoogleMap;


    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[10]/div[2]/div[1]")
    public WebElement buttonViewMapSatellite;

    @FindBy(xpath = "//*[@id=\"googlemap\"]/div/div/div[1]/div[2]")
    public WebElement mapArea;

    @FindBy(xpath = "//*[@id=\"title\"]")
    public WebElement titleField;

    @FindBy(xpath = "//*[@id=\"desc\"]")
    public WebElement descriptionField;

    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[3]/div")
    public WebElement typeButton;

    @FindBy(className =" md-list-item-text")
    public WebElement typeButtonproblem;

    @FindBy(xpath = "//*[@id=\"md-select-menu-0941f4d6\"]/li[2]/button/div/span")
    public WebElement typeButtoninfo;

    @FindBy(xpath = "//*[@id=\"md-select-menu-rhyfropk9\"]/li[3]/button/div/span")
    public WebElement typeButtonFeedBack;


    @FindBy(xpath = "//*[@id=\"save\"]/div/div")
    public WebElement createButton;


    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;

    }

    public WebDriver inputTitleField(String title) throws IllegalStateException {
//        WebElement element = (new WebDriverWait(webDriver, 10))
//                .until(ExpectedConditions.elementToBeClickable(titleField));
//        WebElement findIssue = webDriver.findElement(By.xpath());
//        Boolean visible = titleField.isDisplayed();
        titleField.sendKeys(title);
        return webDriver;
    }




    //        @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]/div/i/svg")
//    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]")
//    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]/div")
//    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]/label") is not clickable
//    @FindBy(className = "md-file")
//    @FindBy(className = "md-icon md-icon-font md-icon-image md-theme-default")
    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]/div/input[1]")
//    @FindBy(xpath = "//*[@id=\"uploadImage\"]")
//    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]/div/i")
//    @FindBy(className = "md-input")
//    @FindBy(className = "md-ripple md-list-item-content")
//    @FindBy(xpath = "//*[@id=\"uploadImage\"]")
//    @FindBy(css = "#myForm > div > div.md-card-content > div.md-field.md-theme-default.md-has-file > div > input.md-input")
//    @FindBy(xpath = "//*[@id=\"myForm\"]/div/div[2]/div[4]/div/input[1]")
    public WebElement addImageButton;

    public WebDriver inputDescriptionField(String description) throws IllegalStateException {
//        WebElement element = (new WebDriverWait(webDriver, 10))
//                .until(ExpectedConditions.visibilityOf(descriptionField));
        System.out.println(descriptionField.isEnabled());
        descriptionField.sendKeys(description);
        return webDriver;
    }

    public WebDriver typeButtonClick() throws IllegalStateException {
        typeButton.click();
        return webDriver;
    }

    public WebDriver typeButtonproblemClick() throws IllegalStateException {
        typeButtonproblem.click();
        return webDriver;
    }

    public WebDriver typeButtonFeedBackClick() throws IllegalStateException {
        typeButtonFeedBack.click();
        return webDriver;
    }

    public WebDriver addImageButtonClick() throws IllegalStateException {
        addImageButton.click();
        return webDriver;
    }

    public WebDriver typeButtoninfoClick() throws IllegalStateException {
        createButton.click();
        return webDriver;
    }



    public SignInPage loginClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.login.click();
        return new SignInPage(webDriver);
    }

    public WebDriver findYourLocationClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.findYourLocation.click();
        return webDriver;
    }

    public WebDriver enterLocationClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.enterLocation.click();
        return webDriver;
    }

    public WebDriver buttonViewMapStreetsClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.buttonViewMapStreets.click();
        return webDriver;
    }

    public WebDriver buttonGoogleMapClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.buttonGoogleMap.click();
        return webDriver;
    }

    public WebDriver buttonInGoogleMapClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.buttonInGoogleMap.click();
        return webDriver;
    }

    public WebDriver buttonbuttonOutGoogleMap() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.buttonOutGoogleMap.click();
        return webDriver;
    }

    public WebDriver listLocationsGoogleMapClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.buttonViewMapSatellite.click();
        return webDriver;
    }

    public WebDriver buttonViewMapSatelliteClick() throws IllegalStateException {
        HomePage homePage = new HomePage(webDriver);
        homePage.buttonViewMapSatellite.click();
        return webDriver;
    }


}
