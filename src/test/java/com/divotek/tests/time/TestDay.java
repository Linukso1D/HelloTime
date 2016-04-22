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
 * Test validator of the day time format
 * @author maxxl
 */
@RunWith(Theories.class)
public class TestDay extends Assert
{
   private Time time;
   /**
    * DataProviders -->
    */
   @DataPoints(value = "dayTrue")
   public static String[] dayTrue =
   {
	"09:00", "9:59", "18:00", "18:02"
   };
   @DataPoints(value = "dayFalse")
   public static String[] dayFalse =
   {
	"19:00", "null", "25:00", "1400", null
   };

   /**
    * <--DataProviders
    */
   
   //---------------------------------------------------------------------------
   @BeforeClass
   public static void init()
   {
   System.out.println("\n\n\n-------------------- Day test --------------------\n\n\n");
   }
   @Before
   public void day()
   {
	this.time = new Time();
   }
   @Theory
   public void validDay(@FromDataPoints("dayTrue") String time)
   {
	boolean valid = this.time.day(time);
	System.out.println("Day is valid : " + time + " , " + valid);
	assertEquals(true, valid);
   }
   
   @Theory
   public void inValidDay(@FromDataPoints("dayFalse") String time)
   {
	boolean valid = this.time.day(time);
	System.out.println("Day is valid : " + time + " , " + valid);
	assertEquals(false, valid);
   }
   //---------------------------------------------------------------------------
   
}
