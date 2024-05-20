package com.supermartket.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.UniqueGenerator;

public class CreateDeliveryBoy extends BaseTest{
	@Test(dataProvider="getData")
	public void verifyUserIsAbleToCreateMultipleDeliveryBoys(String nameVal,String usernameVal,String passwordVal) throws InterruptedException, IOException {
		lp.login();
		hp.navigateToManageDeilveryBoy();
		dboy.navigateToDeliveryBoyPage(nameVal, usernameVal, passwordVal);
	}
     @DataProvider
    public String[][] getData() {
	String[][] data = new String[2][3];
	data[0][0]= UniqueGenerator.getUniqueString("Obsqura");
	data[0][1]=UniqueGenerator.getUniqueString("Obsqura")+UniqueGenerator.getRandomNumber();
	data[0][2]= UniqueGenerator.getUniqueString("mypassword");
	
	data[1][0]= UniqueGenerator.getUniqueString("Obsqura");
	data[1][1]= "Niteesha"+ UniqueGenerator.getRandomNumber();
	data[1][2]= UniqueGenerator.getUniqueString("mypassword");

	return data;
     } 
     }
    