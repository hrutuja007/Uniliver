package sili;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) 
	{

	
			{
				WebDriver driver = new FirefoxDriver();
				//driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
				driver.manage().window().maximize();
				driver.get("http://www.google.com/");

		   }
	}
}