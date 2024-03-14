package BasicsofSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	public void Launch() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		driver.get("https://web.whatsapp.com/");
//		driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=games");
//		driver.navigate().refresh();
//		driver.navigate().forward();
//		driver.navigate().back();
		driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		
		FirstClass s=new FirstClass();
		s.Launch();
	

	}

}



