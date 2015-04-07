import java.util.ArrayList;


public class Professor {
	//FIELDS
	private String Name;
	private String Nationality;
	private ArrayList<TeachingAssistant> taList;
	//CONSTRUCTORS
	Professor(){}
	Professor(String N){
		this.Name =N;
	}
	Professor(String N,String N2){
		this.Name =N;
		this.Nationality =N2;
		this.taList = new ArrayList<TeachingAssistant>();
	}
	//GETTERS AND SETTERS
	public String getName(){
		return this.Name;
	}
	public void setName(String N){
		this.Name = N;
	}
	public String getNationality(){
		return this.Nationality;
	}
	public void setNationality(String N){
		this.Nationality = N;
	}
	public ArrayList<TeachingAssistant> gettaList(){
		return this.taList;
	}
	public void settaList(ArrayList<TeachingAssistant> tal){
		this.taList = tal;
	}
	
	public void addTA(TeachingAssistant ta){
		taList.add(ta);
	}
	
	public void printAll(){
		System.out.println("---Professor Information---");
		System.out.println("Name: "+this.Name);
		System.out.println("Nationality: "+this.Nationality);

		System.out.println("Teaching Assistant: ");
		int listSize = taList.size();
		if(listSize == 0){
			System.out.print("No TA found!");
		}
		else{
			int i;
			for(i=0;i<listSize;i++){
				taList.get(i).printAll();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeachingAssistant TA1 = new TeachingAssistant("Batuhan Gurer","T.C.");
		TeachingAssistant TA2 = new TeachingAssistant("Kemal Masera","K.K.T.C.");
		
		TA1.addLecture("MECH-113 (S1)");
		TA1.addLecture("MECH-113 (S2)");
		TA1.addLecture("MECH-114 (S4)");
		TA1.addLecture("MECH-114 (S6)");
		TA2.addLecture("MECH-205 (S1)");
		TA2.addLecture("MECH-100 (S4)");
		
		Professor P1 =new Professor("Murat Sonmez","T.C.");
		P1.addTA(TA1);
		P1.addTA(TA2);
		P1.printAll();
	}

}
