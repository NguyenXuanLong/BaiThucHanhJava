import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n, soDu, tong = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen duong: ");
        n = sc.nextInt();
         
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
            }
         
    System.out.println("Tong cac chu so = " + tong);

    }
}
