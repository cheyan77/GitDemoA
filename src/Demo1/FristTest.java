package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//测试更新代码上传svn
//再次修改哈哈哈哈
//xiixixixi
public class FristTest {
	
	private WebDriver driver;
	private String projectpath=System.getProperty("user.dir");
	
	@BeforeClass
	public void start(){
		//driver = new FirefoxDriver();
		System.getProperty("Webdriver.chorm.driver", projectpath+"/tools/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void testha(){
		driver.get("https://www.baidu.com/");
	}

	@AfterClass
	public void stop(){
		driver.quit();
	}
}
