import java.util.ArrayList;


public class EgitimGorevlisi {
	//FIELDS
	String fullName;
	int age;
	ArrayList <String> classList;
	//CONSTRUCTORS
	EgitimGorevlisi(){
		this.classList = new ArrayList<String>();
		System.out.println("Egitim Gorevlisi() Constructor!!!");
	}		
	EgitimGorevlisi(String N,int A){
		this.fullName=N;
		this.age=A;
		this.classList = new ArrayList<String>();
		System.out.print("Egitim Gorevlisi(N,A) Constructor!!!");
	}
	//METHODS
	public void addClass(String C){
		classList.add(C);
	}
	
	public void printAll(){
		System.out.println(this.fullName+" Age: "+this.age);
		System.out.print("Classes given by this lecturer: ");
		for(int i =0;i<classList.size();i++){
			if(i!=classList.size()-1){
				System.out.print(classList.get(i)+",");
			}
			else{
				System.out.println(classList.get(i)+".\n");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EgitimGorevlisi Mehmet=new EgitimGorevlisi("Mehmet Caglar",20);
		//Asistan Cagri = new Asistan("Cagri Benli",23);
		//Profesor Bora = new Profesor("Bora Kirca",23);
		UcanHoca Tolga =new UcanHoca("Tolga Can",30,"METU");
		Tolga.addTA("Caglar", 20);
		/*Mehmet.addClass("EEE-242");
		Mehmet.addClass("MAT-260");
		Mehmet.printAll();
		Bora.addClass("CNG-230");
		Bora.addClass("CNG-140");
		Bora.addClass("CNG-100");
		Cagri.addClass("CNG-230");
		Cagri.addClass("CNG-140");
		Cagri.addClass("CNG-100");
		Cagri.printAll();
		Bora.addTA(Cagri);
		Bora.printAllwithTA();*/
	}

}
