package setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SettingTest {

    protected static WebDriver webDriver;

    @BeforeSuite
    public static void setUpProperty() {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/test/java/resources/google.properties");
            property.load(fis);

            String nameSelenium = property.getProperty("selenium.name");
            String adressSelenium = property.getProperty("selenium.adress");

            System.setProperty(nameSelenium, adressSelenium);
//            System.setProperty("webdriver.chrome.driver", "C:/Users/vkozytc/Desktop/untitled/src/test/java/resources/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://localhost:8081");
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсутствует!");
        }
    }

    @BeforeTest
    public void setUp(){
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeChrome(){
//        webDriver.close();
    }

}
