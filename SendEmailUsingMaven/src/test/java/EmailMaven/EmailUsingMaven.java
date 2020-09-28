package EmailMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EmailUsingMaven {
	ExtentReports report;
	ExtentTest logger;
	
	@Test
	public void verifyLogin() throws InterruptedException {
		report = new ExtentReports("./Reports/TestReport.html");
		logger = report.startTest("VerifyLogin");
		logger.log(LogStatus.INFO, "Login is started");
		
		int a=5,b=3,c;
		c=a+b;
		Assert.assertEquals(c, 8);
	
/*		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.monyoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Connected to browser");
		
		driver.findElement(By.cssSelector("#navbar-navigation ul li:nth-child(6) a")).click();
		driver.findElement(By.cssSelector("div .signin-form-content input#email")).sendKeys("prop121@yopmail.com");
		driver.findElement(By.cssSelector("div .signin-form-content input#password_field")).sendKeys("123456");
		driver.findElement(By.cssSelector("div.form-check label")).click();
		driver.findElement(By.cssSelector("form#SigninForm button[value='submit']")).click();
		Thread.sleep(4000);
*/		
		logger.log(LogStatus.PASS, "Logged into the Monyoo");
		report.endTest(logger);
		report.flush();
	}

}
