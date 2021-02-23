import java.util.Random;
import java.io.*;
import java.util.Scanner;
class Tablice{
	public static void main(String [] a){
		Random r = new Random();
		try{
			Scanner sc = new Scanner(new File("Uczniowie.txt"));
			int i = Integer.parseInt(sc.nextLine());
			while(sc.hasNext()){
                System.out.println(i);
            }
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }
		int oceny[] = new int[10];
        for (int i=0;i<oceny.length;i++){
            oceny[i] = r.nextInt(6) +1;
        }
		String nazwa[] = {"Jakub Sawicki","Tomasz Stepien","Szymon Rychter","Pawel Domagala","Franek Mierzwiak","Mateusz Jagiela","Kamil Ociepa","Maciej Szczypta","Maciej Kolpaczek","Michal Zuterek"};
	    for(int i=0;i<nazwa.length;i++){
            System.out.println(nazwa[i]+" ocena: "+oceny[i]);
        }	
	}
}