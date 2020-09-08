import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Exercise9 {
    private static WebDriver driverChrome;
    @BeforeClass
    public static void runOnceBeforeClass()  {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://www.youtube.com");
    }
    @Test
    public void test01() {
        WebElement we = driverChrome.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input"));
        we.click();
        we.sendKeys("Tears Clean Bandit");
        we = driverChrome.findElement(By.id("search-icon-legacy"));
        we.click();
    }
}