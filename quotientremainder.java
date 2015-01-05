import java.util.Scanner;
public class quotientremainder {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is the dividend?");
		String userDividend = input.nextLine();
		System.out.println("What is the divisor?");
		String userDivisor = input.nextLine();
		
		int dividend = Integer.parseInt(userDividend);
		int divisor = Integer.parseInt(userDivisor);
		
		int n = dividend/divisor;
		int remainder = dividend%divisor;
		
		System.out.println(dividend + " = " + divisor + " * " + n + " + " + remainder);
	}	
}
