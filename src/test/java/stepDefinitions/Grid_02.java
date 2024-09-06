package stepDefinitions;

import manage.DriverManage;
import org.testng.annotations.Test;

import static stepDefinitions.Grid_01.driver;

public class Grid_02 {

	DriverManage manage = new DriverManage();

	@Test
	void chromeGridExecution(){


		driver.get("https://www.youtube.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}



	@Test
	void firefoxGridExecution(){

		driver = manage.firefoxSetUpDriver();
		driver.get("https://www.youtube.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}






}
