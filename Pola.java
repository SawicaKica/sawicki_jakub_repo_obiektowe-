import java.util.Scanner;
import java.io.*;
public class Pola{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Obliczenia();
		String exit = "";
		while(!exit.equals("exit")){
			System.out.print("\n");
			System.out.print("Kontynuowac?: [Tak][Exit] ");
			String ing = sc.next();
			if(ing.equals("Tak")){
				Obliczenia();
			}else if(ing.equals("Exit")){
				System.exit(0);
			}
		}
	}
	private static void kwadrat(int kw){ //Zapis do pliku "kwadrat.txt"
		File kwadrat = new File("kwadrat.txt");
		int poleKw = kw*kw;
		int obwodKw = 4*kw;
		String kwad = "";
		for(int i=0;i<kw;i++){
			for(int j=0;j<kw;j++){
				kwad += "*";
			}
			kwad += "\n";
		}
		try{
			FileWriter k = new FileWriter(kwadrat, true);
			k.write("\n"+kwad+"Pole kwadratu: "+poleKw+", obwod kwadratu: "+obwodKw+"\n");
			k.close();
		}catch(IOException e){
			System.out.println("BLAD: "+e.toString());
		}
	}
	private static void prostokat(int pk1,int pk2){ //Zapis do pliku "prostokat.txt"
		File prostokat = new File("prostokat.txt");
		int polePr = pk1*pk2;
		int obwodPr = 2*(pk1+pk2);
		String prost = "";
		for(int i=0;i<pk1;i++){
			for(int j=0;j<pk2;j++){
				prost += "*";
			}
			prost += "\n";
		}		
		try{
			FileWriter p = new FileWriter(prostokat, true);
			p.write("\n"+prost+"Pole prostokata: "+polePr+", obwod prostokata: "+obwodPr+"\n");
			p.close();
		}catch(IOException e){
			System.out.println("BLAD: "+e.toString());
		}
	}
	private static void Obliczenia(){ //Dane wejsciowe 
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj [kwadrat][prostokat]: ");
		String figura = sc.next();
		if(figura.equals("kwadrat")){
			System.out.print("Podaj dlugosc boku: ");
			int kw = sc.nextInt(); 
			while(kw <= 0){
				System.out.print("Podaj dlugosc boku: ");
				kw = sc.nextInt(); 	
			}
			String kwad = ""; //figury
			for(int i=0;i<kw;i++){
				for(int j=0;j<kw;j++){
					kwad += "*";
				}
				kwad += "\n";
			}
			System.out.print(kwad);
			System.out.print("Pole kwadratu: "+kw*kw+", obwod kwadratu: "+4*kw);
			kwadrat(kw);
		}else if(figura.equals("prostokat")){
			System.out.print("Podaj dlugosc boku a: ");
			int pk1 = sc.nextInt();
			while(pk1 <= 0){
				System.out.print("Podaj dlugosc boku a: ");
				pk1 = sc.nextInt(); 	
			}
			System.out.print("Podaj dlugosc boku b: ");
			int pk2 = sc.nextInt();			
			while(pk2 <= 0){
				System.out.print("Podaj dlugosc boku b: ");
				pk2 = sc.nextInt(); 	
			}
			String prost = ""; //figury
			for(int i=0;i<pk1;i++){
				for(int j=0;j<pk2;j++){
					prost += "*";
				}
				prost += "\n";
			}
			System.out.print(prost);
			System.out.print("Pole prostokata: "+pk1*pk2+", obwod kwadratu:"+2*(pk1+pk2));
			prostokat(pk1, pk2);
		}		
	}
}
