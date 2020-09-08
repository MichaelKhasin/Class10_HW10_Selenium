import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Exercise12 {
    private static WebDriver driverChrome;
    @BeforeClass
    public static void runOnceBeforeClass()  {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://dgotlieb.github.io/WebCalculator/");
    }
    @Test
    public void test01() {
        WebElement we = driverChrome.findElement(By.id("seven"));
        System.out.println(we.getRect().getX());
        System.out.println(we.getRect().getY());

        WebElement we1 = driverChrome.findElement(By.id("six"));
        System.out.println("Is displayed is " + we1.isDisplayed());

        String str = "7";
        WebElement myfive = driverChrome.findElement(By.id("five"));
        myfive.click();
        WebElement myadd = driverChrome.findElement(By.id("add"));
        myadd.click();
        WebElement mytwo = driverChrome.findElement(By.id("two"));
        mytwo.click();
        WebElement myequal = driverChrome.findElement(By.id("equal"));
        myequal.click();

        WebElement myscreen = driverChrome.findElement(By.id("screen"));
        Assert.assertEquals(str, myscreen.getText());

    }
}