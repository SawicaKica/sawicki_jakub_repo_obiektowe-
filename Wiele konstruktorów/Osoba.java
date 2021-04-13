class Osoba{
	private String imie = "John";
	private String nazwisko = "Doe";
	private int waga = 0;
	private int wzrost = 0;
	
	//Nie znamy imienia i nazwiska
	public Osoba(int wzrost, int waga){
		this.wzrost = wzrost;
		this.waga = waga;
	}
	//Nie znamy wzrostu ani wagi
	public Osoba(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	//wiemy wszystko
	public Osoba(int wzrost, int waga, String imie, String nazwisko){
		this.wzrost = wzrost;
		this.waga = waga;	
		this.imie = imie;
		this.nazwisko = nazwisko;	
	}
	
	
	@Override
	public String toString(){
		return imie+" "+nazwisko+"\nwaga = "+waga+"\nwzrost = "+wzrost+"\n\n";
	}
}