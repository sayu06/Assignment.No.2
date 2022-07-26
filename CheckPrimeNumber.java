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
public class CheckPrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number =");
        int num = sc.nextInt();
        if(num<1)
            System.out.println("Please enter a correct positive number ");
        else if(num == 2)
            System.out.println("It's is prime ");
        else if(num %2==0)
            System.out.println("It;s not a prime ");
                    
    }
}
/*write a program that prompts the user to input a positive integer.It should then output a messafe indicating whether the number is prime number.*/