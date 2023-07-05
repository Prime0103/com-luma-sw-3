package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class WomenTest extends Utility
{
    String baseUrl = "https://tutorialsninja.com/demo/index.php";
    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException
    {
        //Mouse Hover on Women Menu
        mouseHoverToElement(By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]"));
        // Mouse Hover on Tops
        mouseHoverToElement(By.xpath("//a[@id='ui-id-9']//span[text()='Tops']"));
        // Click on Jackets
        clickOnElement(By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));
        //Select Sort By filter “Product Name”
        clickOnElement(By.xpath("//div[2]//div[3]//select[1]"));
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(By.xpath("//div[2]//div[3]//select[1]"),"Product Name");
        Thread.sleep(1000);
        String expectedText =("\n" + "Product Name ");
        String actualText = getTextFromElement(By.xpath("//div[2]//div[3]//select[1]"));
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException
    {
        // Mouse Hover on Women Menu
        mouseHoverToElement(By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]"));
        // Mouse Hover on Tops
        mouseHoverToElement(By.xpath("//a[@id='ui-id-9']//span[text()='Tops']"));
        // Click on Jackets
        clickOnElement(By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));
        clickOnElement(By.xpath("//div[2]//div[3]//select[1]"));
        Thread.sleep(1000);
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("//div[2]//div[3]//select[1]"),"Price");
        // Verify the products price display in Low to High
        // String expectedMessage = "Low to High";
        // String actualMessage = getTextFromElement(By.xpath("//select[@id='sorter']"));
        // Assert.assertEquals(expectedMessage,actualMessage)
    }
    @After
    public void tearDown()
    {
        //Close the Browser
        driver.quit();
    }

}
