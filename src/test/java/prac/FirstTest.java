package prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\Acer\\Documents\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("email")).sendKeys("San");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.id("submit")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("error"))
        );

        System.out.println("Error message: " + errorMsg.getText());
         driver.findElement(By.cssSelector("#signup")).click();
         driver.findElement(By.cssSelector("#firstName")).sendKeys("San");
         driver.findElement(By.cssSelector("input[placeholder = 'Last Name']")).sendKeys("Shende");
         driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("San@gmail.com");
         driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("Pass@123");
         driver.findElement(By.xpath("//button[@type = 'submit']")).click();
//		System.out.println(driver.getTitle());
		Thread.sleep(60000);
		driver.quit();
	}

}
