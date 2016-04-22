/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.hellotime;

import java.util.ResourceBundle;
import java.util.Locale;

/**
 * 
 * @author maxxl
 */
public class Locales  
{
   ResourceBundle lang;

   public Locales()
   {
   this.lang = ResourceBundle.getBundle("locale", Locale.getDefault());
   }
   /**
    *
    * @return System default localization
    */
   public ResourceBundle getLang()
   {
	return lang;
   }
   
   
}
