class Kwadrat{
	private double bok = 0;
	
	public Kwadrat(double bok){
		this.bok = bok;
	}
	
	public double pole_kwadratu(){
		return bok*bok;
	}
	
	public double obwod_kwadratu(){
		return 4*bok;
	}
}