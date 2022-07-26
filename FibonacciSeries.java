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
public class FibonacciSeries
{
    public static void main(String[] args) 
    {
        int n =5 , ft =2 , st=3 , nt;
        for(int i=1;i<=n;++i)
        {
            System.out.println(ft );
            nt = ft +st;
            ft = st;
            st = nt;
        }
        
    }
}
//ft = FirstTerm     st = Second term  nt = NextTerm
//find fibonacci numbers     

