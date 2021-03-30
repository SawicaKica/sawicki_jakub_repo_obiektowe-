
class CwiczenieObiektowe_1{
	public static void main(String[] args){
		MojeDane md = new MojeDane("Jakub", "Sawicki", "2PTN");
		System.out.print("Imie: "+md.imie+"\n"+"Nazwisko: "+md.nazwisko+"\n"+"Klasa: "+md.klasa);
	
		Logowanie lg = new Logowanie("Commiter95", "Haslo123");
		System.out.println("\n\n"+lg.toString());
		
        Kolo k1 = new Kolo(4);
        System.out.println("\n\nPole kola: "+k1.pole_kola()+"     Obwod kola: "+k1.obwod_kola());
		
        Kolo k2 = new Kolo(20);
        System.out.println("\n\nPole kola: "+k2.pole_kola()+"     Obwod kola: "+k2.obwod_kola());
		
		Kwadrat kw = new Kwadrat(10);
		System.out.println("\nPole kwadratu: "+kw.pole_kwadratu()+"     Obwod kwadratu: "+kw.obwod_kwadratu());
		
        Prostokat p = new Prostokat(6, 2);
        System.out.println("\nPole prostokatu: "+p.pole_prostokatu()+"    Obwod prostokatu: "+p.obwod_prostokatu());	
	}
}