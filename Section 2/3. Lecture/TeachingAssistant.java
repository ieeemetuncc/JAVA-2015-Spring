import java.util.ArrayList;


public class TeachingAssistant {
	//FIELDS
	private String Name;
	private String Nationality;
	private ArrayList<String> classList;
    // CONSTRUCTORS
	TeachingAssistant(){}
	TeachingAssistant(String N,String N2){
		this.Name = N;
		this.Nationality = N2;
		this.classList = new ArrayList<String>();
	}
	//GETTER AND SETTERS
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
	public ArrayList<String> getClassList(){
		return this.classList;
	}
	public void setClassList(ArrayList<String> cl){
		this.classList = cl;
	}
	//OTHER METHODS
	public void addLecture(String L){
		this.classList.add(L);
	}
	public void printAll(){
		System.out.println("Teaching Assitant Information");
		System.out.println("Name: "+this.Name);
		System.out.println("Nationality: "+this.Nationality);
		int listSize = classList.size();
		
		System.out.print("Lectures: ");
		if(listSize != 0){
			int i;
			for(i= 0;i<listSize;i++){
				if(i != listSize-1)
				System.out.print(classList.get(i) +", ");
				else
					System.out.print(classList.get(i) +".");
					
			}
		}
		else{
			System.out.print("No lectures found!");
		}
		System.out.println("");
	}
}
