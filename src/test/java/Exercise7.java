import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise7 {

    private static WebDriver driverChrome;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://www.amazon.com");

    }

    @Test
    public void test01() {
        String title = driverChrome.getTitle();
        System.out.println(title);

        Assert.assertEquals(title,driverChrome.getTitle());

        WebElement we = driverChrome.findElement(By.id("twotabsearchtextbox"));

        we.sendKeys("Leather shoes");
        we.sendKeys(Keys.ENTER);



    }
}