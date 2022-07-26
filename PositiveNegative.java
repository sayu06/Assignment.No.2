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
public class PositiveNegative 
{
    public static void main(String args[])
    {
    Scanner console = new Scanner(System.in);
         int num,
            countPositive = 0,
            countNegative = 0,
            countZero = 0;
         char choice;
         do
         {
             System.out.println("Emter a anumber =");
             num = console.nextInt();
             if(num > 0)
             {
                 countPositive++;
             }
             else if (num < 0)
             {
                 countNegative++;
             }
             else 
             {
                 countZero++;
             }
             System.out.println("Do you want to eneter more numbers y/n?");
             choice = console.next().charAt(0);
         }
         while(choice=='y' || choice=='Y');
         System.out.println("Positive number = " +countPositive++);
         System.out.println("Negative number = " +countNegative++);
         System.out.println("Negative number = " +countZero++);
    }
}
/*Write a program to enter the numbers till the users wants and at end the program should display the count of positive,negative and zeros entered.*/