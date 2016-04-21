/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.tests.logger;
import com.divotek.hellotime.LogWriter;
import static com.divotek.hellotime.LogWriter.*;
import javax.swing.UnsupportedLookAndFeelException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author maxxl
 */

public class TestLogWriter extends Assert
{
   @BeforeClass
   public static void before()
   {
	System.out.println("------------------- Test Log-----------------------");
   }
   @Test
   public void logWriter()
   {
   	assertTrue(LogWriter.init());
	LogWriter("First message");
	assertTrue(LogWriter.init());
	LogWriter("Second message");
	assertTrue(LogWriter.init());
	assertFalse(LogWriter.close());
	LogWriter("Close writer");
	assertTrue(LogWriter.init());
	LogWriter("Message Exc",new UnsupportedLookAndFeelException("Where is my look and feel"));
	
   }
   
}
