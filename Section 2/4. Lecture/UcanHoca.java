
public class UcanHoca extends Profesor{
	String school;
	UcanHoca(){
		super();
		System.out.println("UcanHoca() Constructor!!!");
	}
	UcanHoca(String N,int A){
		super(N,A);
		System.out.println("UcanHoca(N,A) Constructor!!!");
	}
	UcanHoca(String N,int A,String S){
		super(N,A);
		this.school=S;
		System.out.println("UcanHoca(N,A,S) Constructor!!!");
	}
}
