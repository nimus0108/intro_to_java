import java.util.Scanner;

public class nim {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int p1=9, p2=9, p3=9;
		while(p1!=0 || p2!=0 || p3!=0){
			System.out.println("Pile 1: " + p1);
			System.out.println("Pile 2: " + p2);
			System.out.println("Pile 3: " + p3);
			
			System.out.println("From which pile would you like to take?");
			int tpile = scan.nextInt();
			
			System.out.println("How many would you like to take?");
			int tstone = scan.nextInt();
			
			if (tpile == 1){
				p1 -= tstone; 
			} else if (tpile == 2){
				p2 -= tstone;
			} else if (tpile == 3){
				p3 -= tstone;
			}	
			
			System.out.println("Taking " + tstone + " from " + tpile);
			
			if (p1==0 && p2==0 && p3==0){
				System.out.println("You lose!");
			}
			
		}
		
	}
}