import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class instructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver_chrome_driver", "/home/salmankhan/Downloads/chrome_driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		String parentWindow=it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());



	}

}
