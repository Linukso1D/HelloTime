/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.tests.time;

import com.divotek.hellotime.Time;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Test validator of the morning time format
 * @author maxxl
 */
@RunWith(Theories.class)
public class TestMorning extends Assert
{
   private Time time;
   /**
    * DataProviders -->
    */
   @DataPoints(value = "morningTrue")
   public static String[] morningTrue =
   {
	"06:00", "6:32", "7:55", "8:59"
   };
   @DataPoints(value = "morningFalse")
   public static String[] morningFalse =
   {
	"05:59", "24:00", "19:00", "9:00", "7:60", "08:-20", "null", null
   };

   /**
    * <-- DataProviders
    */
   
   
   //---------------------------------------------------------------------------
  @BeforeClass
   public static void init()
   {
   System.out.println("\n\n\n-------------------- Morning test --------------------\n\n\n");
   }
   @Before
   public void morning()
   {
	this.time = new Time();
   }
   @Theory
   public void validMorning(@FromDataPoints("morningTrue") String time)
   {
	boolean valid = this.time.morning(time);
	System.out.println("Morning is valid : " + time + " , " + valid);
	assertEquals(true, valid);
   }
   @Theory
   public void inValidMorning(@FromDataPoints("morningFalse") String time)
   {
	boolean valid = this.time.morning(time);
	System.out.println("Morning is valid : " + time + " , " + valid);
	assertEquals(false, valid);
   }
   //---------------------------------------------------------------------------
}
