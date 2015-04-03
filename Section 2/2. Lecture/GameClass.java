
public class GameClass {
	String Name;
	float Storage;
	String Firm;
	String Country;
	int PubYear;
	
	GameClass(){}
	GameClass(String N,String F, String C,int PY, float S){
		this.Name=N;
		this.Country=C;
		this.Firm=F;
		this.PubYear=PY;
		this.Storage=S;
		
	}
	void printSummary(){
		System.out.println(this.Name);
		System.out.println("Published by "+ this.Firm +" in "+this.Country + " in "+this.PubYear);
		System.out.println("Storage: "+ this.Storage + "Kb\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameClass SMB;
		SMB = new GameClass();
		SMB.Country="Japan";
		SMB.Firm = "Nintendo";
		SMB.PubYear=1985;
		SMB.Name="Super Mario Bros.";
		SMB.Storage=(float) 40.9;
		SMB.printSummary();
		GameClass Payday;
		Payday = new GameClass("Payday","Overkill","Sweden",2013,500);
		Payday.printSummary();
	}
	
	

}
