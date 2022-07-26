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
public class ReverseNumber
{
    public static void main(String ar̥gs[])
    {
        
        int reversenum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyer a number =");
        int num=sc.nextInt();
        for(;num !=0;)
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num %10;
            num = num/10;
        }
        System.out.println("Reverse ="+reversenum);
    }
}
/*Write a program that prompts the user to input an integer and then ouputs the number with the digits reversed. 
For example , if the input is 12345 , the outpit should be 54321.
*/