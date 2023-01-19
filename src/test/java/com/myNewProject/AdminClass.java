package com.myNewProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AdminClass {

	@Test
	public void adminUse() {
		Reporter.log("Admin login success", true);
	}
}
