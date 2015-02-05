import java.util.Scanner;

public class averageInputs {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers that you "
				+ "want to be averaged. Enter '0' (zero) "
				+ "when you have finished entering numbers");
		
		double i=1;
		int a=0;
		double add=0;
		
		while(i!=0){
			i = input.nextInt();
			add += i;
			a++;
		}
		a= a-1;
		double avg = add/(a);
		System.out.println(avg);
		
		
		input.close();
	}	
}
