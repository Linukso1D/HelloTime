/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.hellotime;

import static com.divotek.hellotime.LogWriter.LogWriter;

/**
 *
 * @author maxxl
 */
public class Main
{

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args)
   {
	LogWriter.init();
	LogWriter("AnyText");
	LogWriter.close();
	LogWriter.init();
	LogWriter("Teext");
   }
   
}
