import java.util.Random;

class Tablice{
	public static void main(String [] a){
		Random r = new Random();
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