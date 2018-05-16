package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class imdb {

	public static void main{
		System.setProperty("webdriver.chrome.driver","C:\\test_automation\\lib\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDrive();
		driver.get("https://www.imdb.com/"); // ingresar el lin de la pagina que deseas ingresar 
		WebElement searchTxt = driver.findElement();
				
		WebElement searchButton = driver.findElement();
		SearchTxt.clean();
		SearchTxt.sendKey("Matrix");
		
		SearchButton.clean();
		SearchButton.click();
		WebElement link
		
		driver.quit(); // cerrar navegador
	}
}
