package com.supermartket.test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ExcelReader;
import Utils.UniqueGenerator;

public class AddUsers extends BaseTest{
@Test
public void myadminTest() throws IOException {
	
	String userName= ExcelReader.getCellValue(1, 0)+UniqueGenerator.getRandomNumber();
	String password= ExcelReader.getCellValue(1, 1)+UniqueGenerator.getRandomNumber();
	String userType= ExcelReader.getCellValue(1, 2);
	lp.login();
	hp.navigateToAddUsers();
	admin.createAdminUsers(userName, password,userType);
	
	
	}
	
	
}
