
class TablicaDwuwymiarowa{
    public static void main(String [] args){ 
        int [] tab = new int[5];
        tab[0] = 40;
        for(int i=0;i<tab.length()i++){
            System.out.println(tab[i]);
        }    
        int[][] tab2b = new int[5][2]; 
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;  
        for (int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(tab2d[i][0]+" "+tab2d[i][1]);
            }
            System.out.println("Koniec pętli ze zmienna j");
        }
        System.out.println("Koniec pętli ze zmienną i");
    }
}