class Dane{
	private String imie = "";
	private String nazwisko = "";
	private String dataUrodzenia = "";
	
	public Dane(String imie, String nazwisko, String dataUrodzenia){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}
	@Override
	public String toString(){
		return imie+" "+nazwisko+" urodzony "+dataUrodzenia;
	}
}