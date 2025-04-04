package week1.day2;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input=110011;
        int original=input;
        int reverse=0;
        for (int i = input; i>0; i/=10)
           {
           int output=i%10;
            reverse=reverse*10+output;
			}
         if(original==reverse)
         {
			System.out.println("palindrome");
		 }
         else
         {
        	 System.out.println("not palindrome"); 
         }
	}

}
