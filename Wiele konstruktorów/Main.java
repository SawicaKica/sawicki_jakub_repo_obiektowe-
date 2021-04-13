class Main{
	public static void main(String[] args){
		Osoba o1 = new Osoba(177, 80);
		System.out.println(o1);
		
		Osoba o2 = new Osoba("Jakub", "Sawicki");
		System.out.println(o2);
		
		Osoba o3 = new Osoba(199, 90, "Jakub", "Sawicki");
		System.out.println(o3);
		
        Trojkat t1 = new Trojkat(1,6);
        Trojkat t2 = new Trojkat(3);
	}
}