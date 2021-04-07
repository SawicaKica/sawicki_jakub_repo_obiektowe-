class SawickiJakub{
	public static void main(String[] args){
		Sprawdzian sp = new Sprawdzian("07.04.2021", 6, "Programowanie Obiektowe");
		System.out.print("Wynik dzialania \n"+sp.data+"\n"+sp.ocena+"\n"+sp.nazwaPrzedmiotu);
	
		Dane dn = new Dane("Jakub", "Sawicki", "13.03.2004");
		System.out.println("\n\n"+dn.toString());
	}
}