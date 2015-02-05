import java.util.Scanner;

public class upper_in {
	public static void main (String args[]){
		Scanner ng = new Scanner(System.in);
		
		System.out.println("Input your string");
		String a = ng.nextLine();
		
		a = a.toUpperCase();
		
		for(int i=0; i<100; i++){
			System.out.println(a);
		}
		
	}
}
