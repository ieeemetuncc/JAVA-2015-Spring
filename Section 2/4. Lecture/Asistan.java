
public class Asistan extends EgitimGorevlisi{
	boolean isMasterStudent=true;
	Asistan(){
		super();
		System.out.println("Asistan() Constructor!!!");
	}
	Asistan(String N,int A){
		super(N,A);
		System.out.println("Asistan(N,A) Constructor!!!");
	}
}
