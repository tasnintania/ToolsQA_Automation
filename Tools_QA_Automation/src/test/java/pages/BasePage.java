package pages;

import static utilities.DriverSetup.getDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	public class BasePage {
	

		//Locator Finding
		public static WebElement getElement(By locator) {
			return getDriver().findElement(locator);
			
		}
		
		//Click method
		
		public void clickOnelement (By locator) {
			getElement(locator).click();
		}
		
		//method for getText
		public static String getElementText(By locator) {
			return getElement(locator).getText();
			
		}
		
		//method writing TextOnElement
		public void writingTextOnElement(By locator,String text) {
			getElement(locator).sendKeys(text);
		}
		
		public void doAction() {
			Actions actions= new Actions(getDriver());
			actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
		}
		
		public void Action() {
			Actions actions= new Actions(getDriver());
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
				
	
}