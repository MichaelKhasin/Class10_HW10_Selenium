import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise2 {
    private static WebDriver driverChrome;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://www.walla.co.il");

    }

    @Test
    public void test01() {
        String title = driverChrome.getTitle();
        System.out.println(title);

        driverChrome.navigate().refresh();

        Assert.assertEquals(title,driverChrome.getTitle());

    }
}