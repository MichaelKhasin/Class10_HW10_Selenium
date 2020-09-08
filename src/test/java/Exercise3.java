import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise3 {

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
        String url = driverChrome.getCurrentUrl();
        System.out.println(url);



        Assert.assertEquals(title,driverChrome.getTitle());
        Assert.assertEquals(url,driverChrome.getCurrentUrl());

    }
}
