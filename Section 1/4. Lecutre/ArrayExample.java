import java.util.Scanner;


public class ArrayExample {

	public static void main (String [] args ) {
		
		int [] myArray = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0 ; i < myArray.length ; i++) {
			myArray[i] = scanner.nextInt();
		}
		
		System.out.println("Average will be calculated.");
		
		int sum = 0;
		
		for (int a : myArray) {
			sum += a;
		}
		
		System.out.println("Average is :" + sum / 10f);
		
		
		
	}
	
}
