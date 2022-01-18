import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a1, b1, c1, a2, b2, c2;
        float D, Dx, Dy, x, y;
        System.out.print("Nhap a1 = ");
        a1 = sc.nextInt();
        System.out.print("Nhap b1 = ");
        b1 = sc.nextInt();
        System.out.print("Nhap c1 = ");
        c1 = sc.nextInt();
        System.out.print("Nhap a2 = ");
        a2 = sc.nextInt();
        System.out.print("Nhap b2 = ");
        b2 = sc.nextInt();
        System.out.print("Nhap c2 = ");
        c2 = sc.nextInt();
        // Giải hệ phương trình bậc nhất bằng phương pháp Cramer
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx + Dy == 0){
            System.out.println("He phuong trinh co vo so nghiem");
            }else
            System.out.println("He phuong trinh vo nghiem");
        }
        else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("He PT co nghiem x = " + x + "y = " + y);
         }
    
    }
}

    

