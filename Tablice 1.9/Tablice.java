import java.util.Random;
import java.io.*;
import java.util.Scanner;
class Tablice{
	public static void main(String [] a){
		try{
			Random r = new Random();			
			Scanner sc = new Scanner(new File("Uczniowie.txt"));
			int oceny[] = new int[10];
			for (int i=0;i<oceny.length;i++){
				while(sc.hasNext()){
					oceny[i] = r.nextInt(6) +1;
					String j = sc.nextLine();
					System.out.println(j+" ocena: "+oceny[i]);
				}
			}
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }	
	}
}
