
public class LiseOgretmeni extends InsanAktiviteleri implements HocaIsleri {
	public void SinavHazirla(){
		System.out.println("Sinav Hazirlandi!");
	}

	@Override
	public void SinavOku() {
		// TODO Auto-generated method stub
		System.out.println("Sinavlar okundu!");
		
	}

	@Override
	public void SinavAcikla() {
		// TODO Auto-generated method stub
		System.out.println("Sonuclar aciklandi!");
		
	}

	@Override
	public void DersAnlat() {
		// TODO Auto-generated method stub
		System.out.println("Bla Bla...");
		
	}
	public void Ol(){
		System.out.print("Olduk");
	}
}
