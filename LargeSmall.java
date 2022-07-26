/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sayali
 */
import java.util.Scanner;
public class LargeSmall 
{
    public static void main(String args[])
    { 
         Scanner console = new Scanner(System.in);
         
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         char choice;
         do
         {
             System.out.println("Emter a anumber =");
             int num = console.nextInt();
             if(num > max)
             {
                 max = num;
             }
             if(num < min)
             {
                 min = num;
             }
             System.out.println("Do you want to eneter more numbers y/n?");
             choice = console.next().charAt(0);
         }
         while(choice=='y' || choice=='Y');
         System.out.println("Largest number = " +max);
         System.out.println("Smallest number = " +min);
    }
}
/*Write a program eneter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered*/