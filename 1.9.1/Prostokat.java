class Prostokat{
	private double bok1 = 0;
	private double bok2 = 0;
	
	public Prostokat(double bok1, double bok2){
		this.bok1 = bok1;
		this.bok2 = bok2;
	}
	
	public double pole_prostokatu(){
		return bok1*bok2;
	}
	
	public double obwod_prostokatu(){
		return 2*(bok1+bok2);
	}
}