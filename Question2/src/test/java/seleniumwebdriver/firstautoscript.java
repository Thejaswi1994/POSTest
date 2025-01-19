package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*test case
 Launch browser
 Open URL
 Validate title should be "Your store"
 Close browser
 */

public class POSMalaysia_task {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.pos.com.my/send/ratecalculator");
	
	driver.manage().window().maximize();
	
	WebElement postcodeInput = driver.findElement(By.xpath("//input[@formcontrolname='postcodeFrom']"));
    postcodeInput.sendKeys("35600");
    
    By inputBoxLocator = By.xpath("//input[@placeholder='Select country']");
  
    By optionLocator = By.xpath("//small[@title=\"India - IN\"]");

    try {
     
        WebElement inputBox = driver.findElement(inputBoxLocator);
        inputBox.clear();
        inputBox.sendKeys("India");

      
        Thread.sleep(3000);
        WebElement indiaOption = driver.findElement(optionLocator);
        indiaOption.click();
      
    
    WebElement Weight= driver.findElement(By.xpath("//input[@formcontrolname='itemWeight']"));
  Weight.sendKeys("1");
   
    
WebElement Calculatebutton = driver.findElement(By.xpath("//div/a[text()=' Calculate ']"));
   
   Calculatebutton.click();
   Thread.sleep(3000);
    
   By locator = By.xpath("//p[text()='Select a quote to start booking your shipment.']");
   String expectedText = "Select a quote to start booking your shipment.";

  
       WebElement element = driver.findElement(locator);

       String actualText = element.getText();

       Assert.assertEquals(actualText, expectedText, "Expect the text to match: " + expectedText);

   } catch (Exception e) {
     
       Assert.fail("Test failed due to exception: " + e.getMessage());
   } finally {
      
       driver.quit();
   }
}
	}



