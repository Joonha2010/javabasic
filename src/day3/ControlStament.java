package day3;

import java.util.Scanner;

public class ControlStament {
	public void minutestodate () {
		Scanner scan = new Scanner (System.in);System.out.println("Input the number of minutes: ");
		int min = scan.nextInt();
		int year = min/60/24/365;
		int days = min/60/24%365;
		System.out.println(year +" year " + days +" days");
		
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

}
