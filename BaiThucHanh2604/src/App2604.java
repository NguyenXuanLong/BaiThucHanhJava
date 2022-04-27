import Shape.Point;
import Shape.Triangle;
import Shape.Quadrilateral;
public class App2604 {
    public static void main(String[] args) {
        Point point = new Point("A", 2,3);
        point.xuatdiem();
        System.out.println("=====================");
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);
        Point d = new Point(4, 5);
        Triangle tria = new Triangle(a, b, c);
        Quadrilateral quad = new Quadrilateral(a, b, c, d);
        a.xuatdiem();
        b.xuatdiem();
        c.xuatdiem();
        d.xuatdiem();
        tria.checkTriangle();
        quad.checkQuadrilateral();
        
    }
}
