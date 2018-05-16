package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class imdbtest {
	
	
	
	static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\test_automation\\lib\\drivers\\chromedriver.exe");
		navigateToPage("https://www.imdb.com/");
		validatePage();
	searchMovie("it");
	validetemovielink("it");
	ClicMovie("it");
	validateMovieYear("2017");
	closepage();
	}

	

	private static void validateMovieYear(String string) {
		// TODO Auto-generated method stub
		
	}



	private static void validetemovielink(String moviename) {
		if(driver.findElement(By.linkText(moviename)).isDisplayed()) {
			
			
		
		
		}
			
		
	}



	private static void validatePage() {
		// TODO Auto-generated method stub
		
	}



	private static void navigateToPage(String url) {
		WebDriver driver= new ChromeDriver();
		driver.get(url);
	}

	private static void searchMovie(String movieName) {
		WebElement searchfield = driver.findElement(By.name("q"));
		WebElement searchButton = driver.findElement(By.id("navbar-submit-button"));
		searchfield.clear();
		searchfield.sendKeys(movieName);
		searchButton.click();
		
		
	}

	private static void ClicMovie(String movieName) {
	//	List<WebElement> movieLinks = driver.findElements(By.);
		//WebElement SecondLink = movieLinks.get(1);
		
	}
	
	private static void closepage() {
		driver.quit();		
	}
}


