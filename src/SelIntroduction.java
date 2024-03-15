import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//Invoke Chrome browser
		WebDriver driver = new ChromeDriver();			 //creating object
		//WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");	 //get() method to hit ulr in chrome
		System.out.println(driver.getTitle()); 			 //printing the title of the web page that open by hitting the ulr
		driver.close(); //closes the current window or main window that ulr hits.
	}

}
