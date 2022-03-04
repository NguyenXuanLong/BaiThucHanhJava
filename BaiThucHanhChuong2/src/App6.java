import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen bat ky: ");
        int a = sc.nextInt();
        long giaithua = 1;
        for (int i = 1; i <= a; i++) {
            giaithua = giaithua * i;
        }
        System.out.println("Giai thừa của " + a + " là: " + giaithua);
        System.out.println();
    }
    
}
