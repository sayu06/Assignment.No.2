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
import java.util.*;
public class SumEvenOdd 
{
    public static void main(String args[])
    {
        int num;
        int choice;
        int sumOdd = 0;
        int sumEven = 0;
        Scanner console = new Scanner(System.in);
        
        do
        {
        System.out.println("Enter positive integers =");
         num = console.nextInt();
        if(num % 2 == 0) 
        {
              sumEven += num;
        }
        else
        {
              sumOdd += num;
        }
        System.out.println("Do you want to continue yes/no ?");
        choice = console.next().charAt(0);
    }
    while(choice=='y' || choice=='Y');
    
    System.out.println("Sum of even numbers =" +sumEven);
    System.out.println("Sum of odd numebers =" +sumOdd);
}
    
}
/*Write a program to that reads the integers,and then prints the sum of the eveen and odd numbers.*/