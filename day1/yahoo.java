package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.org.apache.bcel.internal.generic.Select;


public class yahoo {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//WebDriver Driver = new FirefoxDriver();
//System.setProperty("webdriver.chrome.driver", "/path/chromedriver.exe");
WebDriver Driver =new FirefoxDriver();
Driver.manage().window().maximize();
Driver.get("http://banrspnd-w2k864/VD_157");
Thread.sleep(3000);
Driver.findElement(By.id("textfield-1044-inputEl")).sendKeys("Respond");
Driver.findElement(By.id("textfield-1045-inputEl")).sendKeys("P@ssw0rd");
//.sleep(5000);
//Driver.findElement(By.id("combo-1046-inputEl")).clear();
//Thread.sleep(5000);
//Driver.findElement(By.id("combo-1046-inputEl")).sendKeys("KM_FIN_157");
WebElement element = Driver.findElement(By.id("combo-1046-trigger-picker"));

/*Select dropdown = new Select(Driver.findElement(By.id("combo-1046-inputE1")));
dropdown.selectByVisibleText("KM_FIN_157");
dropdown.selectByIndex(1);*/

//=Driver.findElement(By.xpath("//div[@id='combo-1046-trigger-picker']")).click();
//Driver.findElement(By.id("combo-1046-trigger-picker")).click();



//Driver.wait(3000); 

//Driver.findElement(By.className("x-boundlist-item")).click();
//select.selectByVisibleText("KM_FIN_157");

Driver.findElement(By.id("toolbarbutton-1082")).click();
Driver.findElement(By.id("textfield-1064-inputEl")).sendKeys("00");
Driver.findElement(By.className("fa fa-arrow-circle-o-right")).click();
Thread.sleep(3000);



//Driver.findElement(By.id("box-1112")).click();
 //Driver.close();


	}

}
