import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Exercise11 {
    private static WebDriver driverChrome;
    @BeforeClass
    public static void runOnceBeforeClass()  {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://www.facebook.com/");
    }
    @Test
    public void test01() {
        WebElement we = driverChrome.findElement(By.xpath("//*[@id=\"email\"]"));
        we.sendKeys("user");
        WebElement we1 = driverChrome.findElement(By.xpath("//*[@id=\"pass\"]"));
        we1.sendKeys("password");
        we1.sendKeys(Keys.ENTER);
    }
}