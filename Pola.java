import java.util.Scanner;
public class Pola{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj [kwadrat],[prostokat]: ");
		String figura = sc.next();
		if(figura.equals("kwadrat")){
			System.out.print("Podaj dlugosc boku: ");
			int kw = sc.nextInt();
			while(){
				System.out.print("test");
			}
		}else if(figura.equals("prostokat")){
			System.out.print("Podaj dlugosc boku a: ");
			int pk1 = sc.nextInt();
			System.out.print("Podaj dlugosc boku b: ");
			int pk2 = sc.nextInt();			
		}
	}
}