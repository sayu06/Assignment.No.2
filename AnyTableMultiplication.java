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
public class AnyTableMultiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sny positive integer = ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
           System.out.println(num + "*"+i+"=" +num*i);
        }
        
    }
}
/*Write a program thats prompts the user to input a positive integer.It should then print the multiplication table of that number.*/ 
