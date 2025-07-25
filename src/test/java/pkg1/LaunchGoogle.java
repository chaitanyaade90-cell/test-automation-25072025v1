package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGoogle {


	@Test
	public void registerGmailUser() {


		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.get("https://github.com/chaitanyaade90-cell/test-automation-25072025v1");
		
		
		String s1=d.getTitle();
		System.out.println(s1);
		
		d.quit();
		
		

	}

}
