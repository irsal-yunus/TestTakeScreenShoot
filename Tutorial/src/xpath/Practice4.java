package xpath;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.sjavac.CopyFile;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		TakesScreenshot ss=((TakesScreenshot)driver);
		CopyFile sr=ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new CopyFile("c://pic1.png"));
	}

}
