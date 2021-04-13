class Trojkat{
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double h = 0;
    
    public Trojkat(double a,double b,double c,double h ){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    @Override
    public String toString(){
        return "Prostokatny: "+(a*h/2)+"\nrownoboczny: "+((a*a)*Math.pow(a, 1/3))/4;
    }
}