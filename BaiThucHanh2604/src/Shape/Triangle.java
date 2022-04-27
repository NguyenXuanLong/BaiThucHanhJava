package Shape;

public class Triangle  {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(float hoanhdo1, float tungdo1, float hoanhdo2, float tungdo2, float hoanhdo3, float tungdo3) {
        a = new Point(hoanhdo1, tungdo1);
        b = new Point(hoanhdo2, tungdo2);
        c = new Point(hoanhdo3, tungdo3);
    }
    
   

    public double getLength(Point a, Point b) {
        return Math.sqrt(Math.pow(b.gethoanhdo() - a.gethoanhdo(), 2) + Math.pow(b.gettungdo() - a.gettungdo(), 2));
    }

    public void checkTriangle() {
        double A = getLength(a, b);
        double B = getLength(a, c);
        double C = getLength(b, c);
        if ((A + B) > C && (A + C) > B && (B + C) > A) {
            if (A == B && A == C) {
                System.out.println("Tam giac deu!");
            } else if (Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2) ||
                    Math.pow(A, 2) + Math.pow(C, 2) == Math.pow(B, 2) ||
                    Math.pow(B, 2) + Math.pow(C, 2) == Math.pow(A, 2)) {
                System.out.println("Tam giac vuong");
            } else
                System.out.println("Tam giac thuong");
        } else
            System.out.println("Khong tao thanh tam giac!");
    }

}
