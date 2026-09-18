package part3_4.com.demoqa.base;

import com.demoqa.HomePage;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static utilities.utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected BasePage basePage;
    private String url = "https://demoqa.com";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
