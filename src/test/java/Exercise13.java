import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Exercise13 {
    private static WebDriver driverChrome;
    @BeforeClass
    public static void runOnceBeforeClass()  {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://dgotlieb.github.io/WebCalculator/");
    }
    @Test
    public void test01() {
        WebElement we = driverChrome.findElement(By.id("two"));
        System.out.println(we.getRect().getHeight());

        WebElement we1 = driverChrome.findElement(By.id("six"));
        System.out.println(we1.getRect().getWidth());



    }
}