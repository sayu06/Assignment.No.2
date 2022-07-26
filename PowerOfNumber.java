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
public class PowerOfNumber 
{
    public static void main(String args[])
    {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base of number = ");
        int base = sc.nextInt();
        System.out.println("Enter a exponent of number = ");
        int exp = sc.nextInt();
        for(int i=1;i<=exp;i++)
        {
            result *= base;
        }
         System.out.println("Result ="+result);

    }
}
/*Two numbers are entered through the keyboard.Write a program to find the value of one number raised to the power of another.*/