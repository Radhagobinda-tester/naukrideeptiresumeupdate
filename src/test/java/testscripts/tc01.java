package testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Genericlib.BaseClass;
import pomPages.Headline;
import pomPages.HomePage;
import pomPages.NaukriLoginPage;
import pomPages.PopupWindow;
@Test
public class tc01 extends BaseClass {


	public void tc01() throws IOException, InterruptedException {

		 NaukriLoginPage p = new NaukriLoginPage(driver);

	        p.loginBtn();

	        p.Emailtf(pdata.getPropertyfiledata("Email"));

	        p.passwordtf(pdata.getPropertyfiledata("Password"));

	        p.Submitbtn();
	        //Assert.assertTrue(p.Submitbtn().isDisplayed(), "Submit button is displayed");


	    HomePage pf = new HomePage(driver);
	    Thread.sleep(20000);
	     pf.profilebtn();

	     Headline h =new Headline(driver);
	     Thread.sleep(20000);
	     /*
	     try {
	            WebDriverDriverUtilies.alertPopup(driver);
	        } catch (Exception e) {
	            // Handle the exception here
	            e.printStackTrace(); // or log the exception
	        }
	        */
	     h.EditBtn();
	    PopupWindow headline = new  PopupWindow(driver);
	    headline.ClearText();
	    Thread.sleep(5000);
	    headline.TextField(pdata.getPropertyfiledata("Heading"));

	    Thread.sleep(10000);

	   headline.SubmitBtn();
	   Thread.sleep(10000);
	   Reporter.log(driver.getTitle(),true);
	   Thread.sleep(10000);
	}
}
