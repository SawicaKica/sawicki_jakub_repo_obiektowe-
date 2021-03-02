class Dwuwymiarowa{
    public static void main(String [] args){
		tablicaMnozenia();
	}
	private static void tablica2x2(){
		int[][] tab = new int[2][2];
        	tab[0][0] = 1;
		tab[0][1] = 2;
		tab[1][0] = 3;
		tab[1][1] = 4;
		for (int i=0;i<tab.length;i++){
<<<<<<< HEAD
            for(int j=0;j<tab[i].length;j++){
                System.out.println(tab[i][j]);			
			}
		}
	}
	private static void tablicaMnozenia(){
        int  tab [][] = new int[10][10];
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab [i][j] = (i+1)*(j+1);
            }
        }
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }
=======
            		for(int j=0;j<tab[i].length;j++){
                		System.out.println(tab[i][j]);			
			}
		}
	}
}

>>>>>>> 72ea90a03d3b52e8792194f9c9e4fd99daaf0a82
