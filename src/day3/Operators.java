package day3;

import java.util.Scanner;

public class Operators {
	public static void operator1 () {
		int x = 20;
		String sup = (x<15)?"small": (x<22)? "tiny":"huge";
		System.out.println(sup);
	}
	
	//Your speed in meters/second is 0.11691531 
	//Your speed in km/h is 0.42089513 
	//Your speed in miles/h is 0.26158804
	public void speed () {
		int s = 2500;
		int h = 5;
		int min = 56;
		int sec = 23;
		float metpers = (s/(h*60*60f+ min*60f+sec));
		float kmperh = (s/1000f/(h+ min/60f+sec/60f/60f));
		float milespers = (s/1609f/(h+ min/60f+sec/60f/60f));
		System.out.println("Your speed in km/h is " + kmperh);
		System.out.println("Your speed in meters/second is " + metpers);
		System.out.println("Your speed in milespers is " + milespers);
	
		
	}	
/*	Write a Java program that accepts two integers from the user 
 and then prints the sum, the difference, the product, the average, the distance (the difference between integer),
 the maximum (the larger of the two integers), the minimum (smaller of the two integers). 
	
	Test Data 
	Input 1st integer: 25 
	Input 2nd integer: 5
	Expected Output :
	Sum of two integers: 30
	Difference of two integers: 20
	Product of two integers: 125
	Average of two integers: 15.00
	Distance of two integers: 20
	Max integer: 25 
	Min integer: 5*/
	
	public void twointeger () {
	    System.out.println( "Please insert 2 Integer");
		Scanner scan = new Scanner (System.in); 
		System.out.print( "Integer 1: \n");
		int integer1= scan.nextInt();
		System.out.println( "Integer 2: \n");
		int integer2= scan.nextInt();
		System.out.println("Sum of two integers: "+ (integer1+ integer2));
		System.out.println("Difference of two integers: "+ Math.abs(integer2-integer1));
		System.out.println("Product of two integers: "+ (integer2*integer1));
		System.out.println("Average of two integers: "+ (integer2+integer1)/2);
		System.out.println("Distance of two integers: "+ (integer2-integer1)/2);
		System.out.println("Max integer: "+ Math.max(integer1, integer2));
		System.out.println("Max integer: "+ Math.min(integer1, integer2));
		
		/*Write a Java program to break an integer into a sequence of individual digits. 
		Test Data
		Input six non-negative digits: 123456
		Expected Output :
		1 2 3 4 5 6
		*/
		
	}
	/**
	 * bài 2
	 */
	
		public void breakInteger() {
		//int a = 123456;
		Scanner input = new Scanner (System.in); System.out.println("Input six non-negative digits:");
		int a = input.nextInt();
		System.out.print(a/100000%10+  " ");
		System.out.print(a/10000%10+  " ");
		System.out.print(a/1000%10+  " ");
		System.out.print(a/100%10+  " ");
		System.out.print(a/10%10+  " ");
		System.out.print(a/1%10+  " ");
		
		}
		
		
		/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16*/
		public void tinhtong() {
			Scanner input = new Scanner (System.in); System.out.println("input an integer between 0 and 1000: ");
			int n = input.nextInt();
			if (n<10) {
				System.out.println("The sum of all digits in"+ n+" is " + n);
			}	
			else if (10<=n&&n<100) {
				System.out.println("The sum of all digits in"+ n+" is " + (n/10+n/10%10));
			}
			else if (100<=n&&n<1000) {
				System.out.println("The sum of all digits in"+ n+" is " + (n/100+n/10%10+n%10));
			}
			else {
				System.out.println("This is a not valid number for this programing");
			}
				
		}
		
		/*solution - cách 2: n = a| ab| abc
int n => convert n sang String n_as_string= “abc”
dùng charAt() để lấy từng kí tự trong string n_as_string: ép kiểu từng kí tự về int, thực hiện phép cộng.
*/
		/*public void tinhtong2() {
		Scanner scan = new Scanner (System.in); System.out.println("input an integer between 0 and 1000: ");
		int n = scan.nextInt();
		if (n<10) {
			String n_as_string = "n"; System.out.println("n");		
		}
		else if (10<=n && n<100)
			
		
		}*/
		
		
//		
	}
	





