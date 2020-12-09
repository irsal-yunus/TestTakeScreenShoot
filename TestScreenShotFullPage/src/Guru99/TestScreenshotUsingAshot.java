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

public class TestScreenshotUsingAshot {

public static void main(String[] args, Screenshot Screenshot, Screenshot screenshot) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();	

driver.get("http://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
		
Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

ImageIO.write(screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));
	
	}

}
