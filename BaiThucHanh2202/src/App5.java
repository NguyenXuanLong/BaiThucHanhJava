import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so duong a = ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            System.out.println(a + " là so hoan thien");
        }
        else {
            System.out.println(a + " khong phai la so hoan thien");
        }
    }
}