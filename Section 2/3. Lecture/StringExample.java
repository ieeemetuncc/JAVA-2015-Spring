
public class StringExample {
	
	private int length;
    private char init;
    private String content; 
	StringExample(){}
	StringExample(int l2){
		this.length=l2;
	}

	StringExample(String s){
		this.content=s;
	}
	
	public void setLength(int L){
		this.length=L;
	}
	public char getInit(){
		return this.init;
	}
	public void setInit(char I){
		this.init=I;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String S){
		this.content=S;
	}
	public int getLength(){
		return this.length;
	}
	public void printAll(){
		System.out.println("Content: "+ this.content);
		System.out.println("Initial Character: "+ this.init);
		System.out.println("Length: "+ this.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String Name ="DoRuK"; 
		char initName = Name.charAt(0);
		int lengthName = Name.length();
		String lName = Name.toLowerCase();
		String uName = Name.toUpperCase();
		String doubleName = Name.concat(" ve Merve");
		int indexD = Name.indexOf('R');
		String Name2 = "Doruk";
		String lName2 = Name2.toLowerCase();
		int result = lName2.compareTo(lName);
		if(result == 0)
			System.out.print("Two strings are the same!");
		*/
		
		StringExample myString = new StringExample("Selam");
		myString.setLength(myString.getContent().length());
		myString.setInit(myString.getContent().charAt(0));
		myString.printAll();
		myString.length=12;
		myString.printAll();
	}

}
