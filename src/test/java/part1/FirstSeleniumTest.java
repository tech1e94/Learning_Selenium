package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);
        String actualResult = driver.findElement(By.className("post-title")).getText();
        String expectedResult = "Logged In Successfully";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
