package Guru99;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
public class TestElementScreenshotUsingAshot {
public static void main(String[] args, Screenshot Screenshot, Screenshot screenshot) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();	

driver.get("http://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
		
// Find the element to take a screenshot

WebElement element = driver.findElement(By.xpath ("//*[@id=\"site-name\"]/a[1]/img"));

// Along with driver pass element also in takeScreenshot() method.

Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);

ImageIO.write(screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));
	}
}