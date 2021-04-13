class Main{
	public static void main(String[] args){
		Osoba o1 = new Osoba(177, 80);
		System.out.println(o1);
		
		Osoba o2 = new Osoba("Jakub", "Sawicki");
		System.out.println(o2);
		
		Osoba o3 = new Osoba(199, 90, "Jakub", "Sawicki");
		System.out.println(o3);
		
		Trojkat tr = new Trojkat(5, 4);
		System.out.println("Pole trojkata wynosi"+tr);
	}
}