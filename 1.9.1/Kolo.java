class Kolo{
	private double liczba_pi = 3.1415;
	private double promien = 0;
	
	public Kolo(double promien){
		this.promien = promien;
	}
	public double pole_kola(){
		return liczba_pi*Math.pow(promien, 2);
	}
	public double obwod_kola(){
		return 2*liczba_pi*promien;
	}
}