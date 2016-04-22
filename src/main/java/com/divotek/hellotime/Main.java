/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.hellotime;

/**
 * Написать консольное приложение на java, с использованием maven.
 * Приложение должно выводить на экран приветственное сообщение, в зависимости от текущего времени суток.
 * Good morning, World! в 06:00 - 09:00
 * Good day, World! в 09:00 - 19:00
 * Good evening, World! в 19:00 - 23:00
 * Good night, World! в 23:00 - 06:00
​ * Код должен содержать все возможные юнит-тесты и создавать читабельный лог файл. // (хотя TestNG нарвится больше)
 * Выводящиеся на консоль сообщения должны быть получены из message resource и зависеть от системной локали пользователя.
 * Сделать перевод на русский язык.
 * В README должен присутствовать статус сборки от Travis CI
 * @author maxxl
 */
public class Main
{
   /**
    * @param args The command line arguments
    */
   public static void main(String[] args)
   {
	Facade fc = new Facade();
	fc.check();
   }

}
