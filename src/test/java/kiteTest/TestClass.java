package kiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import loginPagaes.KiteHomepage;
import loginPagaes.Kitelogin1;
import loginPagaes.Kitelogin2;
import uitility.UitilityClass;

public class TestClass extends Baseclass{
	//declare all useful member as Global.
	Kitelogin1 login1;
	Kitelogin2 login2;
	KiteHomepage home;
		
		@BeforeClass
		public void openBrowser() {
			initilizeBrowser();
			
		//Crate object of POM Classes.
		
		login1=new Kitelogin1(driver);
		login2=new Kitelogin2(driver);
		home=new KiteHomepage(driver);
		}
		@BeforeMethod
		
		public void LoginToApllication() throws Throwable {
			//Enter User name.
			login1.EnterUN(UitilityClass.getTD(1, 0));
			System.out.println(UitilityClass.getTD(1, 0));
			//Enter Password.
			login1.EnterPWD(UitilityClass.getTD(1,1));
			System.out.println(UitilityClass.getTD(1,1));
			
			//Click on Login Button.
			login1.ClickLoginBtn();
			
			//Enter PIN.
			login2.EnterPIN(UitilityClass.getTD(1,2));
			
			//Click on Continue button.
			login2.ClickCtnBtn();
		}
		
		@Test
		public void verifyUID() throws Throwable {
		Reporter.log("Running verifyUserID",true);
		String actID = home.verifyUID();
		String expID = UitilityClass.getTD(1, 0);
		Assert.assertEquals(expID, actID,"Both are different TC is fail");

}
		@AfterMethod
		public void logoutToApplication() {
			Reporter.log("Logout to Appplication",true);
		}
		
		@AfterClass
		public void closeBrowser() {
			Reporter.log("Close Browser",true);
		}
}