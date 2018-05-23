import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigation {
	
	
	private WebDriver wd;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}

	@Test
	public void test() throws InterruptedException {
		wd= new ChromeDriver();
		wd.get("file:///C:/Users/pc/Downloads/QACinema/index.html");
		Thread.sleep(2000);
		
		WebElement carouselClick = wd.findElement(By.cssSelector("#demo > div > div.carousel-item.active > div > a"));
		carouselClick.click();
	}

}
