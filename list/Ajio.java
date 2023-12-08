package list;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='gender']")).click();
		//driver.findElement(By.xpath("//span[text()='gender']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		driver.findElement(By.xpath("//span[text()='category']")).click();
		driver.findElement(By.xpath("//span[text()='category']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		String count = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("the count of the items found :"+count);
		List<WebElement> list = driver.findElements(By.tagName("li"));
		int size=list.size();
		System.out.println("Number of Brands :"+size);
		
		List<WebElement> list2 = driver.findElements(By.xpath("(//div[@class='facet-body'])[2]"));
		int size2 = list2.size();
		for (int i = 0; i < list2.size(); i++) {
			String text = list2.get(i).getText();
			System.out.println(text);
			
			
		}
		

	}}


