import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {
    public static void main(String[] args) {
        // Specify the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Flipkart's website
        driver.get("https://www.flipkart.com");

        // Close any login/signup popup (if present)
        WebElement closePopup = driver.findElement(By.cssSelector("._2KpZ6l._2doB4z"));
        if (closePopup.isDisplayed()) {
            closePopup.click();
        }

        // Find the search bar and input the product you want to search for
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Your Product Name");
        searchBox.submit();

        // Wait for search results to load (you might need to use explicit waits here)
        // Click on the first search result (assuming it's the product you want)
        WebElement firstResult = driver.findElement(By.cssSelector("div._1AtVbE a"));
        firstResult.click();

        // Add the product to the cart
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addToCartButton.click();

        // Proceed with the checkout process (this would involve multiple steps and might require more automation)

        // Remember to clean up and close the WebDriver instance when done
        driver.quit();
    }
}
