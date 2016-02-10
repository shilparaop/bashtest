package com.cucumber;


import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class BaseTest {
	BaseMain base = new BaseMain();
     
	
	@Before
	public void setUp() throws IOException {
		base.openBrowser();
	}

	@After
	public void tearDown() {
		base.closeBrowser();
	}

}
