import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class Exercise10 {
    private static WebDriver driverChrome;
    @BeforeClass
    public static void runOnceBeforeClass()  {
        System.setProperty("webdriver.chrome.driver" , "E:\\QA_Automation_Java\\chromedriver_win32\\ChromeDriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://dgotlieb.github.io/Controllers/");
    }
    @Test
    public void test01() {
        WebElement we = driverChrome.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/input[3]"));
        we.click();

        Select sel1 = new Select (driverChrome.findElement(By.tagName("select")));
        sel1.selectByValue("Milk");
        List<WebElement> list = sel1.getOptions();
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).getText());
        }
    }
}