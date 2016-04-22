/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.hellotime;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Logger JUL
 *
 * @author maxxl
 */
public class LogWriter
{
  
   private static Logger logger;
   private static FileHandler fh;
   private static boolean active;

   private LogWriter()
   {
   }

   ;
   static
   {
	active = false;
   }

   /**
    * 
    * @return Active log file
    */
  public static synchronized boolean init()
   {
	if(!active)
	{
	   try
	   {
		fh = new FileHandler("./log.txt");
		logger = Logger.getLogger("LogWriter");
		fh.setEncoding("UTF-8");
		logger.addHandler(fh);
		fh.setFormatter(new SimpleFormatter());
		logger.info("Init log");
		return active = true;

	   }
	   catch (IOException | SecurityException ex)
	   {
		return active;
	   }
	}
	return active;
   }

   /**
    * Data cleaning (close FileHandler & logger)
    * @return Log status
    */
   public static boolean close()
   {
	logger = null;
	fh = null;
	active = false;
	return active;
   }
/**
 * @param msg log message
 */
   public static void LogWriter(String msg)
   {
	if(active)
	{
	   logger.info(msg);

	}
   }
/**
 * @param msg Log message
 * @param status Returns true in case matcher has successfully identified time {@link Time} 
 * 
 */
   public static boolean LogWriter(String msg, boolean status)
   {
	if(active)
	{
	   logger.info(msg+status);
	}
	return status;
   }
/**
 * @param msg Log message
 * @param ex log exception
 */
   public static void LogWriter(String msg, Exception ex)
   {
	if(active)
	{
	   logger.severe(msg + "\n  Exceprion: " + ex);
	}
   }

}
