import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        int a, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong a : ");
        a= sc.nextInt();
        while (a > 0) {
            a /= 10;
            count++; // tăng biến count lên 1
        }
        System.out.println("So nguyen tren co " + count+" chu so");
    }
}
