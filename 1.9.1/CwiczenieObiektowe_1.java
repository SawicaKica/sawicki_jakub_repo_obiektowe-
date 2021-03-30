
class CwiczenieObiektowe_1{
	public static void main(String[] args){
		MojeDane md = new MojeDane("Jakub", "Sawicki", "2PTN");
		System.out.print("Imie: "+md.imie+"\n"+"Nazwisko: "+md.nazwisko+"\n"+"Klasa: "+md.klasa);
	
		Logowanie lg = new Logowanie("Commiter95", "Haslo123");
		System.out.println("\n\n"+lg.toString());
		
        Kolo k1 = new Kolo(4);
        System.out.println("\n\nPole: "+k1.pole_kola()+"     Obwod kola: "+k1.obwod_kola());
		
        Kolo k2 = new Kolo(20);
        System.out.println("\n\nPole: "+k2.pole_kola()+"     Obwod kola: "+k2.obwod_kola());
	}
}