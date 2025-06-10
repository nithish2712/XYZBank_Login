package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bankmanager_Login {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Nithish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Lingala");
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("505001");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//button[@class='btn btn-lg tab'])[1]")).click();
		driver.findElement(By.id("userSelect")).click();
		Select namelist = new Select(driver.findElement(By.id("userSelect")));
		namelist.selectByValue("6");
		Select rupee=new Select(driver.findElement(By.id("currency")));
		rupee.selectByVisibleText("Rupee");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@ng-click='showCust()']")).click();
		//Select namedelete=new Select(driver.findElement(By.xpath("//input[@placeholder='Search Customer']")))
		//driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("Nithish");
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Delete'])[6]")).click();
        driver.findElement(By.xpath("//button[text()='Home']")).click();	
	}

}
