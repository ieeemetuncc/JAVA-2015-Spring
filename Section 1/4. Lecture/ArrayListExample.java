import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> myList = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		while ( ( a = scanner.nextInt()) != -1 ) {
			myList.add(a);
		}
		
		System.out.println("Average will be calculated.");
		
		int sum = 0;
		
		for (int b : myList) {
			sum += b;
		}
		
		System.out.println("Average is :" + sum / myList.size());
		
	}
	
}
