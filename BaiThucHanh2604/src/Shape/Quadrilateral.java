package Shape;
public class Quadrilateral {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Quadrilateral(float hoanhdo1, float tungdo1, float hoanhdo2, float tungdo2, float hoanhdo3, float tungdo3, float hoanhdo4, float tungdo4) {
        a = new Point(hoanhdo1, tungdo1);
        b = new Point(hoanhdo2, tungdo2);
        c = new Point(hoanhdo3, tungdo3);
        d = new Point(hoanhdo4, tungdo4);
    }
    public double getLength(Point a, Point b){
		return Math.sqrt(Math.pow(b.gethoanhdo() - a.gethoanhdo(), 2) + Math.pow(b.gettungdo() - a.gettungdo(), 2));
	}
    public void checkQuadrilateral(){
        double A = getLength(a, b);
        double B = getLength(b, c);
        double C = getLength(c, d);
        double D = getLength(d, a);
        if(Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2)&& Math.pow(A, 2) + Math.pow(C, 2) == Math.pow(B, 2)&& Math.pow(B, 2) + Math.pow(C, 2) == Math.pow(A, 2)){
            if (A==B && A==C && A==D){
                System.out.println("Hinh vuong");
            }
            else System.out.println("Hinh chu nhat");
        } else System.out.println("Tu giac!");

    }
    
}
