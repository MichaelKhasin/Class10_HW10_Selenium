import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Exercise6 {
    private static WebDriver driverFF;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.gecko.driver","E:\\QA_Automation_Java\\FireFoxDriver_win32\\geckodriver.exe");
        driverFF = new FirefoxDriver();
        driverFF.get("http://www.seleniumhq.org");
    }

    @Test
    public void test01() {
        WebElement id = driverFF.findElement(By.name("search"));
        System.out.println(id);

        id.sendKeys("selenium");
        id.sendKeys(Keys.ENTER);

    }
}