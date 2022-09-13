package loginPagaes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage {
	//Step1 Declaration.
	@FindBy(xpath="//span[text()='DPG458']")private WebElement UID;
	
	//Step2 Initialization.
	public KiteHomepage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Step3 Implementation.
	public String verifyUID() {
		String actID=UID.getText();
		return actID;
	}

}
