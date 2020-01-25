package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Features.loginfeature;
import Generic.ExcelUtilities;
import Generic.baseLib;
import POM.Basepage;



public class logintest extends baseLib{
	
		@Test(priority=1, description="verify validlogin")
		public void validLogin() throws IOException, InterruptedException
		{
			
			ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
			String username = eu.readData("sheet1", 1, 1);
			String password= eu.readData("sheet1", 1, 2);
			loginfeature lf=new loginfeature(driver);
			lf.validlogin(username, password);

		}
		@Test(priority=2, description="verify invalidlogin")
		public void InvalidLogin() throws IOException, InterruptedException
		{
			

			ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
			String username = eu.readData("sheet1", 2, 1);
			System.out.println("Username is: "+username);
			String password = eu.readData("sheet1", 2, 2);
			System.out.println("Password is: "+password);
			loginfeature lf=new loginfeature(driver);
			lf.invalidlogin(username, password);
			

		}

}