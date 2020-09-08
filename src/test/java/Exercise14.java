import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Exercise14 {
    private static WebDriver driverChrome;
    @BeforeClass
    public static void runOnceBeforeClass()  {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");

        driverChrome = new ChromeDriver(options);

    }
    @Test
    public void test01() {




    }
}