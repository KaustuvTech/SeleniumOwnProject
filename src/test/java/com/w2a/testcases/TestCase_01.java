package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.base.SeleniumBase;

public class TestCase_01 extends SeleniumBase{
	
	@Test
	public void testCase01() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
