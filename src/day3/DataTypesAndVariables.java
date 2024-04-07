package day3;

import java.util.Scanner;

public class DataTypesAndVariables {
	
	public static void check1() {
	System.out.println ("Hello world");
}
	
	public void printmultiplestrings() {
		System.out.println("+++++++\r");
		System.out.println("@@@@@@\r");
		System.out.println("******\r");
		System.out.println("******\r");
			}
		
	public void displayvariable() {
		byte a = 10;
		float b= 20.3f;
		float c= 3.14785f;	
		System.out.println("value a, b, c is " + a + b + c );
		
	}
	
	public void displayboolean() {
		boolean a = true;
		a=false;
		
	System.out.println("boolean a = " + a);
	}
		
	public void convertFtoC() {
//		int f = 212;
		Scanner scan = new Scanner (System.in);System.out.println("input f: ");
				
		int f = scan.nextInt();
		
		float c = (f-32)/1.8f;
		System.out.println(f+ " degree Fahrenheit is equal to " + c+ " in Celsius");
	}
	
	
	public void convertinchtometer() {
		int inch = 1000;
		float met = inch/0.054f;
		System.out.println("met is" + met);
		
	}
}
