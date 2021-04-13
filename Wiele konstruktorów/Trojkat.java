class Trojkat{
	
	public Trojkat(double a,double wysokosc ){
		System.out.println("Prostokatny: "+(a*wysokosc/2));
    }

	public Trojkat(double a){
		System.out.println("Rownoboczny: "+((a*a)*Math.pow(a, 1/3))/4);
	}
}