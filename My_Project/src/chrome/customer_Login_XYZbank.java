package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class customer_Login_XYZbank {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
		Select namelist= new Select(driver.findElement(By.id("userSelect")));
		namelist.selectByValue("2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[3]/button[2]")).click();
		String deposit="2000";
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(deposit);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[3]/button[3]")).click();
		String withdraw="2000";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(withdraw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).click();
		String depo=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
		if(deposit.equals(depo)) {
			System.out.println("Deposite success");
			driver.findElement(By.xpath("//button[text()='Back']")).click();
		}else {
			System.out.println("Deposite fail");
		}
//		driver.findElement(By.xpath("//button[text()='Back']")).click();
		driver.findElement(By.xpath("//div[1]/button[2]")).click();
		driver.findElement(By.xpath("//button[text()='Home']")).click();
		
		
	}
}
