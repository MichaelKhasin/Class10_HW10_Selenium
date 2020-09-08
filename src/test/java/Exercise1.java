import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise1 {
    private static WebDriver driverChrome;
    private static WebDriver driverFF;


    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://www.walla.co.il");

        System.setProperty("webdriver.gecko.driver","E:\\QA_Automation_Java\\FireFoxDriver_win32\\geckodriver.exe");
        driverFF = new FirefoxDriver();
        driverFF.get("https://www.ynet.co.il");

    }

    @Test
    public void test01() {

    }
}