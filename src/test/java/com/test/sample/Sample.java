package com.test.sample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.main.SampleMain.SampleMain;

public class Sample {
	@BeforeTest
	public void Beforetest() {
		System.out.println("Before ");
		//Assert.assertEquals(true, true);
	}

	@Test
	public void AtTest() {
		SampleMain sm = new SampleMain();
		int sum = sm.funSampleMain(2,2);
		System.out.println(sum);
		Assert.assertEquals(sum, 4);
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("Before ");
		//Assert.assertEquals(true, true);
	}

}
