package gmail;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Gmail {
		
		@Test
		public void chrometest() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranji\\OneDrive\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
					
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
		WebElement element =driver.findElement(By.id("login_Layer"));
		element.click();
		element =driver.findElement(By.name("email"));
		element.sendKeys("xxxxxxxxxx@gnmail.com");
		element =driver.findElement(By.name("PASSWORD"));
		element.sendKeys("xxxxxxxxxxxxx");
		element =driver.findElement(By.xpath("//button[@value='Login']"));
		element.click();
		
	Thread.sleep(10000);

	driver.quit();
		}

	}



