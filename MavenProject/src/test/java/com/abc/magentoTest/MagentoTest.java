package com.abc.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.magentoObjects.Home;
import com.abc.magentoObjects.Login;
import com.abc.magentoObjects.Logout;

public class MagentoTest {
     @Test
	public void credentials() {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
String url="http://www.magento.com";
driver.get(url);

Home h= new Home(driver);
h.ClickOnMyAcc();

Login l1= new Login(driver);
	l1.typeEmail("nitinmanjunath1991@gmail.com");
	l1.typePassword("Welcome123");
	l1.clickOnLogin();
	
Logout l2 = new Logout(driver);	
l2.ClickOnLogout();


driver.quit();
	}
	}

