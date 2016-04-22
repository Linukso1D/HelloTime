/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.tests.locale;

import java.util.Locale;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author maxxl
 */
public class TestLocale extends Assert
{
   
   @BeforeClass
   public static void beforeClass()
   {
   System.out.println("-------------------- TestLocale ---------------------");
   Locale.setDefault(new Locale("es", "ES"));
   }
}
