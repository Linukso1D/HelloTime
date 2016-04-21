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
 * Time format validator evening
 * @author maxxl
 */
@RunWith(Theories.class)
public class TestEvening extends Assert
{
   private Time time;
   /**
    * DataProviders -->
    */
   @DataPoints(value = "eveningTrue")
   public static String[] eveningTrue =
   {
	"19:00", "22:59", "22:00", "20:42"
   };
   @DataPoints(value = "eveningFalse")
   public static String[] eveningFalse =
   {
	"18:00", "00:00", "23:00", "08:00", null
   };

   /**
    * <-- DataProviders
    */

   
   
   //---------------------------------------------------------------------------
 @BeforeClass
   public static void init()
   {
   System.out.println("-------------------- Evening test --------------------");
   }
   @Before
   public void evening()
   {
	this.time = new Time();
   }
   @Theory
   public void validEvening(@FromDataPoints("eveningTrue") String time)
   {
	boolean valid = this.time.evening(time);
	System.out.println("Evening is valid : " + time + " , " + valid);
	assertEquals(true, valid);
   }
   
   @Theory
   public void inValidEvening(@FromDataPoints("eveningFalse") String time)
   {
	boolean valid = this.time.evening(time);
	System.out.println("Evening is valid : " + time + " , " + valid);
	assertEquals(false, valid);
   }
   //---------------------------------------------------------------------------
}
