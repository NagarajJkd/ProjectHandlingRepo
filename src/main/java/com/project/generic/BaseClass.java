package com.project.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClass {

	@Test
	public void openBrowser() {
		Reporter.log("Opne the browser", true);
	}
	
	@Test
	public void closeBrowser() {
		Reporter.log("closed the browser", true);
	}

}
