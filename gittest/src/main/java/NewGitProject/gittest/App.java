package NewGitProject.gittest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Driver object for chrome browser
		
		/* Class name = ChromeDriver,
				
				x driver = new x(); */
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com"); //getstring method 
		//System.out.println(driver.getTitle()); //Validate the title of landed page
		//System.out.println(driver.getCurrentUrl()); //To Print the landed website url
		// System.out.println(driver.getPageSource()); //Print pagesource 
		//driver.get("http://gmail.com"); // To land gmail page
		//driver.navigate().back(); //To navigate back to google page again from gmail
		//driver.navigate().forward();
		//driver.close();
		//driver.quit(); // It closes all the browsers which is opened by selenium script 
		//driver.get("http://facebook.com"); //Opens the url from chrome browser
		//driver.findElement(By.id("email")).sendKeys("hari_jenn@yahoo.co.in"); //To locate the email id field and enters character
		//driver.findElement(By.name("pass")).sendKeys("sureshmh"); //To locate the pwd field and enters character
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.className("uiButtonText")).click();	
		//driver.findElement(By.xpath("//*[@id=\'u_0_4\']")).click();
		
			
		
		//Salesforce website
		/*driver.get("http://salesforce.com"); //Opens the url from chrome browser
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari_jenn@yahoo.co.in"); //To locate the email id field and enters character
		driver.findElement(By.id("password")).sendKeys("sureshmh"); //To locate the pwd field and enters character
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());*/
		
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("hari_jenn@yahoo.co.in");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("suresh");
		//driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div._4rdf._53ij")).getText());
		
		
		
		
			
		
	}

}

