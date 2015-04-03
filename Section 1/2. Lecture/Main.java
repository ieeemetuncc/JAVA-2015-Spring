import java.util.Date;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		/*
		System.out.println("Starting the program:");

		Circle c = new Circle();
		c.setRadius(5);

		double alan = c.area();

		System.out.println(alan);

		Circle c2 = new Circle();
		c2.setRadius(10);
		System.out.println(c2.circumferences());
		
		*/
		
		/*
		TV tv = new TV();
		System.out.println("Brand is " + tv.getBrand());
		
		TV bekoTV = new TV();
		bekoTV.setBrand("BEKO");
		System.out.println("Brand is " + bekoTV.getBrand());
		
		TV bosch = new TV("BOSCH");
		System.out.println("Brand is " + bosch.getBrand());
		
		*/
		
		Date date = new Date();
		
		System.out.println(date.getTime());
		System.out.println(date);
		
		Random random = new Random();
		
		int i = random.nextInt();
		
		System.out.println(i);
		
		int j = random.nextInt(100);
		System.out.println(j);
		
		

	}
}
