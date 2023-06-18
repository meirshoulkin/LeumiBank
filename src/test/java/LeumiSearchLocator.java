import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LeumiSearchLocator {

    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://www.leumi.co.il/");
    }

    @Test
    public void testMethodIvrit(){
        System.setProperty("file.encoding", "UTF-8");
       wd.findElement(By.xpath("//span[contains(text(),'פרטי')]"));
    }
    @AfterTest
    public void postcondition(){
        wd.quit();
    }

}
