import java.util.Random;
import java.util.Scanner;
import java.io.*;
class liczby{
    public static void main(String[] args){
		int czylos[] = new int[10]; 
		int ile[] = new int[10];
		int liczba = 0;
		try{
            Scanner sc = new Scanner(new File("czylosowac.txt"));
            Scanner sc2 = new Scanner(new File("ileliczb.txt"));            
			while(sc.hasNextInt()){
                czylos[liczba] = sc.nextInt();
				liczba++;
            }
            liczba = 0;
			while(sc2.hasNext()){
                ile[liczba] = sc2.nextInt();
				liczba++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }
		for(int i=0; i<10; i++){
			if(czylos[i] == 1){
				System.out.print("Losuje "+ile[i]+" liczb: ");
				for(int j=0; j<ile[i]; j++){
					System.out.print((int) (Math.random()*80+1)+" ");
				}
				System.out.println("");
			}else{
				System.out.println(" Wczytano liczbe 0, nie losuje liczby!");
			}
        }
    }
}