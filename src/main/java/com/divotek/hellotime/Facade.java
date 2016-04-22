/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.hellotime;

/**
 *
 * @author maxxl
 */
public class Facade
{

   /**
    * lang
    */
   private Locales locale;
   private Time time;
   private String timeFormat;
   

   public Facade()
   {
	LogWriter.init();
	locale = new Locales();
	time = new Time();
	timeFormat = Time.currentTime();
   }
   
   /**
   * Check current time with matcher
   */
   @Deprecated
   public void check()
   {
	
	LogWriter.LogWriter
	(
		   com.divotek.hellotime.R.R.Text.NOW					   +
		   timeFormat
	);
	sayHelloTime
	(
		   com.divotek.hellotime.R.R.Text.MORNING					   ,
		   LogWriter.LogWriter
		   (
				com.divotek.hellotime.R.R.Text.CHECK			   +
				com.divotek.hellotime.R.R.Text.MORNING			   ,
				time.morning(timeFormat)
		   )
	);
	sayHelloTime
	(
	   com.divotek.hellotime.R.R.Text.DAY						   ,	
	   LogWriter.LogWriter
	   (
			com.divotek.hellotime.R.R.Text.CHECK				   +
			com.divotek.hellotime.R.R.Text.DAY					   ,
			time.day(timeFormat)
	   )
	);
	sayHelloTime
	(
	   com.divotek.hellotime.R.R.Text.EVENING,
	   LogWriter.LogWriter
	   (
			com.divotek.hellotime.R.R.Text.CHECK				   +
			com.divotek.hellotime.R.R.Text.EVENING				   ,
			time.evening(timeFormat)
	   )
	);
	sayHelloTime
	(
	   com.divotek.hellotime.R.R.Text.NIGHT						   ,
	   LogWriter.LogWriter
	   (
			com.divotek.hellotime.R.R.Text.CHECK				   +
			com.divotek.hellotime.R.R.Text.NIGHT				   ,
			time.night(timeFormat)
	   )
	);
   }
   
   
   
   
   /**
    *	Say hello
    * @param status  - shows if it is true
    * @param query - key to ResourceBandle
    */
   @Deprecated
   public void sayHelloTime(String query,boolean status)
   {
    if(status)
    {
	LogWriter.LogWriter
	(
	   locale.getLang().getString(query)
	);
    }
   }
		
   

}
