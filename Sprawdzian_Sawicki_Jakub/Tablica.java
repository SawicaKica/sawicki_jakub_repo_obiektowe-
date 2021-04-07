import java.util.Random;
class Tablica{
	public int[] tablica = new int[10];
	
	public tablica(){
		Random r = new Random();
		for(int i=0;i<10;i++){
			tab[i] = r.nextInt(21)-10;
		}
	}
}