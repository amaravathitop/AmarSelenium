package week1.day2;

public class FibonacciSerious {
  public static void main(String[] args) {
	 //Fibo – 0, 1, 1, 2, 3, 5, 8, and 13.
	 int fibInit=0;
	 int fibStart=1;
	 int fibNo;		
	 System.out.println(fibInit);
	 System.out.println(fibStart);
	 
	for (int i = 0; i <=5; i++) {
		fibNo=fibInit+fibStart;
		System.out.println(fibNo);
		fibInit=fibStart;
		fibStart=fibNo;
	}
} 
}
