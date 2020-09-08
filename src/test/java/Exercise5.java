import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise5 {
    private static WebDriver driverFF;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.gecko.driver","E:\\QA_Automation_Java\\FireFoxDriver_win32\\geckodriver.exe");
        driverFF = new FirefoxDriver();
        driverFF.get("https://www.youtube.com");

    }

    @Test
    public void test01() {
        WebElement id = driverFF.findElement(By.id("search-icon-legacy"));
        System.out.println(id);

    }
}