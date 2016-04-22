/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.tests.locale;

import com.divotek.hellotime.Facade;
import java.util.Locale;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testing of output time for russian and english localization.
 *
 * @author maxxl
 */
public class TestLocale extends Assert
{

   @BeforeClass
   public static void beforeClass()
   {
	System.out.println("\n\n\n-------------------- TestLocale --------------------- \n\n\n");
   }

   @Test
   public void localeDefault()
   {
	Facade fc = new Facade();
	fc.check();
   }

   @Test
   public void localeRU()
   {
	Facade fc = new Facade();
	fc.check();
	Locale.setDefault(new Locale("ru", "RU"));
   }

   @Test
   public void localeEN()
   {
	Facade fc = new Facade();
	fc.check();
	Locale.setDefault(new Locale("en", "EN"));
   }

   @AfterClass
   public static void afterClass()
   {
	System.out.println("\n\n\n-------------------- TestLocale end --------------------- \n\n\n");
   }

}
