
public class Main {
	
	public static void main(String [] args ) {
		System.out.println("starting");
		
		Dog dog = new Dog();
		dog.setName("my dog");
		
		Cat cat = new Cat();
		cat.setName("my cat");
		
		dog.setAge(10);
		cat.setAge(3);
		
		Bird bird = new Bird();
		bird.setName("my bird");
		
		dog.sound();
		cat.sound();
		bird.sound();
		
		Movements move = dog;
		Movements m = new Bird();
		
		move.forward();
		m.forward();
		
	}
	
}
