import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ivopetrov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");

        driver.findElement(By.id("last-name")).sendKeys("Petrov");

        driver.findElement(By.id("job-title")).sendKeys("QA");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("se-radio-button-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("12/28/2022");

        driver.findElement(By.cssSelector(".btn-primary")).click();

        driver.quit();
    }
}
