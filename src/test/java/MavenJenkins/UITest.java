package MavenJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UITest {
  @Test
  public void OpenURL() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mvnrepository.com/");
	  Thread.sleep(5000);
	  driver.quit();
  }
}
