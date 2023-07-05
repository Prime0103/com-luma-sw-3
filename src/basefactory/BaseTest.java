package basefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest
{
    public static WebDriver driver;

    public void openBrowser(String baseurl){
        //open the browser
        driver = new ChromeDriver();

        //launch the browser
        driver.get(baseurl);

        //Maximise the window
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser(){
        //close the browser
        driver.quit();
    }
}
