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
	private static void kwadrat(int kw){
		File kwadrat = new File("kwadrat.txt");
		int poleKw = kw*kw;
		int obwodKw = 4*kw;
		try{
			FileWriter k = new FileWriter(kwadrat, true);
			k.write("Pole kwadratu: "+poleKw+", obwod kwadratu: "+obwodKw+"\n");
			k.close();
		}catch(IOException e){
			System.out.println("BŁĄD: "+e.toString());
		}
	}
	private static void prostokat(int pk1,int pk2){
		File prostokat = new File("prostokat.txt");
		int polePr = pk1*pk2;
		int obwodPr = 2*(pk1+pk2);
		try{
			FileWriter p = new FileWriter(prostokat, true);
			p.write("Pole prostokata: "+polePr+", obwod prostokata: "+obwodPr+"\n");
			p.close();
		}catch(IOException e){
			System.out.println("BŁĄD: "+e.toString());
		}
	}
	private static void Obliczenia(){
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
			System.out.print("Pole prostokata: "+pk1*pk2+", obwod kwadratu:"+2*(pk1+pk2));
			prostokat(pk1, pk2);
		}		
	}
}
