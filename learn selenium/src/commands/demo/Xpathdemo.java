package commands.demo;


public class Xpathdemo 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.navigate().to("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	    
	     driver.findElement(By.xpath("//a[contains(text(),'webTable')]//parent::li//preceding-sibiling::li[1]//child::a[contains(text(),'Register')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'webTable')]//parent::li//preceding-sibiling::li[1]//child::a[contains(text(),'Register')]")).click();


}
}
