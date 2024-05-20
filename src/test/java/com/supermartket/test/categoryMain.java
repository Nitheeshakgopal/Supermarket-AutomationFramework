package com.supermartket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class categoryMain extends BaseTest {
	@Test
public void verfityCategoryMainPage() throws IOException, AWTException {
	lp.login();
	hp.navigateTocategoryPage();
	mc.addCategoryMainPage();
	
	
	
	
}
}
