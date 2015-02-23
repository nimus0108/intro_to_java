import java.text.DecimalFormat;
import java.util.Scanner;

public class retirement_planner{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		int save, years;
		double earnings;
		double cStarting=0, cDeposit = 0, cEarnings=0, cEnding;

		System.out.println("Amount of money you plan of saving each year:");
		save = Integer.parseInt(scan.nextLine());
		System.out.println("The number of years until retirement:");
		years = Integer.parseInt(scan.nextLine());
		System.out.println("Projected annual earnings:");
		earnings = Double.parseDouble(scan.nextLine());
		
		System.out.println(String.format("%4s %13s %12s %13s %13s", "Year", "Starting", "Deposit", "Earnings", "Ending"));
		
		cEnding = 0;
		for(int i=0; i<years; i++){
			cStarting = cEnding;
			cDeposit = save;
			cEarnings = cStarting*earnings/100;
			cEnding = cStarting+cEarnings+cDeposit;
			
			
			
			System.out.printf("%4d %13.2f %12.2f %13.2f %13.2f\n", i, cStarting, cDeposit, cEarnings, cEnding);
		}
	}
}