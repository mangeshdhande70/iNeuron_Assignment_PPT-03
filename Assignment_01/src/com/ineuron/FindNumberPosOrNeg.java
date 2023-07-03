package com.ineuron;

import java.util.Scanner;

public class FindNumberPosOrNeg {
	
	
	public static void main(String[] args) 
    {
		try (Scanner scanner = new Scanner(System.in)) {
			int number= scanner.nextInt();
			
			if(number > 0)
			{
			    System.out.println(number+" is a positive number");
			}
			else if(number < 0)
			{
			    System.out.println(number+" is a negative number");
			}
			else
			{
			    System.out.println(number+" is neither positive nor negative");
			}
		}
    }
}
