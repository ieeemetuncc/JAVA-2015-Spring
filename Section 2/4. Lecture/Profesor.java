import java.util.ArrayList;


public class Profesor extends EgitimGorevlisi implements HocaIsleri{
	ArrayList<Asistan> TAList;
	Profesor(){
		super();
		this.TAList = new ArrayList<Asistan>();
		System.out.println("Profesor() Constructor!!!");
	}
	Profesor(String N,int A){
		super(N,A);
		this.TAList = new ArrayList<Asistan>();
		System.out.println("Profesor(N,A) Constructor!!!");
	}
	public void addTA(String N,int A){
		this.TAList.add(new Asistan(N,A));
	}
	public void addTA(Asistan A){
		this.TAList.add(A);
	}
	public void printAllwithTA(){
		this.printAll();
		System.out.print("Teaching Assistants assigned to this lecturer: ");
		for(int i =0;i<TAList.size();i++){
			TAList.get(i).printAll();
		}
	}
	@Override
	public void SinavHazirla() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SinavOku() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SinavAcikla() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DersAnlat() {
		// TODO Auto-generated method stub
		
	}
}
