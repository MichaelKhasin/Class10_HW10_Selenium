import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise4 {

    private static WebDriver driverChrome;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://translate.google.com");

    }

    @Test
    public void test01() {
        System.out.println(driverChrome.findElement(By.id("source")));
        System.out.println(driverChrome.findElement(By.tagName("textarea")));


    }
}