import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, sum = 0;
        do {
            System.out.print("Nhap vao so nguyen bat ky: ");
            a = sc.nextInt();
            sum += a;
            if (sum > 100)
                break;    
        } while (a > 0);
        System.out.print("Tong cac so nguyen vua nhap = " + sum);

    }
}