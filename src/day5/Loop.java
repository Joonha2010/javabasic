package day5;

public class Loop {
	//ex1.
	public void inmang () {
		//khai bao mang
		//Byte [] a;
		//khoi tao mang a
		// a= new byte [5] ;
		//neu tai thoi diem tao mang da biet so phan tu thi minh se gop  phan khoi tao va khaiboa vao cung 1 dong
		byte [] a = new byte []{1,3,5,7,9};
		 for (int i = 0; i<a.length; i++) {
			 System.out.println("phan tu thu " +(i+1) + " la "+ a[i]);
		 }
		
	}
	
	public void sumandAverage () {
		int tong = 0;
		for (int i = 1; i<=100; i++) {
			tong = tong + i;
		}
		
		System.out.println("tong la " + tong);
		System.out.println("abs " +  tong/100f);
	}
	
	public void sumAndAverageEx2 () {
		int tong = 0;
		for (int i = 111; i <= 8899; i++) {
			tong = tong + i;
		}
		System.out.println("tong = " + tong );
		System.out.println("trung binh= " + tong/(8899-111f));
	}
	
	
	/**
	 * Modify the program to sum only the odd numbers from 1 to 100, and compute the average. (HINTS: n is an odd number if n % 2 is not 0.)

	 */
	public void sumOdd () {
		int tong = 0; int count = 0;
		for (int i = 1; i<100; i++) {
			if (i%2 ==1) {
				tong = tong + i;
				count ++;
			}
			
		}
		System.out.println("so le = " + tong);
		System.out.println("trung binh = " + (float)(tong/count));
		
	}
	
	
	
	/**
	 * Modify the program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
	 */
	
	public void divisibleSeven () {
		int sum7 = 0;
		for (int i=1; i>0 && i<=100; i++) {
			if (i%7 == 0) {
			sum7=sum7+i;		
			} 		
		}
		System.out.println(sum7);
	}
	
	/**
	 * Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.

	 */
	public void sumoftheSquares () {
		int sumsquare = 0;
		int square = 0;
		for (int i = 1; i>0 &&i<=100; i++) {
			square = i*i;
			sumsquare = sumsquare + square;			
		}
		System.out.println(sumsquare);
	}
	
	
	
	/**
	 * (*) Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000. 
	 * The program shall compute the sum from left-to-right as well as from the right-to-left. 
	 * Obtain the difference between these two sums and explain the difference. Which sum is more accurate?
Harmonic (n) = 1 + ½ + 1/3 +1/4 + …. + 1/n
	 */
	public void harmonisSum () {
		float lharmonic = 0; 
		for (int n=1; n<=50000; n++) {
			lharmonic = lharmonic + (float)1/n; 
			}
		System.out.println("left to right= " + lharmonic);
		
		float rharmonic = 0;
		for (int i = 50000; i<=50000&&i>0; i--) {
			rharmonic = rharmonic + (float)1/i;
		}
		System.out.println("right to left= " + rharmonic);
		System.out.println("Same result");
	}
	
/**
 * (*) Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for-loops.
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #

 */
	public void squareBoard (int n) {
		for (int i = 0; i<=n; i++) {
			for (int j = 0; j<= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
		
	/**
	 * Write a program called CheckerBoard that displays the following n×n (n=7) checkerboard pattern using two nested for-loops.
# # # # # # #
 # # # # # # #
# # # # # # #
 # # # # # # #
# # # # # # #
 # # # # # # #
# # # # # # #
	 */
	
	public void squareBoard2 (int n) {
		
	for (int i = 0; i<=n; i++) {
			for (int j = 0; j<=n; j++) {
				if (j%2==0) {
						
						System.out.print("# ");
						System.out.print(" ");
				}
				else 
					System.out.print("#");
				
				
			}
			System.out.println();
		}
				
	}
	
	/**[While] Cho 1 chuỗi “Hello World”, Viết hàm tìm kí tự “r” trong chuỗi,
	 *  nếu tìm thấy kí tự đầu tiên in ra chỉ số của “r”, 
	 * nếu không, in ra “không tìm thấy”.
	 * 
	 */public void findletterr () {
		 string s = "Hello world";
		 while (int i <= s.size ()) {
			 System.out.println("r");
			 
		 }
	 }
	
	
	
	
	}
