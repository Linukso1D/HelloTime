/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotel.tests;

import static com.divotek.hellotime.testclass.num;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author maxxl
 */
public class test extends Assert
{

   @DataProvider
   public Object[][] parseNumData()
   {
	return new Object[][]
	{
	   {
		"5", "5"
	   },
	   {
		"2", "2"
	   },
	};

   }

   @Test(dataProvider = "parseNumData")
   public void testNum(String locale, String expected)
   {
	final String actual = num(locale);
	assertEquals(actual, expected);
   }

}
