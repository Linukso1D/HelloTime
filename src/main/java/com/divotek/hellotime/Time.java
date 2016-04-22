/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.hellotime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Check day state
 *
 * @author maxxl
 */
public class Time
{

   private Pattern pattern;
   private Matcher matcher;

   private static final String MORNING_TIME = "([0]?[6-8]):[0-5][0-9]";/* morning 06:00-8:59 */
   private static final String DAY_TIME = "([0]?[9]|[1]?[0-8]):[0-5][0-9]";/* day 09:00-18:59 */
   private static final String EVENING_TIME = "((19)|[2]?[0-2]):[0-5][0-9]";/* evening 19:00-22:59 */
   private static final String NIGHT_TIME = "((23)|([0]?[0-5])):[0-5][0-9]";/* night 23:00-05:59 */
   public Time()
   {

   }

   /**
    * Validator of the morning time format
    *
    * @param str - The line is subject to validation
    * @return valid time fromat(06:00-08:59), invalid time format
    */
   public boolean morning(final String str)
   {
	if(str != null)
	{
	   pattern = Pattern.compile(MORNING_TIME);
	   matcher = pattern.matcher(str);
	   return matcher.matches();
	}
	return false;
   }

   /**
    * Validator of the day time format
    *
    * @param str time address for validation
    * @return valid time fromat(09:00-18:59), invalid time format
    */
   public boolean day(final String str)
   {
	if(str != null)
	{
	   pattern = Pattern.compile(DAY_TIME);
	   matcher = pattern.matcher(str);
	   return matcher.matches();
	}
	return false;
   }

   /**
    * Validator of the evening time format
    *
    * @param str - The line is subject to validation
    * @return valid time fromat(19:00-22:59), invalid time format
    */
   public boolean evening(final String str)
   {
	if(str != null)
	{
	   pattern = Pattern.compile(EVENING_TIME);
	   matcher = pattern.matcher(str);
	   return matcher.matches();
	}
	return false;
   }

   /**
    * Validator of the night time format
    *
    * @param str - The line is subject to validation
    * @return valid time fromat(23:00-05:59), invalid time format
    */
   public boolean night(final String str)
   {
	if(str != null)
	{
	   pattern = Pattern.compile(NIGHT_TIME);
	   matcher = pattern.matcher(str);
	   return matcher.matches();
	}
	return false;
   }

   /**
    * Getter of current time
    *
    * @return String HH:mm
    */
   public static String currentTime()
   {
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm"); //11:27
	return dateFormat.format(new Date());
   }

}
