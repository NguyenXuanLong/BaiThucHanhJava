import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so duong a = ");
        int a = sc.nextInt();
        System.out.print("Nhap so duong b = ");
        int b = sc.nextInt();
        System.out.println("USCLN cua " + a + " va " + b + " là: " + USCLN(a, b)); 
    }    
    public static int USCLN(int a, int b) {
        if (b == 0)
        return a;
        return USCLN(b, a % b);
    }
}
