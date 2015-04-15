
public class StringExample {
	
	public static void main (String [] args ) {
		
		String name = "Ugur";
		String surname = "Ugur";
		
		if ( name == surname ) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		
		
		if ( name.equals(surname) ) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
	}
	
}
