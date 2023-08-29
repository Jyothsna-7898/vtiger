package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// Stored all the WebElements of Contact page.
public class ContactsPage {

	        //Declaration
			@FindBy(xpath="//img[@alt='Create Contact...']")
			private WebElement plusButton;
			
			//Initialization
			public ContactsPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Utilization
			public void clickPlusButton()
			{
				plusButton.click();
			}
}
