import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class FirstTestCase {




        @Test
        public void firstTest() throws InterruptedException{
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Filip.Todorovic\\Vezbanje\\src\\main\\resources\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

            driver.get("http://www.shop.demoqa.com");

            System.out.println("Successfully opened the website www.Store.Demoqa.com");

            Thread.sleep(5000);

            driver.quit();
        }



}
