
class CwiczenieObiektowe_1{
	public static void main(String[] args){
		MojeDane md = new MojeDane("Jakub", "Sawicki", "2PTN");
		System.out.print("Imie: "+md.imie+"\n"+"Nazwisko: "+md.nazwisko+"\n"+"Klasa: "+md.klasa);
	
		Logowanie lg = new Logowanie("Commiter95", "Haslo123");
		System.out.println("\n\n"+lg.toString());
	}
}