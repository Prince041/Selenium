import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name = 'emailOrPhone' ]")).sendKeys("abcd");
		driver.findElement(By.name("fullName")).sendKeys("abcd");
		driver.findElement(By.name("username")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("abcd");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//button[.='Sign up']")).click();
		String t = driver.getTitle();
		System.out.println(t);
		String f = driver.getCurrentUrl();
		System.out.println(f);
		Thread.sleep(3000);
		driver.close();
	}
}
