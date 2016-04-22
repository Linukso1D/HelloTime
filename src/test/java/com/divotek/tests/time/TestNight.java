/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.tests.time;

import com.divotek.hellotime.Time;
import org.junit.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Test validator of the night time format
 * @author maxxl
 */
@RunWith(Theories.class)
public class TestNight extends Assert
{
   private Time time;

   /**
    * DataProviders-->
    */
   @DataPoints(value = "nightTrue")
   public static String[] nightTrue =
   {
	"23:00", "00:00", "23:59", "00:42", "2:42"
   };
   @DataPoints(value = "nightFalse")
   public static String[] nightFalse =
   {
	"18:00", "06:00", "24:00", "08:00", null
   };

   /**
    * <--DataProviders
    */
   //---------------------------------------------------------------------------
   @BeforeClass
   public static void night()
   {
	System.out.println("-------------------- Night test --------------------");
   }
   @Before
   public void init()
   {
   this.time = new Time();
   }
   @Theory
   public void validNight(@FromDataPoints("nightTrue") String time)
   {
	boolean valid = this.time.night(time);
	System.out.println("Night is valid : " + time + " , " + valid);
	assertEquals(true, valid);
   }

   @Theory
   public void inValidNight(@FromDataPoints("nightFalse") String time)
   {
	boolean valid = this.time.night(time);
	System.out.println("Night is valid : " + time + " , " + valid);
	assertEquals(false, valid);
   }
   //---------------------------------------------------------------------------
}
